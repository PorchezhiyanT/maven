package mavenexcercies;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_driven {

	public static void main(String[] args) throws IOException {

		File fl = new File("E:\\Eclipse\\mavenprojects\\Excel\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(fl);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(2);
		Cell cell = row.getCell(1);
		CellType type = cell.getCellType();
		if(type.equals(CellType.STRING))
		{
			String value = cell.getStringCellValue();
			System.out.println(value);
		}
		else if (type.equals(CellType.NUMERIC)) 
		{
			double dvalue = cell.getNumericCellValue();
			int a=(int) dvalue;
			String value = String.valueOf(a);
			System.out.println(value);

		}

	}

}
