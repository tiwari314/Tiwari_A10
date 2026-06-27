package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToLearnExcelSheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream  yn =new FileInputStream("./Testdata/TestScriptData.xlsx");	
		Workbook wb=WorkbookFactory.create(yn);
		String value = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(value);

}
}