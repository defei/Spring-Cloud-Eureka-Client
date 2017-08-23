package org.codelogger.support;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by defei on 8/23/17.
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClientPracticeApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(EurekaClientPracticeApplication.class).web(true).run(args);
    }

    private static final Logger logger = LoggerFactory.getLogger(EurekaClientPracticeApplication.class);
}
