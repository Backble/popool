package kr.co.popool.controller;

import io.swagger.annotations.ApiOperation;
import kr.co.popool.bblcommon.error.model.ResponseFormat;
import kr.co.popool.domain.dto.career.CareerDto;
import kr.co.popool.service.career.CareerServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping(value = "/careers")
public class CareerController {

    private final CareerServiceImpl careerService;

    @ApiOperation("전체 인사 내역 조회")
    @GetMapping("/all")
    public List<CareerDto.CAREERINFO> showAll() {
        return careerService.showAll();
    }

    @ApiOperation("개인 인사 내역 조회")
    @GetMapping("")
    public CareerDto.CAREERINFO show(@RequestParam String memberIdentity) {
        return careerService.show(memberIdentity);
    }

    @ApiOperation("개인 인사 내역 등록")
    @PostMapping(value = "/create")
    public ResponseFormat createCareer(@RequestBody CareerDto.CREATE careerDto) {
        careerService.newCareer(careerDto);
        return ResponseFormat.ok();
    }

    @ApiOperation("개인 인사 내역 수정")
    @PatchMapping("/{memberIdentity}")
    public ResponseFormat updateCareer(@RequestBody CareerDto.UPDATE careerDto) {
        careerService.update(careerDto);
        return ResponseFormat.ok();

    }

    @ApiOperation("개인 인사 내역 삭제")
    @DeleteMapping("/delete")
    public ResponseFormat delete(@RequestBody CareerDto.DELETE careerDto) {
        careerService.delete(careerDto);
        return ResponseFormat.ok();
    }

}
