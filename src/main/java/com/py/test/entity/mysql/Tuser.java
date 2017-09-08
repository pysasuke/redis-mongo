package com.py.test.entity.mysql;

import lombok.Data;

@Data
public class Tuser {
    private Long id;
    private String username;
    private String password;
    private String mobile;
    private String email;


}