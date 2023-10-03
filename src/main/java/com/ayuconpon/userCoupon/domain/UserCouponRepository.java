package com.ayuconpon.userCoupon.domain;

import com.ayuconpon.userCoupon.domain.entity.UserCoupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserCouponRepository extends JpaRepository<UserCoupon, Long> {

    List<UserCoupon> findByUserId(Long userId);
}