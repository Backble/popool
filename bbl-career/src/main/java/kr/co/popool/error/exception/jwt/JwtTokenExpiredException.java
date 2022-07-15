package kr.co.popool.error.exception.jwt;


import kr.co.popool.error.exception.BusinessLogicException;

public class JwtTokenExpiredException extends BusinessLogicException {
    public JwtTokenExpiredException() {
        super("JWT Token Expired");
    }
}
