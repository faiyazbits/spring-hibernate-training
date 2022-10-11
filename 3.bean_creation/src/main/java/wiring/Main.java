package wiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);

        var userController = context.getBean(Controller.class);

        var res = userController.getResponse();

        System.out.println(userController.getAccountService().getProjectName());

    }
}
