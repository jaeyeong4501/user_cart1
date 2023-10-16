package com.example.user_cart1.service;


import com.example.user_cart1.entity.Cart;
import com.example.user_cart1.repository.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CartService {
    private final CartRepository cartRepository;
    public Cart addCart(Long memberId, String date)
    //메서드 - addCart:
    //이 메서드는 특정 회원 ID와 날짜를 받아 새로운 장바구니를
    // 추가하거나 해당 회원 ID와 날짜로 이미 존재하는 장바구니를 반환합니다
    {
        Optional<Cart> cart = cartRepository.findByMemberIdAndDate(memberId, date);
        //cartRepository.findByMemberIdAndDate(memberId, date): 저장소에서
        // 특정 회원 ID와 날짜를 사용하여 장바구니를 찾습니다. 반환 값은 Optional<Cart> 타입입니다.
        if(cart.isEmpty())
        //if(cart.isEmpty()): 해당 회원 ID와 날짜로 장바구니가 존재하지 않으면
            // 새로운 장바구니를 생성하고 저장소에 저장합니다.
        {
            Cart newCart = new Cart();
            newCart.setMemberId(memberId);
            newCart.setDate(date);
            Cart saveCart = cartRepository.save(newCart);
            return saveCart;
        } else {
            return cart.get();
        }
    }
}
// 이 서비스는 특정 회원 ID와 날짜를 기반으로 한 장바구니 생성 또는 조회의 기능을 제공.