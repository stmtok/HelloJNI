#include <jni.h>
#include <stdio.h>
#include "com_stmtok_HelloJNI.h"

JNIEXPORT void JNICALL
Java_com_stmtok_HelloJNI_print(JNIEnv *env, jobject obj)
{
    printf("Hello World!\n");
    return;
}

JNIEXPORT void JNICALL
Java_com_stmtok_HelloJNI_add(JNIEnv *env, jobject obj, jobject callback)
{
    printf("Add Callback\n");
    return;
}