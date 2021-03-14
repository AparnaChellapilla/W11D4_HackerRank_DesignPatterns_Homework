package com.tts.SingletonDesignPattern;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


public class Singleton{

    private Singleton() {}
    public String str;
    private static Singleton instance = new Singleton();
    public static Singleton getSingleInstance() { return instance; }

}

/* from Joshua
class Singleton{
    public String str;
    private static Singleton ourRef;
    private Singleton(){
        this.str = "Hello I am a singleton! Let me say hello world to you";
    }
    public static Singleton getSingleInstance(){
        if (ourRef == null){
            return ourRef = new Singleton();
        } else return ourRef;
    }
}
*/
/* from Yusuf
class Singleton{
    public String str;
    private static Singleton instance = null;
    private Singleton(){
    }
    public static Singleton getSingleInstance(){
        if (instance==null) instance = new Singleton();
        return instance;
    }
}
 */