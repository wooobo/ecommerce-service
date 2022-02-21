package com.slowin.ecommerce.domain.shippingpolicy;

public enum DeliveryFeeType {
    FREE("무료배송"),
    NOT_FREE("유료배송"),
    CHARGE_RECEIVED("착불배송"),
    CONDITIONAL_FREE("조건부무료배송"),
    ;

    private final String type;

    DeliveryFeeType(String type) {
        this.type = type;
    }
}
