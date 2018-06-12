package com.divide2.auth.model.po;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

//@Entity
//@Table(name = "sys_user_detail")
//@Data
public class UserDetail {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "user_id")
    private int userId;
    private String nickname;
    private String intro;
    private String avatar;
//    @JsonFormat(pattern = DateConst.DATETIME_FORMATTER)
    private LocalDate birth;
    private String address;
    private String link;
    private String college;
    private String username;
    private String phone;
    private String email;

    private short gender;
    private boolean enabled;

    @Column(name = "create_date_time")
//    @JsonFormat(pattern = DateConst.DATETIME_FORMATTER)
    private LocalDateTime createDateTime;

    @Column(name = "update_date_time")
//    @JsonFormat(pattern = DateConst.DATETIME_FORMATTER)
    private LocalDateTime updateDateTime;


}
