package com.py.test.entity.mysql;

import lombok.Data;

@Data
public class IMUser {
    private Long id;
    private String username;
    private String password;
    private String nickname;    //昵称
    private String mobile;
    private String email;

}