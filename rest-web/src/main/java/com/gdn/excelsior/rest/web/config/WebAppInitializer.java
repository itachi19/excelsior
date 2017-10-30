package com.gdn.excelsior.rest.web.config;

import com.gdn.excelsior.rest.web.Application;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

import java.util.Properties;

/**
 * Created by avinashkumar on 26/04/2017 AD.
 */
public class WebAppInitializer extends SpringBootServletInitializer {

    private static Properties getProperties() {
        Properties props = new Properties();
        props.put("spring.config.location", "file:" + System.getenv("excelsior_CONF_DIR") + "excelsior/");
        return props;
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class).properties(getProperties());
    }
}
