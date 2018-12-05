package 单例;
/**更标准
 * Java Singleton模式主要作用是保证在Java应用程序中，一个类Class只有一个实例存在。 
 * 使用Singleton的好处还在于可以节省内存，因为它限制了实例的个数，有利于Java垃圾回收（garbage collection）。**/
public class Singleton2 {  
    
    private final static Singleton2 singleton2 = new Singleton2();  
      
    private Singleton2(){}
      
    public static Singleton2 getInstance(){  
        return singleton2;  
    }  
      
}  