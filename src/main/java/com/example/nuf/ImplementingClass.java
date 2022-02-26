package com.example.nuf;

import org.springframework.stereotype.Component;

@Component
public class ImplementingClass {

    // Called at least once!
    // But the 'foo' is grey (means no usages)!!
    // <CNTR>+Click on 'foo' does not show/open UsingClass::bar -> bug
    // <CNTR>+Click on 'foo' says 'No usages found in Project Files'
    // <ALT>+F7 on 'foo' says 'No usages found in Project Files'
    public void foo() {
    }
}
