package kr.co.popool.error.exception;

import kr.co.popool.error.model.ErrorCode;

public class UnauthorizedException extends BusinessLogicException {

    public UnauthorizedException() {
        super(ErrorCode.UNAUTHORIZED_USER);
    }
}