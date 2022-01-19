package com.slowin.ecommerce.domain.product.optionGroup;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductOptionGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer ordering;
    private String productOptionGroupName;

    protected ProductOptionGroup() {
    }

    public ProductOptionGroup(Integer ordering, String productOptionGroupName) {
        this.ordering = ordering;
        this.productOptionGroupName = productOptionGroupName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductOptionGroup that = (ProductOptionGroup) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
