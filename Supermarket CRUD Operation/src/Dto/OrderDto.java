package Dto;

public class OrderDto {

    private String orderId;
    private String custId;
    private String date;

    public OrderDto() {
    }

    public OrderDto(String orderId, String custId, String date) {
        this.orderId = orderId;
        this.custId = custId;
        this.date = date;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "orderId='" + orderId + '\'' +
                ", custId='" + custId + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
