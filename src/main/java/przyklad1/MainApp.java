package przyklad1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("przyklad1/Beans.xml");
        //HelloWorld helloWorld = new HelloWorld();
        HelloWorld helloWorld = (HelloWorld) context.getBean("myBean");
        helloWorld.getMessage();

    }
}
