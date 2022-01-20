package com.slowin.ecommerce.domain.product;

import com.slowin.ecommerce.domain.product.optionGroup.ProductOptionGroups;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Lob
    private String content;

    @Embedded
    private Price price;

    @Embedded
    private ProductOptionGroups productOptionGroups;

    @Embedded
    private SalesPeriod salesPeriod;
    private String brandCode;
    private String categoryCode;
    private String shippingPlaceCode;
    private String returnPlaceCode;

    protected Product() {
    }

    public Product(String name, Price price, String content,
        ProductOptionGroups productOptionGroups, SalesPeriod salesPeriod, String brandCode,
        String categoryCode, String shippingPlaceCode, String returnPlaceCode) {
        this.name = name;
        this.price = price;
        this.content = content;
        this.productOptionGroups = productOptionGroups;
        this.salesPeriod = salesPeriod;
        this.brandCode = brandCode;
        this.categoryCode = categoryCode;
        this.shippingPlaceCode = shippingPlaceCode;
        this.returnPlaceCode = returnPlaceCode;
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
