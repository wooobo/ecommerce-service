package com.slowin.ecommerce.domain.product;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.slowin.ecommerce.domain.product.optiongroup.ProductOptionGroups;
import java.time.LocalDateTime;
import java.util.Collections;
import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    void changeOnSale_판매시작일_오늘보다_이후면_실패() {
        // given
        LocalDateTime saleStartAt = LocalDateTime.now().plusDays(1);
        LocalDateTime saleEndAt = LocalDateTime.now().plusDays(2);
        SalesPeriod salesPeriod = new SalesPeriod(saleStartAt, saleEndAt);
        Product product = 상품생성(salesPeriod);

        // when
        ThrowableAssert.ThrowingCallable actual = product::changeOnSale;

        // then
        assertThatThrownBy(actual).isInstanceOf(RuntimeException.class);
    }

    private Product 상품생성(SalesPeriod salesPeriod) {
        // given
        String name = "청바지";
        Price productPrice = Price.of(1000L);
        String content = "상품 내용\n 내용 내용";
        Status status = Status.READY;
        String brandCode = "brx_01";
        String categoryCode = "ctx_01";
        Long shippingPlaceId = 1L;
        ProductOptionGroups productOptionGroups = new ProductOptionGroups(Collections.emptyList());

        return new Product(name, productPrice, content, status, productOptionGroups, salesPeriod,
            brandCode, categoryCode, shippingPlaceId);
    }
}
