package test;

import desingPatern.FacDemo;
import impl.Os;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Os os = new Androis();
//		os.spec();
//		Os os1 = new Widows();
//		os1.spec();
//		Os os2 = new Ioc();
//		os2.spec();

// ok
		System.out.println("demo of factory designe pattern..");
	System.out.println("ok");

   FacDemo fc=new FacDemo();
   Os t1=fc.getInstance("and");
   t1.spec();
   Os t2=fc.getInstance("aaa");
   t2.spec();
		

	}

}
