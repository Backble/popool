package kr.co.popool.error.exception;


import kr.co.popool.error.model.ErrorCode;

public class DuplicatedException extends BusinessLogicException {
    public DuplicatedException(ErrorCode errorCode) {
        super(errorCode);
    }
}