package org.javaBasedConfigeration.Resources;

import org.javaBasedConfigeration.Beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean("stdId1")
    public Student beanObj1() {
        Student std1 = new Student();
        std1.setName("Nk");
        std1.setRollno(103);
        return std1;
    }

    @Bean("stdId2")
    public Student beanObj2() {
            Student std2 = new Student();
            std2.setName("Abu");
            std2.setRollno(104);
            return std2;
    }
}
