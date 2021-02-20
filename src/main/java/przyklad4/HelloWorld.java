package przyklad4;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class HelloWorld {

    @PostConstruct
    public void init() {
        System.out.println("Bean is being created");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean will be destroyed now");
    }

    public void message() {
        System.out.println("Hello World");
    }

}
