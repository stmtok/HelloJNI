package com.stmtok;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloJNITest {

    private HelloJNI jni;

    @BeforeEach
    void before() {
        jni = new HelloJNI();
    }

    @Test
    public void helloTest() {
        jni.print();
    }

    @Test
    public void addTest() {
        jni.add(() -> {
            // Nothing
        });
    }
}
