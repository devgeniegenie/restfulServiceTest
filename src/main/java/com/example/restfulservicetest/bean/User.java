package com.example.restfulservicetest.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
@JsonIgnoreProperties(value = {"ssn", "password"})
public class User {
    private Integer id;

    @Size(min = 2, message = "Name은 2글자 이상")
    private String name;

    @Past(message = "등록일은 미래 날짜 입력 불가능")
    private Date joinDate;

//    @JsonIgnore
    private String ssn;

//    @JsonIgnore
    private String password;
}
