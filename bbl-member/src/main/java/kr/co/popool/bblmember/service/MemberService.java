package kr.co.popool.bblmember.service;

import kr.co.popool.bblmember.domain.dto.CorporateDto;
import kr.co.popool.bblmember.domain.dto.MemberDto;
import kr.co.popool.bblmember.domain.dto.OauthDto;
import kr.co.popool.bblmember.domain.shared.Phone;

public interface MemberService {

    //login
    MemberDto.TOKEN login(MemberDto.LOGIN login);

    //create
    void signUp(MemberDto.CREATE create);

    //update
    void update(MemberDto.UPDATE update);
    void updatePassword(MemberDto.UPDATE_PASSWORD updatePpassword);
    void updateAddress(MemberDto.UPDATE_ADDRESS updateAddress);
    void updatePhone(MemberDto.UPDATE_PHONE updatePhone);
    void paymentAgreeUpdate();

    //get
    MemberDto.READ get();
    String findIdentity(MemberDto.READ_ID readId);
    boolean getAddress();
    boolean getPaymentAgree();

    //delete
    void delete(String password);
    void reCreate(MemberDto.RE_CREATE reCreat);

    //common
    boolean checkIdentity(String identity);
    boolean checkEmail(String email);
    boolean checkPhone(Phone phone);
    void checkSignUp(MemberDto.CREATE create);
    void checkSignUp(OauthDto.CREATE create);
    void checkSignUp(CorporateDto.CREATE_CORPORATE create);

}
