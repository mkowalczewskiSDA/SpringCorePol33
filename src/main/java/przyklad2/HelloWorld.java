package przyklad2;

import org.springframework.stereotype.Component;

@Component("myBean")
public class HelloWorld {

    public void getMessage() {
        System.out.println("Hello World");
    }


}
