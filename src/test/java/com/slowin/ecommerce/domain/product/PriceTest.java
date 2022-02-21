package com.slowin.ecommerce.domain.product;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.Test;

class PriceTest {

    @Test
    void 최저가격_보다_작으면_실패됨() {
        // given
        Long price = 0L;

        // when
        ThrowableAssert.ThrowingCallable actual = () -> new Price(price);

        // then
        assertThatThrownBy(actual).isInstanceOf(RuntimeException.class);
    }
}