package com.divide2.auth.model.po;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="sys_user_role")
@Data
public class UserRole {

    @Id
    @GeneratedValue
    private int id;


    @Column(name ="user_id")
    private int userId;

    @Column(name = "role_id")
    private int roleId;

}
