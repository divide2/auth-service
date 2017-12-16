package com.divide2.auth.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;

@Entity
@Table(name="sys_user")
@Data
public class User{

    @Id
    @GeneratedValue
    private int id;
    private String username;
    private String nickname;
    private String password;
    private String phone;
    private String email;
    @Column(columnDefinition = "comment '0 female 1 male other'")
    private int gender;
    private String avatar;
    private boolean enabled;

    @Column(name = "create_date_time")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime createDateTime;

    @Column(name="update_date_time")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime updateDateTime;

}

