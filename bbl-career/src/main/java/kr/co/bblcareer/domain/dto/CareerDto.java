package kr.co.bblcareer.domain.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.NotBlank;


public  class CareerDto {
    @Builder
    @ToString
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class New{


        @ApiModelProperty(example = "아이디")
        @NotBlank(message = "아이디를 입력해주세요.")
        private String careerId;

        //타입은 나중에 enum으로 수정 예정
        @ApiModelProperty(example = "평가등급")
        @NotBlank(message = "등급을 입력해주세요.")
        private String grade;


        @ApiModelProperty(example = "이름")
        @NotBlank(message = "이름를 입력해주세요.")
        private String name;


        @ApiModelProperty(example = "재직 기간")
        @NotBlank(message = "재직 기간을 입력해주세요")
        private String period;


        @ApiModelProperty(example = "블록체인 아이디")
        @NotBlank(message = "블록체인")
        private String historyId;



    }


}