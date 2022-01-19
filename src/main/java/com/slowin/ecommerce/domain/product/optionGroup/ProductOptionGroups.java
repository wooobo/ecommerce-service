package com.slowin.ecommerce.domain.product.optionGroup;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Embeddable
public class ProductOptionGroups {

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "product_id", foreignKey = @ForeignKey(name = "fk_product_option_group_products"), nullable = false)
    private List<ProductOptionGroup> productOptionGroups = Collections.emptyList();

    protected ProductOptionGroups() {
    }

    public ProductOptionGroups(List<ProductOptionGroup> productOptionGroups) {
        this.productOptionGroups = productOptionGroups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductOptionGroups that = (ProductOptionGroups) o;
        return Objects.equals(productOptionGroups, that.productOptionGroups);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
