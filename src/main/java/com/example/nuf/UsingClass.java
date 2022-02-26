package com.example.nuf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsingClass {

    @Autowired
    private DelegatingClass delegatingClass;

    public void bar() {
        // Here ImplementingClass::foo is called
        // <CNTR>+Click on 'foo' opens ImplementingClass::foo -> ok
        delegatingClass.foo();
    }
}
