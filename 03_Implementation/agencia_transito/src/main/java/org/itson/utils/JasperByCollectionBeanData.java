/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.itson.dominio.Tramite;

/**
 *
 * @author march
 */
public class JasperByCollectionBeanData {
    
    public JasperByCollectionBeanData(List<Tramite> listaTramites) throws JRException{
        String outputFile = "C:\\Users\\march\\OneDrive\\Escritorio\\AgenciaTransito-ADB\\03_Implementation\\agencia_transito\\src\\main\\resources\\pdfs" + "ReporteTramites.pdf";
        
        JRBeanCollectionDataSource itemsJRBean = new JRBeanCollectionDataSource(listaTramites);
    
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("Parameter1", itemsJRBean);
        
        try {
            InputStream input = new FileInputStream(new File("C:\\Users\\march\\OneDrive\\Escritorio\\AgenciaTransito-ADB\\03_Implementation\\agencia_transito\\src\\main\\resources\\pdfs\\ReporteTramites_A4.jrxml"));
            
            JasperDesign jasperDesign = JRXmlLoader.load(input);
            
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());
            
            JasperViewer.viewReport(jasperPrint);
            
            System.out.println("Archivo generado...");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JasperByCollectionBeanData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}