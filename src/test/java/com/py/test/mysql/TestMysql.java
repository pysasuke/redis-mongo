package com.py.test.mysql;

import com.py.test.dao.TuserMapper;
import com.py.test.entity.mysql.Tuser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * mysql对象增删改查操作测试
 * @author pysasuke
 * @create 2017-09-08 10:26
 */
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
