package com.fanjie.sts.common.exception;

/**
 * @author fanjie
 * @date 2021/12/18 15:55
 */

public class StsRuntimeException extends RuntimeException{
    public StsRuntimeException() {
        super();
    }

    public StsRuntimeException(String message) {
        super(message);
    }
}
