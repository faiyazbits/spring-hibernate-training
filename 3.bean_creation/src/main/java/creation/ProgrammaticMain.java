package creation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ProgrammaticMain {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);


        context.registerBean("userService",  UserService.class, () -> new UserService(2));


        var userService = context.getBean(UserService.class);

        System.out.println(userService.getNoOfUsers());
    }

}
