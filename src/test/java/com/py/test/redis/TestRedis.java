package com.py.test.redis;

import com.py.test.entity.redis.Person;
import com.py.test.util.cache.RedisCache;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * redis测试
 * Created by Administrator on 2016/9/21.
 */
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
