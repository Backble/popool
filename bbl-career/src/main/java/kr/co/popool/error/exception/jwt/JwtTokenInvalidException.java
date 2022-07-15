package kr.co.popool.error.exception.jwt;

import kr.co.popool.error.exception.UserDefineException;

public class JwtTokenInvalidException extends UserDefineException {
    public JwtTokenInvalidException(String message) {
        super(message);
    }
}
