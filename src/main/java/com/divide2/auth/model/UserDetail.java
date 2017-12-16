package com.divide2.auth.model;

import com.divide2.common.date.DateConst;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="sys_user_detail")
@Data
public class UserDetail {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "user_id")
    private int userId;
    private String nickname;
    private String intro;
    private String avatar;
    private LocalDate birth;
    private String address;
    private String link;
    private String college;
    private String username;
    private String phone;
    private String email;

    @Column(columnDefinition = "comment '0 female 1 male 2 other'")
    private short gender;
    @Column(columnDefinition = " comment ' not same to the user entity , it represent this record is a history when it's false'")
    private boolean enabled;

    @Column(name = "create_date_time")
    @JsonFormat(pattern = DateConst.DATETIME_FORMATTER)
    private LocalDateTime createDateTime;

    @Column(name="update_date_time")
    @JsonFormat(pattern = DateConst.DATETIME_FORMATTER)
    private LocalDateTime updateDateTime;



}
