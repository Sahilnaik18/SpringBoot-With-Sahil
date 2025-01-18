package org.javaBasedConfigeration.Resources;

import org.javaBasedConfigeration.Beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public Student stdId1(){
        Student std1 = new Student();
        std1.setName("Nk");
        std1.setRollno(103);
        return  std1;

    }
}
