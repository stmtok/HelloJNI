package com.stmtok;

public class HelloJNI {
    public native void print();

    public native void add(Callback callback);

    static {
        System.loadLibrary("stmtok");
    }
}
