package com.py.test.mongo;

import com.py.test.entity.mongo.MgUser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * mongo测试
 * Created by Administrator on 2016/9/21.
 */
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
