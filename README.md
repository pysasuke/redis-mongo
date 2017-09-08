redis-mongo
===
## 项目介绍
项目主要是在spring、springmvc、mybatis框架下对mysql、mysql双数据源、redis、mongo进行配置和操作测试

## 功能分类
- mysql增删改查
- mysql双数据源切换
- redis对String类型和Object类型进行缓存
- mongo插入与读取


## 项目结构
### java：代码
- core:双数据源配置相关类
- dao:数据库交互层
- entity:实体对象层
- util:redis相关工具类


### resources：配置文件
- mapping:mybatis与实体映射文件存放包
- application.xml:spring配置文件入口，加载spring-config.xml
- spring-mvc.xml:springmvc配置相关文件
- spring-config.xml:加载其他集成的配置文件
- spring-mybatis.xml：mybatis相关配置文件
- spring-mongo.xml：mongo相关配置文件
- spring-redis.xml：redis相关配置文件
- db.properties：数据库相关参数配置
- log4j.properties：日志相关参数配置
- redis.properties:redis相关参数配置


### webapp：web相关
- web.xml

##　其他文件
### logs：日志存放
### deploy：部署文件(sql)
- update.sql

### test:测试包
- doubleMysql:双数据源测试包
```
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml") //加载xml文件
public class TestDoubleMysql {
    @Autowired
    private ImuserMapper imuserMapper;

    @Autowired
    private TuserMapper tuserMapper;

    @Test
    public void test() {
        IMUser imUser = generateIMUser();
        DataSourceContextHolder.setDBType(DataSourceType.DB_IM);
        int row_im = imuserMapper.insert(imUser);
        Assert.assertEquals(1, row_im);
        DataSourceContextHolder.clearDBType();

        Tuser tuser = generateTuser();
        DataSourceContextHolder.setDBType(DataSourceType.DB_ERP);
        int row_t = tuserMapper.insert(tuser);
        Assert.assertEquals(1, row_t);
        DataSourceContextHolder.clearDBType();
    }

    private IMUser generateIMUser() {
        IMUser imUser = new IMUser();
        imUser.setUsername("lisi");
        imUser.setPassword("123456");
        imUser.setNickname("huahua");
        imUser.setEmail("123456@qq.com");
        imUser.setMobile("18650140605");
        return imUser;
    }

    private Tuser generateTuser() {
        Tuser tuser = new Tuser();
        tuser.setUsername("zhangsan");
        tuser.setPassword("123456");
        tuser.setMobile("13666666666");
        tuser.setEmail("123456@qq.com");
        return tuser;
    }
}
```
- mongo:mongo测试包
```
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class TestMongo {
    @Resource
    private MongoTemplate mongoTemplate;

    @Test
    public void test() {
        MgUser mgUser = new MgUser();
        mgUser.setId(1L);
        mgUser.setNikename("pysasuke");
        mgUser.setPhone("18650140605");
        //插入成功后_id属性有值(mongo数据库生成的)
        mongoTemplate.insert(mgUser);
        MgUser selectMgUser = mongoTemplate.findOne(new Query(Criteria.where("id").is(1L)), MgUser.class);
        Assert.assertEquals(mgUser.getId(), selectMgUser.getId());
    }
}
```
- mysql:mysql测试包
```
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml") //加载xml文件
public class TestMysql {

    @Autowired
    private TuserMapper tuserMapper;

    @Test
    public void testInsert() {
        Tuser tuser = generateTuser();
        int row = tuserMapper.insert(tuser);
        Assert.assertEquals(1, row);
    }

    @Test
    public void testSelect() {
        Tuser tuser = generateTuser();
        /*
        插入成功后id会有值(mysql数据库生成的)
        前提是：
        1.主键设置为自动增长
        2.xml中insert语句设置有:useGeneratedKeys="true" keyProperty="id"
         */
        int row = tuserMapper.insert(tuser);
        Assert.assertEquals(1, row);

        Tuser selectedTuser = tuserMapper.selectByPrimaryKey(tuser.getId());
        Assert.assertNotNull(selectedTuser);
        Assert.assertEquals(tuser, selectedTuser);
    }

    @Test
    public void testUpdate() {
        Tuser tuser = generateTuser();
        int row = tuserMapper.insert(tuser);
        Assert.assertEquals(1, row);

        Tuser selectedTuser = tuserMapper.selectByPrimaryKey(tuser.getId());
        Assert.assertNotNull(selectedTuser);
        selectedTuser.setPassword("654321");
        tuserMapper.updateByPrimaryKeySelective(selectedTuser);

        Tuser updatedTuser = tuserMapper.selectByPrimaryKey(selectedTuser.getId());
        Assert.assertNotNull(updatedTuser);
        Assert.assertEquals(selectedTuser.getPassword(), updatedTuser.getPassword());
    }

    @Test
    public void testDelete() {
        Tuser tuser = generateTuser();
        int row = tuserMapper.insert(tuser);
        Assert.assertEquals(1, row);

        tuserMapper.deleteByPrimaryKey(tuser.getId());
        Tuser selectedTuser = tuserMapper.selectByPrimaryKey(tuser.getId());
        Assert.assertNull(selectedTuser);
    }

    private Tuser generateTuser() {
        Tuser tuser = new Tuser();
        tuser.setUsername("zhangsan");
        tuser.setPassword("123456");
        tuser.setMobile("13666666666");
        tuser.setEmail("123456@qq.com");
        return tuser;
    }
}
```
- redis：redis测试包
```
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class TestRedis {
    @Autowired
    private RedisCache cache;

    @Test
    public void testPutString() {
        cache.putCacheWithExpireTime("testPutString", "123456", 60);
    }

    @Test
    public void tesGetString() {
        cache.putCacheWithExpireTime("tesGetString", "123456", 60);
        String str = cache.getCache("tesGetString", String.class);
        Assert.assertEquals("123456", str);
    }

    @Test
    public void testObject() {
        Person person = generatePerson();
        cache.putCacheWithExpireTime("testObject:" + person.getUsername(), person, 600);
    }

    @Test
    public void tesGetObject() {
        Person person = generatePerson();
        cache.putCacheWithExpireTime("tesGetObject:" + person.getUsername(), person, 600);
        Person cachePerson = cache.getCache("tesGetObject:"+person.getUsername(), Person.class);
        Assert.assertEquals(person, cachePerson);
    }

    @Test
    public void tesDeleteCache() {
        cache.putCacheWithExpireTime("tesDeleteCache", "123456", 60);
        String cacheStr = cache.getCache("tesDeleteCache", String.class);
        Assert.assertEquals("123456", cacheStr);

        cache.deleteCache("tesDeleteCache");
        String DeleteStr = cache.getCache("tesDeleteCache", String.class);
        Assert.assertNull(DeleteStr);
    }

    private Person generatePerson() {
        Person person = new Person();
        person.setId(1L);
        person.setUsername("wangwu");
        person.setPassword("123456");
        return person;
    }
}
```

