package lk.restaurant.Repository.Custom.Impl;

import lk.restaurant.DBConnection.PosStatement;
import lk.restaurant.Model.Front_kot_item_temp;
import lk.restaurant.Repository.Custom.Front_kot_item_temp_Custom;

import java.sql.ResultSet;

public class Front_kot_item_temp_CustomImpl implements Front_kot_item_temp_Custom{

    @Override
    public boolean saveTemp(Front_kot_item_temp temp) {
        try {
            return PosStatement.executeUpdate("INSERT INTO front_kot_item_temp VALUES(?,?,?,?,?)",
                    temp.getKotno(), temp.getItemcode(), temp.getQty(), temp.getType(), temp.getPrinter()) > 0;
        }catch (Exception e){
            System.out.println(e);
        }
        return true;
    }

    @Override
    public boolean updateItemTemp(Front_kot_item_temp temp) throws Exception {
        return PosStatement.executeUpdate("UPDATE front_kot_item_temp SET Qty='"+temp.getQty()+"' WHERE KotNo='"+temp.getKotno()+"' AND ItemCode='"+temp.getItemcode()+"'")>0;
    }

    @Override
    public boolean deleteItemTemp(Integer kot, Integer itemCode) throws Exception {
        return PosStatement.executeUpdate("DELETE FROM front_kot_item_temp WHERE kotNo='" + kot + "' AND ItemCode='" + itemCode + "'") > 0;
    }

    @Override
    public ResultSet getRateForPickMeAndUber() throws Exception {
     //  return PosStatement.executeQuery("SELECT fixedprice FROM fixedRate");
        return null;

    }

    @Override
    public ResultSet getLastOrderDetails(Integer integer) throws Exception {
        return PosStatement.executeQuery("SELECT SUM(`unit_prices` * `QTY`) as total,`order_time`,`kot_bot_no` FROM `front_kot_bot_item`  WHERE `kot_bot_no`='"+integer+"'");
    }
}
