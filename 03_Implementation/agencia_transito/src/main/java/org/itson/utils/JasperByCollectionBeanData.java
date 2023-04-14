/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.utils;

import java.util.List;
import org.itson.dominio.Tramite;

/**
 *
 * @author march
 */
public class JasperByCollectionBeanData {
    
    public JasperByCollectionBeanData(List<Tramite> listaTramites){
        String outputFile = "C:\\Users\\march\\OneDrive\\Escritorio\\AgenciaTransito-ADB\\03_Implementation\\agencia_transito\\src\\main\\resources\\pdfs" + "ReporteTramites.pdf";
        
        JRBeanCollectionDataSource itemsJRBean = new JRBeanCollectionDataSource(listaTramites);
    }
}
