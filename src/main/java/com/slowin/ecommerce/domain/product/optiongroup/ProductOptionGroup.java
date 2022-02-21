package com.slowin.ecommerce.domain.product.optiongroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class ProductOptionGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer ordering;
    private String productOptionGroupName;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "product_option_group_id", foreignKey = @ForeignKey(name = "fk_product_option_group_product_option_item"), nullable = false)
    private List<ProductOptionItem> productOptionItems = new ArrayList<>();

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
