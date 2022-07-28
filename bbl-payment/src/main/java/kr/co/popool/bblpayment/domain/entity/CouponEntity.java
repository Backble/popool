package kr.co.popool.bblpayment.domain.entity;

import kr.co.popool.bblpayment.domain.dto.ItemDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@ToString
@Getter
@NoArgsConstructor
@DiscriminatorValue("C")
@Entity
public class CouponEntity extends ItemMstEntity {

    @Column(nullable = true)
    private int amount;

    @Builder
    public CouponEntity(int price, String name, int amount) {
        super(price, name);
        this.amount = amount;
    }

    @Override
    public void update(ItemDto.UPDATE updateDto) {
        this.name = updateDto.getName();
        this.price = updateDto.getPrice();
        this.amount = updateDto.getAmount();
    }
}
