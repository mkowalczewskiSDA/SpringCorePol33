package przyklad3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //HelloWorld helloWorld = new HelloWorld();
        HelloWorld helloWorld = (HelloWorld) context.getBean("myBean");
        helloWorld.getMessage();
    }
}
