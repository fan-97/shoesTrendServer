package com.fanjie.sts.common;

import lombok.Data;

/**
 * @author fanjie
 * @date 2021/12/18 15:46
 */
@Data
public class ApiResponse {
    private String message;
    private String code;
    private Object data;

    private ApiResponse(String message, String code, Object data) {
        this.message = message;
        this.code = code;
        this.data = data;
    }

    private ApiResponse(String message, String code) {
        this.message = message;
        this.code = code;
    }

    public static final ApiResponse SUCCESS = success();
    public static final ApiResponse FAILED = error(ResponseCode.ERROR.getDesc(), ResponseCode.ERROR.getCode());

    public static ApiResponse success(Object data) {
        ApiResponse success = success();
        success.setData(data);
        return success;
    }

    public static ApiResponse error(String code, String message) {
        return new ApiResponse(code, message);
    }

    private static ApiResponse success() {
        return new ApiResponse("success", ResponseCode.SUCCESS.getCode());
    }

}
