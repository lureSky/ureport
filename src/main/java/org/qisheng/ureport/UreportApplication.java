package org.qisheng.ureport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @Description:加载配置文件
 * @author: martin
 * @date: 2019/12/11 0011 10:42
 * @param:
 * @return:
 */
@ImportResource("classpath:context.xml")
@SpringBootApplication
public class UreportApplication {

    public static void main(String[] args) {
        SpringApplication.run(UreportApplication.class, args);
    }


}
