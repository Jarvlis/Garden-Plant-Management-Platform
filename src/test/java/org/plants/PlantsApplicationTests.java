package org.plants;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:Jarvlis
 * Date:2023-12-02
 * Time:12:50
 */
public class PlantsApplicationTests {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    }
}
