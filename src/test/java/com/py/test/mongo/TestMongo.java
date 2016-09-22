package com.py.test.mongo;

import com.py.test.util.cache.RedisCache;
import mongoModel.friend;
import mongoModel.imuser;
import mongoModel.newfriend;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * Created by Administrator on 2016/9/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class TestMongo {
    @Resource
    private MongoTemplate mongoTemplate;

    @Test
    public void test(){
        imuser imuser = new imuser();
        imuser.setId(1002L);
        imuser.setIm_id(1000);
        imuser.setPhone("18650140605");
        imuser.setFriends(new ArrayList<friend>());
        imuser.setNewfriends(new ArrayList<newfriend>());
        mongoTemplate.insert(imuser);
        imuser imuser1 = mongoTemplate.findOne(new Query(Criteria.where("id").is(70)),imuser.class);
        System.out.println(imuser1);
    }
}
