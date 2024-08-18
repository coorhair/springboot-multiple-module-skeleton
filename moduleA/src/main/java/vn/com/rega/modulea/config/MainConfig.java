package vn.com.rega.modulea.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vn.com.rega.modulec.LibC;

@Configuration
public class MainConfig {

    @Bean
    public LibC libCTemplate() {
        return new LibC();
    }
}
