package com.slowin.ecommerce.domain.product;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SalesPeriod {

    @Column(name = "sale_start_at")
    private LocalDateTime saleStartAt;

    @Column(name = "sale_end_at")
    private LocalDateTime saleEndAt;

    protected SalesPeriod() {
    }

    public SalesPeriod(LocalDateTime saleStartAt, LocalDateTime saleEndAt) {
        validDate(saleStartAt, saleEndAt);
        this.saleStartAt = saleStartAt.truncatedTo(ChronoUnit.DAYS);
        this.saleEndAt = saleEndAt.truncatedTo(ChronoUnit.DAYS);
    }

    private void validDate(LocalDateTime saleStartAt, LocalDateTime saleEndAt) {
        if (saleStartAt.isAfter(saleEndAt)) {
            throw new RuntimeException("판매시작일이 판매종료일보다 이전 날짜이어야 합니다.");
        }
    }

    public boolean isBeforeOrSameTodayIsStartAt() {
        LocalDateTime today = LocalDateTime.now().truncatedTo(ChronoUnit.DAYS);

        return saleStartAt.isBefore(today) || saleStartAt.equals(today);
    }
}
