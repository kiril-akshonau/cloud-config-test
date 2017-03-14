package foo.app.config2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class App2Config {

    @RestController
    public class PingController {

        @Value("${foo.app2.pong}")
        private String message;

        @RequestMapping("/ping")
        public String ping() {
            return message;
        }
    }

}
