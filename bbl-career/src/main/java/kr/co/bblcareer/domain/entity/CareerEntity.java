package kr.co.bblcareer.domain.entity;

import com.fasterxml.jackson.databind.ser.Serializers;
import kr.co.bblcareer.domain.shared.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.invoke.MethodHandles;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "tbl_career")
@Getter
@ToString
@Entity
public class CareerEntity extends BaseEntity {

    @JoinColumn(referencedColumnName = "career_id")
    @Column(name = "career_id", unique = true, nullable = false, length = 100)
    private String careerId;
    @Column(name = "grade", nullable = true, length = 100)
    private String grade;
    @Column(name = "name", nullable = true, length = 100)
    private String name;
    @Column(name = "period", nullable = true, length = 100)
    private String period;
    @Column(name = "history_id", nullable = true, length = 100)
    private String historyId;



    @Builder
    public CareerEntity(String careerId,String grade, String name, String period, String historyId) {
        this.careerId = careerId;
        this.grade = grade;
        this.name = name;
        this.period = period;
        this.historyId = historyId;

    }

    public void patch(CareerEntity careerEntity){
        if(careerEntity.careerId != null)
            this.careerId = careerEntity.careerId;
        if(careerEntity.grade != null)
            this.grade = careerEntity.grade;
        if(careerEntity.name != null)
            this.name = careerEntity.name;
        if(careerEntity.period != null)
            this.period = careerEntity.period;
        if(careerEntity.historyId != null)
            this.historyId = careerEntity.historyId;


    }

}
