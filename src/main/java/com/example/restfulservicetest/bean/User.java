package com.example.restfulservicetest.bean;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class User {
    private Integer id;

    @Size(min = 2, message = "Name은 2글자 이상")
    private String name;

    @Past(message = "등록일은 미래 날짜 입력 불가능")
    private Date joinDate;
}
