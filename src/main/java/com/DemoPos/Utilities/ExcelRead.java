package com.DemoPos.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.DemoPos.Constants.Constants;

public class ExcelRead {

	public static FileInputStream f;
	public static XSSFWorkbook w;
	public static XSSFSheet sh;

	public static String getCellStringData(int RowNum, int ColNum, String Sheet) {

		try {
			System.out.println(Constants.CONFIGPATH_EXCELREADER);
			f = new FileInputStream(Constants.CONFIGPATH_EXCELREADER);

		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		try {
			w = new XSSFWorkbook(f);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		sh = w.getSheet(Sheet);
		Row r = sh.getRow(RowNum);
		Cell c = r.getCell(ColNum);
		System.out.println(c);
		return c.getStringCellValue();
//return String.valueOf(c);
	}

	public static int getCellNumericData(int RowNum, int ColNum, String Sheet) {
		try {
			f = new FileInputStream(Constants.CONFIGPATH_EXCELREADER);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}

		try {
			w = new XSSFWorkbook(f);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		sh = w.getSheet(Sheet);
		return (int) sh.getRow(RowNum).getCell(ColNum).getNumericCellValue();

	}

}
