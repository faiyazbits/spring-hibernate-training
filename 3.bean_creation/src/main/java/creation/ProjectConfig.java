package creation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {


    @Bean
    @Primary
    Controller userController(){
        var c = new Controller();
        c.setUrl("/user");
        return  c;
    }

    @Bean
    Controller projectController(){
        var c = new Controller();
        c.setUrl("/project");
        return  c;
    }

    @Bean
    String hello(){
        return "hello world";
    }

}
