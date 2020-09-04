package com.example.springdata.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import java.io.Serializable;
import java.util.Date;
import lombok.experimental.Tolerate;

/**
 * @team mackie
 * @Author sqq
 * @Date 2020-08-28 15:43:48
 */
@Entity
@Table(name = "user")
@Data
@Builder(toBuilder = true)
public class User implements Serializable {

    private static final long serialVersionUID = 2629031022238535309L;

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "create_time")
    private Date createTime;

    @Tolerate
    User(){}


}
