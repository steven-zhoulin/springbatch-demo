package com.topsail.spring.batch.springbatchdemo.batch;

import com.topsail.spring.batch.springbatchdemo.entity.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;

/**
 * @author Steven
 * @date 2020-01-10
 */
@Slf4j
public class PersonItemProcessor implements ItemProcessor<Person, String> {

    @Override
    public String process(Person person) {
        String greeting = "Hello " + person.getFirstName() + " " + person.getLastName() + "!";
        log.info("converting '{}' into '{}'", person, greeting);
        return greeting;
    }

}
