package przyklad4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BootApplication  {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("przyklad4/Beans.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.message();
        context.registerShutdownHook();
    }

}
