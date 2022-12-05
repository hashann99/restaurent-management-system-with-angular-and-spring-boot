package lk.restaurant.ReportManager;

import lk.restaurant.DBConnection.PosDB;
import lk.restaurant.DTO.Commen.ResponsDTO;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.export.JRPrintServiceExporter;
import net.sf.jasperreports.engine.export.JRPrintServiceExporterParameter;

import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.attribute.AttributeSet;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.HashPrintServiceAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.print.attribute.standard.MediaSizeName;
import javax.print.attribute.standard.PrinterName;
import java.awt.print.PageFormat;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;


public class ReportManager {

    public boolean printInvoice(ResponsDTO kot) {
        System.out.println(kot.getId());
        boolean isworked = true;
        Connection connection = null;
        try {
            connection = PosDB.getInstance().getConnection();
        } catch (ClassNotFoundException e) {
            isworked = false;
            e.printStackTrace();
        } catch (SQLException throwables) {
            isworked = false;
            throwables.printStackTrace();
        }
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("kotNo", kot.getId());
        try {
            JasperReport jasperReport = JasperCompileManager.compileReport("src/main/java/lk/ites/HotelPOS/Report/Invoice.jrxml");
//            JasperReport jasperReport = JasperCompileManager.compileReport(System.getProperty("user.dir") + File.separatorChar + "src\\Report\\Invoice.jrxml");
            JRDataSource jrDataSource = new JREmptyDataSource();
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, map, connection);
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:\\my\\Invoice.pdf");
            PrinterJob printerJob = PrinterJob.getPrinterJob();
            PageFormat pageFormat = PrinterJob.getPrinterJob().defaultPage();
            printerJob.defaultPage(pageFormat);
            int selectedService = 0;
            System.out.println("Start Printing....");
            AttributeSet attributeSet = new HashPrintServiceAttributeSet(new PrinterName("GT800",null));
            PrintService[] printService = PrintServiceLookup.lookupPrintServices(null, attributeSet);
            System.out.println("Printing....");
                try {
                    printerJob.setPrintService(printService[selectedService]);
                    System.out.println("Printed Invoice.....");
                    isworked=true;
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Print Error");
                }
            JRPrintServiceExporter exporter;
            PrintRequestAttributeSet printRequestAttributeSet = new HashPrintRequestAttributeSet();
            printRequestAttributeSet.add(MediaSizeName.NA_LETTER);
            printRequestAttributeSet.add(new Copies(1));
            exporter = new JRPrintServiceExporter();
            exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
            exporter.setParameter(JRPrintServiceExporterParameter.PRINT_SERVICE, printService[selectedService]);
            exporter.setParameter(JRPrintServiceExporterParameter.PRINT_SERVICE_ATTRIBUTE_SET, printService[selectedService].getAttributes());
            exporter.setParameter(JRPrintServiceExporterParameter.PRINT_REQUEST_ATTRIBUTE_SET, printRequestAttributeSet);
            exporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PAGE_DIALOG, Boolean.FALSE);
            exporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PRINT_DIALOG, Boolean.FALSE);
            exporter.exportReport();

        } catch (JRException e) {
            isworked = false;
            e.printStackTrace();
        }
        return isworked;
    }
}



