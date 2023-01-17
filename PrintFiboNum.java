package com.example;
import java.util.concurrent.*;

public class PrintFiboNum implements Callable<Integer>{

	private int countTo;
	public PrintFiboNum(int count) {
		// TODO Auto-generated constructor stub
		super();
		this.countTo=count;
		
	}
	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		 int n1=0,n2=1,n3,i;    
		 System.out.print(n1+" "+n2);
		 for(i=2;i<count;++i)   
		 {   
			 n3=n1+n2;    
			 System.out.print(" "+n3);    
			 n1=n2;    
			 n2=n3;    
		 }    
		
	}
	public static void main(String[] args) {
		new PrintFiboNum(10);
		System.out.println("\n");
		new PrintFiboNum(100);
		
	}
	
}
