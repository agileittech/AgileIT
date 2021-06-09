package mypackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fi = new FileInputStream("C:\\Filehandling\\Myworkbook.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fi); //created workbook
		Sheet sheet = workbook.getSheet("Mysheet");  //created sheet
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		Cell cell2 =row.getCell(1);
		System.out.println(cell.getStringCellValue());
		System.out.println(cell2.getStringCellValue());
		workbook.close();
		fi.close();
		
	
	}

}
