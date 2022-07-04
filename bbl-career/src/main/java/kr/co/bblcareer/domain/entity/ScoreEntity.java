package kr.co.bblcareer.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import kr.co.bblcareer.domain.shared.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "tbl_score")
@Getter
@Entity

public class ScoreEntity extends BaseEntity {



    @ManyToOne( cascade = CascadeType.REMOVE)
    @JoinColumn(name = "career_id",referencedColumnName = "career_id")
    private CareerEntity careerId;
    @Column(name = "evaluator_id", nullable = true, length = 100)
    private String evaluatorId;
    @Column(name = "attendance", nullable = true, length = 100)
    private int attendance;
    @Column(name = "sincerity", nullable = true, length = 100)
    private int sincerity;
    @Column(name = "positiveness", nullable = true, length = 100)
    private int positiveness;
    @Column(name = "technical", nullable = true, length = 100)
    private int technical;
    @Column(name = "cooperative", nullable = true, length = 100)
    private int cooperative;







}
