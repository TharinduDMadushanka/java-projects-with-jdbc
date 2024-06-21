package Controller;

import Dto.OrderDetailDto;
import Dto.OrderDto;
import Model.OrderModel;

import java.util.ArrayList;

public class OrderController {

    private OrderModel orderModel;

    public OrderController()throws Exception {
        orderModel = new OrderModel();
    }

    public String placeOrder(OrderDto orderDto, ArrayList<OrderDetailDto> orderDetailDtos)throws Exception {

        return orderModel.placeOrder(orderDto, orderDetailDtos);
    }

}
