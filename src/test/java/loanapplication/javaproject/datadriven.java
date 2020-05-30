package loanapplication.javaproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriven {

	
	@SuppressWarnings("deprecation")
	public ArrayList<String> dddata(String testcaseName) throws IOException
	{
	ArrayList<String> Totalrows =new ArrayList<String>();
	FileInputStream f =new FileInputStream("C:\\Users\\sende\\automation.xlsx");
	XSSFWorkbook work =new XSSFWorkbook(f);
	int total=work.getNumberOfSheets();
	for(int i=0;i<total;i++)
	{
		if(work.getSheetName(i).equalsIgnoreCase("super"))
				
				{
		XSSFSheet sheet=work.getSheetAt(i);
		
		Iterator<Row> rowexcel= sheet.iterator();
		Row specificrow=rowexcel.next();
		Iterator<Cell> ce=specificrow.iterator();
		int k=0;
		int col=0;
		while(ce.hasNext())
		{
			Cell val=ce.next();
			if(val.getStringCellValue().equalsIgnoreCase("Testcases"))
			
			{
				col=k;
				
			}
			
			k++;
			
		}
		
		System.out.println(col);
		
		while(rowexcel.hasNext())
		{
			
			Row r=rowexcel.next();
			if(r.getCell(col).getStringCellValue().equalsIgnoreCase(testcaseName))
				
			{
				Iterator<Cell> c=r.iterator();
				while(c.hasNext())
					
				{
				Cell q=c.next();
				if (q.getCellTypeEnum()==CellType.STRING)
				{
					Totalrows.add((q.getStringCellValue()));
				}
				else {
					
					Totalrows.add(NumberToTextConverter.toText(q.getNumericCellValue()));
				}

				
				}
			}
		}
		
	}
	

}
return Totalrows;
}
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
	}	
}

