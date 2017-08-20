package com.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * 用户数据体
 * Created by wangyong on 2017/8/20.
 */
@Entity
@Data
@Table(name = "t_user")
public class User {

    /**
     * 用户编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * 手机号码
     */
    @Column
    private String phone;

    /**
     * 用户名
     */
    @Column
    private String userName;

    /**
     * 年龄
     */
    @Column
    private Integer age;

    /**
     * 余额
     */
    @Column
    private BigDecimal balance;

}

