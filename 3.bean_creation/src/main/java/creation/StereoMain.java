package creation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class StereoMain {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(StereoConfig.class);

        var accountService = context.getBean(AccountService.class);

        accountService.setAccountName("icici");

        var accountService2 = context.getBean(AccountService.class);

        accountService.setAccountName("hdfc");

        System.out.println(accountService2.getAccountName());
    }
}
