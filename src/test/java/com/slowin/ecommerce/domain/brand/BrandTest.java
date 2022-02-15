package com.slowin.ecommerce.domain.brand;


import org.junit.jupiter.api.Test;

class BrandTest {

    @Test
    void create() {
        // given
        String name = "brandTest";

        // when then
        Brand brand = new Brand(name);
    }
}
