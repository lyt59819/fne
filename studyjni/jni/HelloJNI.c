#include<jni.h>
#include <stdio.h>
#include "com_huachao_java_HelloJNI.h"

JNIEXPORT void JNICALL Java_com_huachao_java_HelloJNI_sayHello(JNIEnv *env, jobject thisObj) {
   printf("Hello World! 123456\n");

   return;
}
