package com.py.test.entity.mongo;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by DavidWang on 16/9/14.
 */
@Data
//需要与mongo中对象(文档)名一致
public class MgUser {
    @Id
    private ObjectId _id;    //插入mongo时会自动生成_id，如果不加这个字段则会把id属性当成_id
    @Field
    private Long id;
    private String nikename;
    private String phone;

}
