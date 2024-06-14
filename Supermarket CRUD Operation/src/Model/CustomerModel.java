package Model;

public class CustomerModel {
    private Connection connection;

    public CustomerModel() throws ClassNotFoundException, SQLException {
        this.connection =  DBConnection.getInstance().getConnection();
    }

    public String saveCustomer(CustomerDto customerDto) throws SQLException{
        String sql ="INSERT INTO customer VALUES(?,?,?,?,?,?,?,?,?)";

        PreparedStatement statement =connection.prepareStatement(sql);

        statement.setString(1, customerDto.getId());
        statement.setString(2, customerDto.getTitle());
        statement.setString(3, customerDto.getName());
        statement.setString(4, customerDto.getDob());
        statement.setDouble(5, customerDto.getSalary());
        statement.setString(6, customerDto.getAddress());
        statement.setString(7, customerDto.getCity());
        statement.setString(8, customerDto.getProvince());
        statement.setString(9, customerDto.getPostal());

        return statement.executeUpdate() >0 ? "Success" : "Fail";
    }
    public ArrayList<CustomerDto> getAllCustomer()throws Exception{
        String sql="SELECT * FROM customer";
        PreparedStatement statement=connection.prepareStatement(sql);
        ResultSet rst =statement.executeQuery();

        ArrayList<CustomerDto> customerDtos=new ArrayList<>();

        while (rst.next()) {
            CustomerDto dto=new CustomerDto(rst.getString("CustID"),rst.getString("CustTitle"),rst.getString("CustName"),rst.getString("DOB"),
                    rst.getDouble("salary"),rst.getString("CustAddress"),rst.getString("City"),rst.getString("Province"),rst.getString("PostalCode"));

            customerDtos.add(dto);
        }
        return customerDtos;
    }

    public CustomerDto getCustomer(String customerId)throws Exception{

        String sql = "SELECT * FROM customer WHERE CustID = ?";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setString(1, customerId);
        ResultSet rst = statement.executeQuery();

        while (rst.next()) {
            CustomerDto dto=new CustomerDto(rst.getString("CustID"),rst.getString("CustTitle"),rst.getString("CustName"),rst.getString("DOB"),
                    rst.getDouble("salary"),rst.getString("CustAddress"),rst.getString("City"),rst.getString("Province"),rst.getString("PostalCode"));

            return dto;
        }
        return null;
    }

    public String deleteCustomer(String customerId) throws Exception{
        String sql = "DELETE FROM customer WHERE CustID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, customerId);

        return statement.executeUpdate() >0 ? "Success" : "Fail";

    }

    public String updateCustomer(CustomerDto customerDto)throws Exception{

        String sql="UPDATE customer SET CustTitle=?,CustName=?,DOB=?,salary=?,CustAddress=?,City=?,Province=?,PostalCode=? WHERE CustID = ?";

        PreparedStatement statement = connection.prepareStatement(sql);


        statement.setString(1, customerDto.getTitle());
        statement.setString(2, customerDto.getName());
        statement.setString(3, customerDto.getDob());
        statement.setDouble(4, customerDto.getSalary());
        statement.setString(5, customerDto.getAddress());
        statement.setString(6, customerDto.getCity());
        statement.setString(7, customerDto.getProvince());
        statement.setString(8, customerDto.getPostal());
        statement.setString(9, customerDto.getId());

        return statement.executeUpdate() >0 ? "Success" : "Fail";
    }
}
