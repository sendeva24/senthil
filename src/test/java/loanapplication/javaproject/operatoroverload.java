package loanapplication.javaproject;

public class operatoroverload {
	
	public void operate(int a,int c) {
		
		System.out.println(a);
	
	}
	
	
	public void operate(int d) {
		
		System.out.println(d);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		operatoroverload o=new operatoroverload();
		o.operate(2,3);
		o.operate(5);
		

	}

}
