package com.gdn.wfm.rest.web.config;

import com.gdn.wfm.rest.web.Application;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

import java.util.Properties;

/**
 * Created by avinashkumar on 26/04/2017 AD.
 */
public class WebAppInitializer extends SpringBootServletInitializer {

    private static Properties getProperties() {
        Properties props = new Properties();
        props.put("spring.config.location", "file:" + System.getenv("WFM_CONF_DIR") + "wfm/");
        return props;
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class).properties(getProperties());
    }
}