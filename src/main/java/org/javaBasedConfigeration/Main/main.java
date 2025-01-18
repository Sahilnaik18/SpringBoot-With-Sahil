package org.javaBasedConfigeration.Main;

import org.javaBasedConfigeration.Beans.Student;
import org.javaBasedConfigeration.Resources.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);

        Student student = (Student) context.getBean("stdId1");
        student.display();
    }
}
