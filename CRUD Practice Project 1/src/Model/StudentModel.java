/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Dto.StudentDto;
import db.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
/**
 *
 * @author ASUS
 */
public class StudentModel {
    
    private final Connection connection;
    
    public StudentModel() throws SQLException, ClassNotFoundException{
    
        this.connection=DBConnection.getInstance().getConnection();
    }
    
    public String saveStudent(StudentDto studentDto) throws Exception{
    
        String sql="INSERT INTO student VALUE (?,?,?) ";
        
         PreparedStatement statement = connection.prepareStatement(sql);
         statement.setString(1,studentDto.getName());
         statement.setInt(2,studentDto.getAge());
         statement.setInt(3,studentDto.getGrade());
        
         return statement.executeUpdate() >0 ? "Success" : "Fail";
    }
}
