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




        } catch (Exception e) {
            connection.rollback();// when disable program roll back all data
            e.printStackTrace();
        } finally {
            connection.setAutoCommit(true);
        }
        return "Success all";
    }
}
