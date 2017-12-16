package com.divide2.auth.model;

import com.divide2.common.date.DateConst;
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
    private String password;
    private String phone;
    private String email;
    private int gender;
    private boolean enabled;

    @Column(name = "create_date_time")
    @JsonFormat(pattern = DateConst.DATETIME_FORMATTER)
    private LocalDateTime createDateTime;

    @Column(name="update_date_time")
    @JsonFormat(pattern = DateConst.DATETIME_FORMATTER)
    private LocalDateTime updateDateTime;

}

