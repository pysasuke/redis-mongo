package com.py.test.redis;

import com.py.test.util.cache.RedisCache;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2016/9/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class TestRedis {
    @Autowired
    private RedisCache cache;

    @Test
    public void test(){
        cache.putCacheWithExpireTime("12345","123456",60);
    }
}
