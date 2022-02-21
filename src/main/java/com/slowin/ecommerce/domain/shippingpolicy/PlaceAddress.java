package com.slowin.ecommerce.domain.shippingpolicy;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PlaceAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "address")
    private String address;

    @Column(name = "address_detail")
    private String addressDetail;

    @Column(name = "phone_number")
    private String phoneNumber;

    protected PlaceAddress() {
    }

    public PlaceAddress(String zipCode, String address, String addressDetail, String phoneNumber) {
        this.zipCode = zipCode;
        this.address = address;
        this.addressDetail = addressDetail;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlaceAddress that = (PlaceAddress) o;
        return Objects.equals(zipCode, that.zipCode) && Objects.equals(address, that.address)
            && Objects.equals(addressDetail, that.addressDetail) && Objects.equals(phoneNumber,
            that.phoneNumber);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
