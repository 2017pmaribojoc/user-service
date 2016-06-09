package com.captechconsulting.api.user.v1;

import com.monarchapis.driver.spring.MonarchConfigurer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MonarchConfigurer.class)
public class Configurer {
}
