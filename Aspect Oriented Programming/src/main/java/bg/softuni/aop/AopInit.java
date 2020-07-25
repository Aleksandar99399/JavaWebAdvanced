package bg.softuni.aop;

import bg.softuni.aop.models.Student;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class AopInit implements CommandLineRunner {

    private final Student student;

    public AopInit(Student student) {
        this.student = student;
    }

    @Override
    public void run(String... args) throws Exception {
       // student.sayHello();
        student.echo("123");
    }


}
