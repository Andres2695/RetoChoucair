package com.choucairtesting.utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class Datos {

    private FileInputStream file ;
    private XSSFWorkbook book;
    private XSSFSheet hoja;

    public List<Solicitud> urlChouc(){
        List<Solicitud> rows = new ArrayList<Solicitud>();
        try {
            this.file = new FileInputStream(new File("choucRet.xlsx"));
            this.book = new XSSFWorkbook(file);
            this.hoja = book.getSheet("Url");
            Row row;

            int cant_sols = (int)(hoja.getRow(1).getCell(6).getNumericCellValue());
            for(int i =1; i <cant_sols; i++){
                row = hoja.getRow(i);
                Solicitud nueva = new Solicitud(row.getCell(0).getStringCellValue());
                rows.add(nueva);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return rows;

    }

    public List<Formacion> contactenos(){
        List<Formacion> rows = new ArrayList<Formacion>();
        try {
            this.file = new FileInputStream(new File("choucRet.xlsx"));
            this.book = new XSSFWorkbook(file);
            this.hoja = book.getSheet("Contactenos");
            Row row;

            int cant_sols = (int)(hoja.getRow(1).getCell(9).getNumericCellValue());
            for(int i =1; i <cant_sols; i++){
                row = hoja.getRow(i);
                Formacion nueva = new Formacion(row.getCell(0).getStringCellValue(),
                        row.getCell(1).getStringCellValue(),row.getCell(2).getStringCellValue(),
                        row.getCell(3).getStringCellValue(),  row.getCell(4).getStringCellValue(),
                        row.getCell(5).getStringCellValue(),row.getCell(6).getStringCellValue());
                rows.add(nueva);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return rows;

    }

}
