package Controller;

import Dto.CustomerDto;
import Model.CustomerModel;

import java.util.ArrayList;

public class CustomerController {
    private CustomerModel customerModel;

    public CustomerController() throws Exception{
        this.customerModel=new CustomerModel();
    }

    public String saveCustomer(CustomerDto customerDto) throws Exception{
        String resp =customerModel.saveCustomer(customerDto);
        return resp;
    }

    public ArrayList<CustomerDto> getAllCustomer()throws Exception{
        ArrayList<CustomerDto> customerDtos=customerModel.getAllCustomer();
        return customerDtos;
    }
    public CustomerDto searchCustomer(String custId)throws Exception{
        CustomerDto customerDto=customerModel.getCustomer(custId);
        return customerDto;
    }
    public String deleteCustomer(String custId) throws Exception{
        String resp = customerModel.deleteCustomer(custId);
        return resp;
    }
    public String updateCustomer(CustomerDto customerDto)throws Exception{
        String resp = customerModel.updateCustomer(customerDto);
        return resp;
    }
}
