package com.stmtok;

public class HelloJNI {
    public native void print();

    static {
        System.loadLibrary("stmtok");
    }
}
