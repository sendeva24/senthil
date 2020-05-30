package loanapplication.javaproject;

import java.io.IOException;
import java.util.ArrayList;

public class DDaccess {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		datadriven d=new datadriven();
		ArrayList<String> newdata=d.dddata("Add Profile");
		System.out.println(newdata.get(0));
		System.out.println(newdata.get(1));
		System.out.println(newdata.get(2));
		System.out.println(newdata.get(3));

	}

}
