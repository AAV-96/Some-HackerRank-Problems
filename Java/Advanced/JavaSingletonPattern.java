import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    public String str;
    private Singleton() {
        //this.str = str;
    }
    static Singleton obj = new Singleton();
    static Singleton getSingleInstance() {        
        return obj;
    }
}
