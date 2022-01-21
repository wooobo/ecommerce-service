package com.slowin.ecommerce.domain.product;

public enum Status {
    READY("판매준비중"),
    SALE("판매중"),
    CLOSE("판매종료");

    private final String status;

    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
