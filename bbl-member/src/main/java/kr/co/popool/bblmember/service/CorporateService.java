package kr.co.popool.bblmember.service;

import kr.co.popool.bblmember.domain.dto.CorporateDto;

public interface CorporateService {

    //create
    void corporateSignUp(CorporateDto.CREATE_CORPORATE createCorporate);

    //update
    void corporateUpdate(CorporateDto.UPDATE_CORPORATE updateCorporate);

    //get
    CorporateDto.READ_CORPORATE getCorporate();

}
