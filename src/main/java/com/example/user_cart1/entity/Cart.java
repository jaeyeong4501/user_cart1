package com.example.user_cart1.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "carts")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // 매일 새로운 카트생성

    private Long memberId;  // 누가 카트에 담았냐

    private String date; // yyyymmdd

    @JsonManagedReference
    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
    private List<CartItem> cartItems = new ArrayList<>();
    // 카트에 담긴 카트 아이탬  1:N
}





//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="member_id")
//    private Member member;
//
//    @Column
//    private int itemId;
//
//
//    public static Cart createCart(Member member){
//        Cart cart = new Cart();
//        cart.setMember(member);
//        return cart;
//    }
