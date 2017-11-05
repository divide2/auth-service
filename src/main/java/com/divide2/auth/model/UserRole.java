package com.divide2.auth.model;

import javax.persistence.*;

@Entity
@Table(name="sys_user_role")
public class UserRole {

    @Id
    @GeneratedValue
    private int id;


    @Column(name ="user_id")
    private int userId;

    @Column(name = "role_id")
    private int roleId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}
