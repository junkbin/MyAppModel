package com.verifone.model;

import lombok.Data;

@Data
public class Employee {
    private long id;
    private String userName;
    private String password;
    private String email;
    private String mobile;
}
