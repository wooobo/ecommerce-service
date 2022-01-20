package com.slowin.ecommerce.domain.product;

import com.slowin.ecommerce.domain.product.optionGroup.ProductOptionGroups;
import java.time.LocalDateTime;
import java.util.Collections;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    void create() {
        // given
        String name = "청바지";
        Price productPrice = Price.of(1000L);
        String content = "상품 내용\n 내용 내용";
        SalesPeriod salesPeriod = new SalesPeriod(LocalDateTime.now(),
            LocalDateTime.now().plusDays(7));
        String brandCode = "brx_01";
        String categoryCode = "ctx_01";
        String shippingPlaceCode = "sp_01";
        String returnPlaceCode = "rp_01";
        ProductOptionGroups productOptionGroups = new ProductOptionGroups(Collections.emptyList());

        Product product = new Product(name, productPrice, content, productOptionGroups, salesPeriod,
            brandCode, categoryCode, shippingPlaceCode, returnPlaceCode);
    }
}
