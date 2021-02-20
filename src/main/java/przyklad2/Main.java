package przyklad2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("przyklad2/Beans.xml");
        //HelloWorld helloWorld = new HelloWorld();
        HelloWorld helloWorld = (HelloWorld) context.getBean("myBean");
        helloWorld.getMessage();
    }


}
