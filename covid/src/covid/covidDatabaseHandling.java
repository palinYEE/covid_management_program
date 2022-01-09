package covid;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class covidDatabaseHandling {
	
	private String filePath;
	File file;
	covidUtils util = new covidUtils();
	
	public covidDatabaseHandling(String fileName){
		this.filePath = "/Users/yoon-yeoungjin/Desktop/git_repository/covid_management_program/data/" + fileName + ".xls";
		this.file = new File(filePath);
		
		boolean isExists = file.exists();
		try {
			if(!isExists) {
				file.createNewFile();
				FileOutputStream fos = new FileOutputStream(file);
				
				// 엑셀파일 객체 생성 
				HSSFWorkbook workbook = new HSSFWorkbook();
				// 엑셀파일의 시트 생성 
				HSSFSheet sheet = workbook.createSheet("user");
				
				// 시트의 행 생성 
				Row headerRow = sheet.createRow(0);
				
				// 시트의 열 생성
				Cell cell1 = headerRow.createCell(0);
				cell1.setCellValue("이름");
				Cell cell2 = headerRow.createCell(1);
				cell2.setCellValue("나이");
				Cell cell3 = headerRow.createCell(2);
				cell3.setCellValue("예약 지점");
				Cell cell4 = headerRow.createCell(3);
				cell4.setCellValue("백신 명");
				
				workbook.write(fos);
				fos.close();
	
				System.out.printf("\t Create file %s\n", fileName);
			}
		} catch(IOException ex) {
			ex.getMessage();
		}
	}
	
	public void inputData(int row, covidDataFormat data) {
		boolean isExists = file.exists();
		try {
			if(!isExists) {
				
				util.printError("Not exists file !!");
			}
			else {
				file.createNewFile();
				FileOutputStream fos = new FileOutputStream(file);
				
				// 엑셀파일 객체 생성 
				HSSFWorkbook workbook = new HSSFWorkbook();
				// 엑셀파일의 시트 생성 
				HSSFSheet sheet = workbook.createSheet("user");
				
				// 시트의 행 생성 
				Row headerRow = sheet.createRow(row);
				
				// 시트의 열 생성
				Cell cell1 = headerRow.createCell(0);
				cell1.setCellValue(data.getName());
				Cell cell2 = headerRow.createCell(1);
				cell2.setCellValue(data.getAge());
				Cell cell3 = headerRow.createCell(2);
				cell3.setCellValue(data.getArea());
				Cell cell4 = headerRow.createCell(3);
				cell4.setCellValue(data.getVaccine());
				
				workbook.write(fos);
				fos.close();
			}
		} catch(IOException ex) {
			ex.getMessage();
		}
	}

}
