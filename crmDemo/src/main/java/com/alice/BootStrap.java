package com.alice;

import com.alice.crm.commons.kafka.KafkaSender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.kafka.annotation.EnableKafka;


/**
 * @author scliu
 * @date 2019-9-12 10:10:56
 */
@SpringBootApplication
@EnableKafka
public class BootStrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BootStrap.class, args);

        KafkaSender sender = context.getBean(KafkaSender.class);
        for (int i = 0; i < 10; i++) {
            sender.send();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
