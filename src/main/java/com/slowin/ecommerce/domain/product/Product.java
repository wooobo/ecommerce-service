package com.slowin.ecommerce.domain.product;

import com.slowin.ecommerce.domain.product.optionGroup.ProductOptionGroups;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Lob
    private String content;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

    @Embedded
    private Price price;

    @Embedded
    private ProductOptionGroups productOptionGroups;

    @Embedded
    private SalesPeriod salesPeriod;

    @Column(name = "brand_code")
    private String brandCode;
    @Column(name = "category_code")
    private String categoryCode;
    @Column(name = "shipping_place_code")
    private String shippingPlaceCode;
    @Column(name = "return_place_code")
    private String returnPlaceCode;

    protected Product() {
    }

    public Product(String name, Price price, String content, Status status,
        ProductOptionGroups productOptionGroups, SalesPeriod salesPeriod, String brandCode,
        String categoryCode, String shippingPlaceCode, String returnPlaceCode) {
        this.name = name;
        this.price = price;
        this.content = content;
        this.status = status;
        this.productOptionGroups = productOptionGroups;
        this.salesPeriod = salesPeriod;
        this.brandCode = brandCode;
        this.categoryCode = categoryCode;
        this.shippingPlaceCode = shippingPlaceCode;
        this.returnPlaceCode = returnPlaceCode;
    }

    public void changeOnSale() {
        if (!salesPeriod.isBeforeOrSameTodayIsStartAt()) {
            throw new RuntimeException("판매시작일이 시작되지 않아 상품을 판매중으로 변경 할 수 없습니다.");
        }

        this.status = Status.SALE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
