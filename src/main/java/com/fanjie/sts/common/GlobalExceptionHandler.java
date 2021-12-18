package com.fanjie.sts.common;

import com.fanjie.sts.common.exception.StsRuntimeException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author fanjie
 * @date 2021/12/18 15:45
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(StsRuntimeException.class)
    @ResponseStatus(HttpStatus.OK)
    public ApiResponse handleGlobalException(StsRuntimeException ex, HttpServletRequest request) {
        log.error("[exception] 未捕获的业务异常  uri:{},  method:{}", request.getRequestURI(), request.getMethod(), ex);
        String msg = ex.getMessage();
        return ApiResponse.error(ResponseCode.ERROR.getCode(), msg);
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    public ApiResponse handleException(Exception ex,HttpServletRequest request){
        log.error("[exception] 未捕获的业务异常  uri:{},  method:{}", request.getRequestURI(), request.getMethod(), ex);
        return ApiResponse.error(ResponseCode.ERROR.getCode(), "系统异常！");
    }
}
