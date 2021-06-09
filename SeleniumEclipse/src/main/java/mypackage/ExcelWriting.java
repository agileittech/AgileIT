package mypackage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelWriting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        FileOutputStream fo = new FileOutputStream("C:\\Filehandling\\Myworkbook.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(); //created workbook
		Sheet sheet = workbook.createSheet("Mysheet");  //created sheet
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		Cell cell2 =row.createCell(1);
		CellStyle style = workbook.createCellStyle();
		style.setFillBackgroundColor(IndexedColors.YELLOW.getIndex());
		style.setFillBackgroundColor(IndexedColors.YELLOW.getIndex());
		//style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cell.setCellValue("This is from excel sheets");
		cell.setCellStyle(style);
		cell2.setCellValue("This is from 2nd cell");
		cell2.setCellStyle(style);
		workbook.write(fo);
		workbook.close();
	
		
	}

}
