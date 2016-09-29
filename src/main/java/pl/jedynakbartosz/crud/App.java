package pl.jedynakbartosz.crud;

import org.joda.time.LocalDate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import pl.jedynakbartosz.crud.configuration.AppConfig;
import pl.jedynakbartosz.crud.model.Users;
import pl.jedynakbartosz.crud.services.UserService;

import java.math.BigDecimal;

public class App {


    public static void main(final String[] args) {
        final AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        final UserService userService = (UserService) context.getBean("userServiceImpl");
        final Users user = new Users();
        user.setName("mithat");
        user.setSalary(new BigDecimal("10000"));
        user.setSsn("abcd");
        user.setStarted_date(new LocalDate());

        userService.saveUser(user);


    }

}
