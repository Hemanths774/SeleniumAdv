package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class FetchSingleData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("./Excel/Seletest.xlsx");
			Workbook book = WorkbookFactory.create(file);
			Sheet sh = book.getSheet("Sheet1");
			Row ro = sh.getRow(3);
			Cell ce = ro.getCell(4);
			//double value = ce.getNumericCellValue();
			//String value1 = ce.getStringCellValue();
			String value2 = ce.toString();
			//System.out.println(value);
			//System.out.println(value1);
			System.out.println(value2);
			
	}

}
