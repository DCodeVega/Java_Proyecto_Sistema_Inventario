/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reportes;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;

//import java.util.Iterator;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author USUARIO
 */
public class OpenExcel {

    public static void abrirExcel() throws IOException  {
        File file = new File(System.getProperty("user.home"), "Desktop/UPEA/Contabilidad/Libro1.xlsx");
      
      //Open the file using the default desktop application
      Desktop desktop = Desktop.getDesktop();
      if(file.exists()) {
          desktop.open(file);
      }
   }
}
