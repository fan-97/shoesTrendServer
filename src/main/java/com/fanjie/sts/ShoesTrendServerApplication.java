package com.fanjie.sts;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/***
 *
 * @author fanjie
 * @date 21:43 2021/12/16
 */
@SpringBootApplication
@MapperScan("com.fanjie.sts.mapper")
public class ShoesTrendServerApplication {


    public static void main(String[] args) {
        SpringApplication.run(ShoesTrendServerApplication.class, args);
    }

}
