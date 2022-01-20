package com.slowin.ecommerce.domain.product;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.LocalDateTime;
import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.Test;

class SalesPeriodTest {

    @Test
    void 판매시작일보다_판매종료일이_과거이면_실패됨() {
        // given
        LocalDateTime saleStartAt = LocalDateTime.now().plusDays(1);
        LocalDateTime saleEndAt = LocalDateTime.now();

        // when
        ThrowableAssert.ThrowingCallable actual = () -> new SalesPeriod(saleStartAt, saleEndAt);

        // then
        assertThatThrownBy(actual).isInstanceOf(RuntimeException.class);
    }
}