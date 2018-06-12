package com.divide2.auth.model.po;

import lombok.Data;

import javax.persistence.*;

//@Entity
//@Table(name = "sys_user_group")
//@Data
public class UserGroup {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "group_id")
    private Integer groupId;
}
