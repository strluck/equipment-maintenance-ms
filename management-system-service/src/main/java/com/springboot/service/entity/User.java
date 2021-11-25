package com.springboot.service.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import javax.persistence.*;

@Entity
@Data
@Table(name = "tb_user")
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;         //  id
    @Column(length = 20)
    private String Name;        //姓名
    @Column(length = 20)
    private String PassWord;    //密码
    @Column(length = 20)
    private String Status;     //账号状态
}