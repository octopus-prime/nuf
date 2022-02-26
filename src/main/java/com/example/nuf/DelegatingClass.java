package com.example.nuf;

import lombok.experimental.Delegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DelegatingClass {

    @Autowired
    @Delegate
    // Here ImplementingClass::foo is exposed and internally called
    private ImplementingClass implementingClass;
}
