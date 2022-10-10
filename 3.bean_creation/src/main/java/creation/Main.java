package creation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);


        var f = context.getBean(Controller.class);

        var str = context.getBean(String.class);

        System.out.println(f.getUrl());
        System.out.println(str);
    }
}
