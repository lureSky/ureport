package org.qisheng.ureport.config;

import com.bstek.ureport.console.UReportServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UreportConfig {

    /**
     * @Description:配置Ureport信息类
     *              注意不要修改urlMappings否则可能会异常
     * @author: martin
     * @date: 2019/12/11 0011 10:45
     * @param: []
     * @return: org.springframework.boot.web.servlet.ServletRegistrationBean
     */
    @Bean
    public ServletRegistrationBean buildUReportServlet(){
        return new ServletRegistrationBean(new UReportServlet(), "/ureport/*");
    }
}
