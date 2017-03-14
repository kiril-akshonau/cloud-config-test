package foo.app.starter;

import org.springframework.boot.builder.SpringApplicationBuilder;

import foo.app.config1.App1Config;
import foo.app.config2.App2Config;

public class Application {

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class)
                .properties("spring.application.name:parent", "spring.cloud.config.enabled:true");
        builder.child(App1Config.class)
                .properties("spring.application.name:app1", "spring.jmx.default-domain:app1", "server.port:8081")
                .run(args);
        builder.child(App2Config.class)
                .properties("spring.application.name:app2", "spring.jmx.default-domain:app2", "server.port:8082")
                .run(args);
    }
}
