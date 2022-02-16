package com.slowin.ecommerce.domain.shippingpolicy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ShippingPolicyTest {

    @Test
    void create() {
        // given
        String policyName = "기본주소";
        boolean usable = true;
        String zipCode = "12345";
        String address = "기본 주소";
        String addressDetail = "상세 주소";
        String phoneNumber = "010-1234-5678";
        PlaceAddress placeAddress = new PlaceAddress(zipCode, address, addressDetail, phoneNumber);
        DeliveryFee deliveryFee = new DeliveryFee(DeliveryFeeType.NOT_FREE, 2500L, 0L, 1000L,
            1000L);

        // when
        ShippingPolicy shippingPolicy = new ShippingPolicy(policyName, usable, deliveryFee,
            placeAddress);

        // then
        assertThat(shippingPolicy).isNotNull();
    }

}
