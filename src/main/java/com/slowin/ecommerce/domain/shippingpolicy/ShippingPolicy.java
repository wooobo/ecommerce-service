package com.slowin.ecommerce.domain.shippingpolicy;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ShippingPolicy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "usable")
    private boolean usable;

    @Embedded
    private DeliveryFee deliveryFee;

    @Column(name = "shipping_place_id")
    private Long shippingPlaceId;

    @Column(name = "return_place_id")
    private Long returnPlaceId;

    protected ShippingPolicy() {
    }

    public ShippingPolicy(String name, boolean usable, DeliveryFee deliveryFee,
        Long shippingPlaceId, Long returnPlaceId) {
        this.name = name;
        this.usable = usable;
        this.deliveryFee = deliveryFee;
        this.shippingPlaceId = shippingPlaceId;
        this.returnPlaceId = returnPlaceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShippingPolicy that = (ShippingPolicy) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
