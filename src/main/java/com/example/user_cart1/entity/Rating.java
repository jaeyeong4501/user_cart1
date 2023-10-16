package com.example.user_cart1.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;


@Embeddable
@Setter
@Getter
public class Rating {
    private Double rate;  // 평점
    private Integer count;  // 몇명
}

