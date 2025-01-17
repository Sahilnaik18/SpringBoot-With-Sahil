package org.example.Mainn;

import org.example.Stud.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        String configloc = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(configloc);

        Student std1 = (Student) context.getBean("stdId1");
        std1.display();

        System.out.println("--------------------------");

        Student std2 = (Student) context.getBean("stdId2");
        std2.display();
    }
}
