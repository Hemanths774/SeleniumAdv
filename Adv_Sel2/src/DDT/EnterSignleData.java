package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class EnterSignleData {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./Excel/Seletest.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh = book.getSheet("Sheet1");
	Row ro = sh.createRow(3);
	Cell cel = ro.createCell(0);
	cel.setCellValue("my name is hemanth");
	FileOutputStream fos = new FileOutputStream("./Excel/Seletest.xlsx");
	book.write(fos);
	System.out.println(cel);
	
}
}
