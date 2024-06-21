package Model;

import DB.DBConnection;
import Dto.OrderDetailDto;
import Dto.OrderDto;
import com.sun.source.tree.BreakTree;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderModel {

    private Connection connection;

    public OrderModel() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
    }

    public String placeOrder(OrderDto orderDto, ArrayList<OrderDetailDto> orderDetails) throws Exception {

        try {
            connection.setAutoCommit(false); // disable auto save

            String orderSql="INSERT INTO orders VALUES (?,?,?)";
            PreparedStatement orderStatement = connection.prepareStatement(orderSql);
            orderStatement.setString(1, orderDto.getOrderId());
            orderStatement.setString(2,orderDto.getDate());
            orderStatement.setString(3,orderDto.getCustId());

            boolean isOrderSaved=orderStatement.executeUpdate()>0;// true

            if(isOrderSaved){

                boolean isOrderDetailsSaved= true;

                String orderDetailsSql="INSERT INTO orderdetail VALUES (?,?,?,?)";
                for(OrderDetailDto orderDetailDto:orderDetails) {

                    PreparedStatement orderDetailsStatement=connection.prepareStatement(orderDetailsSql);
                    orderDetailsStatement.setString(1,orderDetailDto.getOrderId());
                    orderDetailsStatement.setString(2,orderDetailDto.getItemCode());
                    orderDetailsStatement.setInt(3,orderDetailDto.getQty());
                    orderDetailsStatement.setInt(4,orderDetailDto.getDiscount());

                    if(orderDetailsStatement.executeUpdate()>0){
                        isOrderDetailsSaved = false;
                    }
                }

                if(isOrderDetailsSaved){

                    boolean isItemUpdate = true;

                    String itemUpdateSql="UPDATE item SET QtyOnHand=QtyOnHand - ? WHERE ItemCode=? ";

                    for(OrderDetailDto orderDetailDto:orderDetails) {

                        PreparedStatement itemUpdateStatement=connection.prepareStatement(itemUpdateSql);
                        itemUpdateStatement.setInt(1,orderDetailDto.getQty());
                        itemUpdateStatement.setString(2,orderDetailDto.getItemCode());

                        if(itemUpdateStatement.executeUpdate()>0){
                            isItemUpdate = false;
                        }
                    }

                    if(isItemUpdate){
                        connection.commit();
                        return "Success";
                    }else {
                        connection.rollback();
                        return "Item update failed";
                    }
                }else {
                    connection.rollback();
                    return "Order details saved failed";
                }
            }else {
                connection.rollback();
                return "Order  not saved";
            }


        } catch (Exception e) {
            connection.rollback();// when disable program roll back all data
            e.printStackTrace();
        } finally {
            connection.setAutoCommit(true);
        }
        return "Success all";
    }
}
