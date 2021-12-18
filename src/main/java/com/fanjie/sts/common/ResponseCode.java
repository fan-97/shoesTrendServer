package com.fanjie.sts.common;

import lombok.Getter;

/**
 * @author fanjie
 * @date 2021/12/18 15:50
 */
@Getter
public enum ResponseCode {
    SUCCESS("000000","success"),
    ERROR("000001","error");
    private String code;
    private String desc;

    ResponseCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
