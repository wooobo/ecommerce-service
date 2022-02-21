package com.slowin.ecommerce.domain.shippingpolicy;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DeliveryFee {

    @Column(name = "type")
    private DeliveryFeeType type;

    @Column(name = "fee")
    private Long fee;

    @Column(name = "return_fee")
    private Long returnFee;

    @Column(name = "exchange_fee")
    private Long exchangeFee;

    @Column(name = "conditional_fee")
    private Long conditionalFee;

    @Column(name = "jeju_fee")
    private Long jejuFee;

    @Column(name = "not_jeju_fee")
    private Long notJejuFee;

    protected DeliveryFee() {
    }

    public DeliveryFee(DeliveryFeeType type, Long fee, Long returnFee, Long exchangeFee,
        Long conditionalFee, Long jejuFee, Long notJejuFee) {
        this.type = type;
        this.fee = fee;
        this.returnFee = returnFee;
        this.exchangeFee = exchangeFee;
        this.conditionalFee = conditionalFee;
        this.jejuFee = jejuFee;
        this.notJejuFee = notJejuFee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeliveryFee that = (DeliveryFee) o;
        return Objects.equals(fee, that.fee) && Objects.equals(type, that.type) && Objects.equals(
            conditionalFee, that.conditionalFee) && Objects.equals(jejuFee, that.jejuFee)
            && Objects.equals(notJejuFee, that.notJejuFee);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
