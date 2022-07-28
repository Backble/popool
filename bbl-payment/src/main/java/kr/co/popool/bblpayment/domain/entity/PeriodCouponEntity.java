package kr.co.popool.bblpayment.domain.entity;

import kr.co.popool.bblpayment.domain.dto.ItemDto;
import kr.co.popool.bblpayment.domain.shared.enums.CouponPeriod;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@DiscriminatorValue("P")
@Entity
public class PeriodCouponEntity extends ItemMstEntity {

    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    private CouponPeriod period;

    @Builder
    public PeriodCouponEntity(int price, String name, String period) {
        super(price, name);
        this.period = CouponPeriod.of(period);
    }

    @Override
    public void update(ItemDto.UPDATE updateDto) {
        this.name = updateDto.getName();
        this.price = updateDto.getPrice();
        this.period = CouponPeriod.of(updateDto.getPeriod());
    }
}
