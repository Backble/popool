package kr.co.popool.service;
import com.sun.xml.bind.v2.TODO;
import kr.co.popool.domain.dto.CareerDto;
import kr.co.popool.domain.entity.CareerEntity;
import kr.co.popool.error.exception.BadRequestException;
import kr.co.popool.repository.CareerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j //로깅을 위함
@RequiredArgsConstructor
public class CareerServiceImpl implements CareerService {

    private final CareerRepository careerRepository;


    @Override
    public List<CareerEntity> showAll() {
        return careerRepository.findAll();
    }

    public Optional<CareerEntity> show(Long id) {
        return careerRepository.findById(id);
    }

    @Override
    @Transactional
    public CareerEntity newCareer(CareerDto.CREATE newCareer) {

        CareerEntity careerEntity = CareerEntity.builder()
                .identity(newCareer.getIdentity())
                .name(newCareer.getName())
                .period(newCareer.getPeriod())
                .historyId(newCareer.getHistoryId())

                .build();

        //아이디 null체크
        if (careerEntity.getIdentity() == null) {
            throw new BadRequestException("본인의 아이디를 입력해주세요");
        }

        //TODO : 아이디 중복 확인

        return careerEntity;
    }

}