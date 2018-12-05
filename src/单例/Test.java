package 单例;

public class Test {
	public static void main(String [] args){
		//Singleton s = new Singleton();   //不能访问
		Singleton.getInstance();  //可以访问
	}
}
