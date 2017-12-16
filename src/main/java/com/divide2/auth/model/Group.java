package com.divide2.auth.model;

import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name = "sys_group")
@Data
public class Group {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

}


