package com.Vtiger.GenericLibraries;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelUtilityVtigerCRM implements PathFilesVtigerCRM{

	public FileInputStream fi;
	public FileOutputStream fo;
	public WorkbookFactory wb;
	//String path=ExcelPath;
	String path;
	
	public ExcelUtilityVtigerCRM (String path)
	{
		this.path=path;
	}
	
	public int getRowCount(String sheetName) throws EncryptedDocumentException, IOException {
		fi=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sheetNum=wb.getSheet(sheetName);
		int rowCount=sheetNum.getLastRowNum();
		wb.close();
		return rowCount;
	}
	
	public int getCellCount(String sheetName,int rownum) throws EncryptedDocumentException, IOException {
		fi=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sheetNum=wb.getSheet(sheetName);
		Row row = sheetNum.getRow(rownum);
		int cellCount = row.getLastCellNum();
		wb.close();
		return cellCount;	
	}
	
	public String getCellData(String sheetName,int rownum, int colnum) throws EncryptedDocumentException, IOException {
		fi=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sheetNum=wb.getSheet(sheetName);
		Row row = sheetNum.getRow(rownum); 
		Cell cell = row.getCell(colnum);
		
		DataFormatter formatter=new DataFormatter();
		String data;
		try {
			data=formatter.formatCellValue(cell);
		}
		catch(Exception e) {
			data="";
		}
		wb.close();
		return data;	
	}
}
