package ru.job4j.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class ReminderService implements BeanNameAware {

    private String myBeanName;

    @Override
    public void setBeanName (String name) {
        this.myBeanName = name;
        System.out.println(myBeanName);
    }

    @PostConstruct
    public void init() {
        System.out.println("Bean is going through init.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean will be destroyed now.");
    }
}
