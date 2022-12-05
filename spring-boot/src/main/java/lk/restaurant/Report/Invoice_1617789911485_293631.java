package lk.restaurant.Report;/*
 * Generated by JasperReports - 4/7/21 3:35 PM
 */
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.fill.*;

import java.util.*;
import java.math.*;
import java.text.*;
import java.io.*;
import java.net.*;

import net.sf.jasperreports.engine.*;
import java.util.*;
import net.sf.jasperreports.engine.data.*;


/**
 *
 */
public class Invoice_1617789911485_293631 extends JREvaluator
{


    /**
     *
     */
    private JRFillParameter parameter_total = null;
    private JRFillParameter parameter_OrderTime = null;
    private JRFillParameter parameter_REPORT_LOCALE = null;
    private JRFillParameter parameter_REPORT_TIME_ZONE = null;
    private JRFillParameter parameter_REPORT_VIRTUALIZER = null;
    private JRFillParameter parameter_REPORT_SCRIPTLET = null;
    private JRFillParameter parameter_REPORT_PARAMETERS_MAP = null;
    private JRFillParameter parameter_REPORT_CONNECTION = null;
    private JRFillParameter parameter_REPORT_CLASS_LOADER = null;
    private JRFillParameter parameter_REPORT_DATA_SOURCE = null;
    private JRFillParameter parameter_REPORT_URL_HANDLER_FACTORY = null;
    private JRFillParameter parameter_IS_IGNORE_PAGINATION = null;
    private JRFillParameter parameter_kotNo = null;
    private JRFillParameter parameter_REPORT_FORMAT_FACTORY = null;
    private JRFillParameter parameter_REPORT_MAX_COUNT = null;
    private JRFillParameter parameter_REPORT_RESOURCE_BUNDLE = null;
    private JRFillField field_total = null;
    private JRFillField field_unit_prices = null;
    private JRFillField field_item_name = null;
    private JRFillField field_order_time = null;
    private JRFillField field_QTY = null;
    private JRFillField field_User_Name = null;
    private JRFillField field_Item_Code = null;
    private JRFillVariable variable_PAGE_NUMBER = null;
    private JRFillVariable variable_COLUMN_NUMBER = null;
    private JRFillVariable variable_REPORT_COUNT = null;
    private JRFillVariable variable_PAGE_COUNT = null;
    private JRFillVariable variable_COLUMN_COUNT = null;
    private JRFillVariable variable_sumTotal = null;


    /**
     *
     */
    public void customizedInit(
        Map pm,
        Map fm,
        Map vm
        )
    {
        initParams(pm);
        initFields(fm);
        initVars(vm);
    }


    /**
     *
     */
    private void initParams(Map pm)
    {
        parameter_total = (JRFillParameter)pm.get("total");
        parameter_OrderTime = (JRFillParameter)pm.get("OrderTime");
        parameter_REPORT_LOCALE = (JRFillParameter)pm.get("REPORT_LOCALE");
        parameter_REPORT_TIME_ZONE = (JRFillParameter)pm.get("REPORT_TIME_ZONE");
        parameter_REPORT_VIRTUALIZER = (JRFillParameter)pm.get("REPORT_VIRTUALIZER");
        parameter_REPORT_SCRIPTLET = (JRFillParameter)pm.get("REPORT_SCRIPTLET");
        parameter_REPORT_PARAMETERS_MAP = (JRFillParameter)pm.get("REPORT_PARAMETERS_MAP");
        parameter_REPORT_CONNECTION = (JRFillParameter)pm.get("REPORT_CONNECTION");
        parameter_REPORT_CLASS_LOADER = (JRFillParameter)pm.get("REPORT_CLASS_LOADER");
        parameter_REPORT_DATA_SOURCE = (JRFillParameter)pm.get("REPORT_DATA_SOURCE");
        parameter_REPORT_URL_HANDLER_FACTORY = (JRFillParameter)pm.get("REPORT_URL_HANDLER_FACTORY");
        parameter_IS_IGNORE_PAGINATION = (JRFillParameter)pm.get("IS_IGNORE_PAGINATION");
        parameter_kotNo = (JRFillParameter)pm.get("kotNo");
        parameter_REPORT_FORMAT_FACTORY = (JRFillParameter)pm.get("REPORT_FORMAT_FACTORY");
        parameter_REPORT_MAX_COUNT = (JRFillParameter)pm.get("REPORT_MAX_COUNT");
        parameter_REPORT_RESOURCE_BUNDLE = (JRFillParameter)pm.get("REPORT_RESOURCE_BUNDLE");
    }


    /**
     *
     */
    private void initFields(Map fm)
    {
        field_total = (JRFillField)fm.get("total");
        field_unit_prices = (JRFillField)fm.get("unit_prices");
        field_item_name = (JRFillField)fm.get("item_name");
        field_order_time = (JRFillField)fm.get("order_time");
        field_QTY = (JRFillField)fm.get("QTY");
        field_User_Name = (JRFillField)fm.get("User_Name");
        field_Item_Code = (JRFillField)fm.get("Item_Code");
    }


    /**
     *
     */
    private void initVars(Map vm)
    {
        variable_PAGE_NUMBER = (JRFillVariable)vm.get("PAGE_NUMBER");
        variable_COLUMN_NUMBER = (JRFillVariable)vm.get("COLUMN_NUMBER");
        variable_REPORT_COUNT = (JRFillVariable)vm.get("REPORT_COUNT");
        variable_PAGE_COUNT = (JRFillVariable)vm.get("PAGE_COUNT");
        variable_COLUMN_COUNT = (JRFillVariable)vm.get("COLUMN_COUNT");
        variable_sumTotal = (JRFillVariable)vm.get("sumTotal");
    }


    /**
     *
     */
    public Object evaluate(int id) throws Throwable
    {
        Object value = null;

        switch (id)
        {
            case 0 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=0$
                break;
            }
            case 1 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=1$
                break;
            }
            case 2 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=2$
                break;
            }
            case 3 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=3$
                break;
            }
            case 4 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=4$
                break;
            }
            case 5 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=5$
                break;
            }
            case 6 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=6$
                break;
            }
            case 7 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=7$
                break;
            }
            case 8 : 
            {
                value = (java.lang.Double)(((java.lang.Double)field_total.getValue()));//$JR_EXPR_ID=8$
                break;
            }
            case 9 : 
            {
                value = (java.sql.Timestamp)(((java.sql.Timestamp)field_order_time.getValue()));//$JR_EXPR_ID=9$
                break;
            }
            case 10 : 
            {
                value = (java.lang.String)(((java.lang.String)field_User_Name.getValue()));//$JR_EXPR_ID=10$
                break;
            }
            case 11 : 
            {
                value = (java.lang.Integer)(((java.lang.Integer)field_Item_Code.getValue()));//$JR_EXPR_ID=11$
                break;
            }
            case 12 : 
            {
                value = (java.lang.String)(((java.lang.String)field_item_name.getValue()));//$JR_EXPR_ID=12$
                break;
            }
            case 13 : 
            {
                value = (java.lang.Double)(((java.lang.Double)field_unit_prices.getValue()));//$JR_EXPR_ID=13$
                break;
            }
            case 14 : 
            {
                value = (java.lang.Double)(((java.lang.Double)field_QTY.getValue()));//$JR_EXPR_ID=14$
                break;
            }
            case 15 : 
            {
                value = (java.lang.Double)(((java.lang.Double)field_total.getValue()));//$JR_EXPR_ID=15$
                break;
            }
            case 16 : 
            {
                value = (java.lang.Double)(((java.lang.Double)variable_sumTotal.getValue()));//$JR_EXPR_ID=16$
                break;
            }
            case 17 : 
            {
                value = (java.lang.Double)(((java.lang.Double)variable_sumTotal.getValue()));//$JR_EXPR_ID=17$
                break;
            }
           default :
           {
           }
        }
        
        return value;
    }


    /**
     *
     */
    public Object evaluateOld(int id) throws Throwable
    {
        Object value = null;

        switch (id)
        {
            case 0 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=0$
                break;
            }
            case 1 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=1$
                break;
            }
            case 2 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=2$
                break;
            }
            case 3 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=3$
                break;
            }
            case 4 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=4$
                break;
            }
            case 5 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=5$
                break;
            }
            case 6 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=6$
                break;
            }
            case 7 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=7$
                break;
            }
            case 8 : 
            {
                value = (java.lang.Double)(((java.lang.Double)field_total.getOldValue()));//$JR_EXPR_ID=8$
                break;
            }
            case 9 : 
            {
                value = (java.sql.Timestamp)(((java.sql.Timestamp)field_order_time.getOldValue()));//$JR_EXPR_ID=9$
                break;
            }
            case 10 : 
            {
                value = (java.lang.String)(((java.lang.String)field_User_Name.getOldValue()));//$JR_EXPR_ID=10$
                break;
            }
            case 11 : 
            {
                value = (java.lang.Integer)(((java.lang.Integer)field_Item_Code.getOldValue()));//$JR_EXPR_ID=11$
                break;
            }
            case 12 : 
            {
                value = (java.lang.String)(((java.lang.String)field_item_name.getOldValue()));//$JR_EXPR_ID=12$
                break;
            }
            case 13 : 
            {
                value = (java.lang.Double)(((java.lang.Double)field_unit_prices.getOldValue()));//$JR_EXPR_ID=13$
                break;
            }
            case 14 : 
            {
                value = (java.lang.Double)(((java.lang.Double)field_QTY.getOldValue()));//$JR_EXPR_ID=14$
                break;
            }
            case 15 : 
            {
                value = (java.lang.Double)(((java.lang.Double)field_total.getOldValue()));//$JR_EXPR_ID=15$
                break;
            }
            case 16 : 
            {
                value = (java.lang.Double)(((java.lang.Double)variable_sumTotal.getOldValue()));//$JR_EXPR_ID=16$
                break;
            }
            case 17 : 
            {
                value = (java.lang.Double)(((java.lang.Double)variable_sumTotal.getOldValue()));//$JR_EXPR_ID=17$
                break;
            }
           default :
           {
           }
        }
        
        return value;
    }


    /**
     *
     */
    public Object evaluateEstimated(int id) throws Throwable
    {
        Object value = null;

        switch (id)
        {
            case 0 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=0$
                break;
            }
            case 1 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=1$
                break;
            }
            case 2 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=2$
                break;
            }
            case 3 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=3$
                break;
            }
            case 4 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=4$
                break;
            }
            case 5 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=5$
                break;
            }
            case 6 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=6$
                break;
            }
            case 7 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=7$
                break;
            }
            case 8 : 
            {
                value = (java.lang.Double)(((java.lang.Double)field_total.getValue()));//$JR_EXPR_ID=8$
                break;
            }
            case 9 : 
            {
                value = (java.sql.Timestamp)(((java.sql.Timestamp)field_order_time.getValue()));//$JR_EXPR_ID=9$
                break;
            }
            case 10 : 
            {
                value = (java.lang.String)(((java.lang.String)field_User_Name.getValue()));//$JR_EXPR_ID=10$
                break;
            }
            case 11 : 
            {
                value = (java.lang.Integer)(((java.lang.Integer)field_Item_Code.getValue()));//$JR_EXPR_ID=11$
                break;
            }
            case 12 : 
            {
                value = (java.lang.String)(((java.lang.String)field_item_name.getValue()));//$JR_EXPR_ID=12$
                break;
            }
            case 13 : 
            {
                value = (java.lang.Double)(((java.lang.Double)field_unit_prices.getValue()));//$JR_EXPR_ID=13$
                break;
            }
            case 14 : 
            {
                value = (java.lang.Double)(((java.lang.Double)field_QTY.getValue()));//$JR_EXPR_ID=14$
                break;
            }
            case 15 : 
            {
                value = (java.lang.Double)(((java.lang.Double)field_total.getValue()));//$JR_EXPR_ID=15$
                break;
            }
            case 16 : 
            {
                value = (java.lang.Double)(((java.lang.Double)variable_sumTotal.getEstimatedValue()));//$JR_EXPR_ID=16$
                break;
            }
            case 17 : 
            {
                value = (java.lang.Double)(((java.lang.Double)variable_sumTotal.getEstimatedValue()));//$JR_EXPR_ID=17$
                break;
            }
           default :
           {
           }
        }
        
        return value;
    }


}
