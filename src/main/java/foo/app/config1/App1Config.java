package foo.app.config1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class App1Config {

    @RestController
    public class PingController {

        @Value("${foo.app1.pong}")
        private String message;

        @RequestMapping("/ping")
        public String ping() {
            return message;
        }
    }

}
