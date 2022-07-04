package kr.co.bblcareer.domain.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import kr.co.bblcareer.domain.entity.CareerEntity;
import kr.co.bblcareer.domain.entity.ScoreEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;


@Builder
@Getter
@AllArgsConstructor

public class ScoreDto {



    @ApiModelProperty(example = "평가자 아이디")
    @NotBlank(message = "아이디를 입력해주세요.")
    private String evaluatorId;

    @JsonProperty("career_id")
    @ApiModelProperty(example = "평가 대상 아이디")
    @NotBlank(message = "평가 대상 아이디를 입력하세요")
    private CareerEntity careerId;




    @ApiModelProperty(example = "근태")
    @NotBlank(message = "근태점수를 입력하세요")
    private int attendance;


    @ApiModelProperty(example = "성실성")
    @NotBlank(message = "성실성 점수를 입력하세요")
    private int sincerity;

    @ApiModelProperty(example = "적극성")
    @NotBlank(message = "적극성 점수를 입력하세요")
    private int positiveness;

    @ApiModelProperty(example = "기술스킬")
    @NotBlank(message = "기술 점수를 입력하세요")
    private int technical;


    @ApiModelProperty(example = "협업 능력")
    @NotBlank(message = "협업능력 점수를 입력하세요")
    private int cooperative;





}



