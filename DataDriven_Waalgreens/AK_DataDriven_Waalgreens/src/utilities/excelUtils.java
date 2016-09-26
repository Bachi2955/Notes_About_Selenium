package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class excelUtils {

	public static Workbook workbook;
	public static Sheet sheet;
	public static int row;
	public static int col;
	public static Cell cell;
	public static String cellData;
	
	public static void openExcel(String path, String nameOfTheSheet) throws BiffException, IOException
	{
		FileInputStream fis = new FileInputStream(path);
		workbook = Workbook.getWorkbook(fis);
		sheet = workbook.getSheet(nameOfTheSheet);		
	}
	
	public static String getCellData(int colNum, int rowNum)	
	{
		row = rowNum;
		col = colNum;
		cell = sheet.getCell(col, row);
		cellData = cell.getContents();
		return cellData;		
	}
	}
