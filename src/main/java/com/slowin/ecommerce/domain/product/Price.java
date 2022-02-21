package com.slowin.ecommerce.domain.product;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Price {

    private final static Long PRICE_MIN = 0L;

    @Column(name = "price")
    private Long price;

    protected Price() {
    }

    public Price(Long price) {
        minValidate(price);
        this.price = price;
    }

    public static Price of(Long price) {
        return new Price(price);
    }

    private void minValidate(Long price) {
        if (price <= PRICE_MIN) {
            throw new RuntimeException("최저가격 보다 작을 수 없습니다.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Price price1 = (Price) o;
        return Objects.equals(price, price1.price);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
