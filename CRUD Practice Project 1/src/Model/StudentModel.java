/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Dto.StudentDto;
import com.mysql.cj.protocol.Resultset;
import db.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
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
    
        String sql = "INSERT INTO student (name, age, grade) VALUES (?, ?, ?)";
        
         PreparedStatement statement = connection.prepareStatement(sql);
         statement.setString(1,studentDto.getName());
         statement.setInt(2,studentDto.getAge());
         statement.setInt(3,studentDto.getGrade());
        
         return statement.executeUpdate() >0 ? "Success" : "Fail";
    }
    
    public ArrayList<StudentDto> getAllStudent() throws  Exception{
    
        String sql="SELECT * FROM student";       
        PreparedStatement statement=connection.prepareStatement(sql);
        ResultSet rst= statement.executeQuery();
        
        ArrayList<StudentDto> studentDtos= new ArrayList();
        
        while(rst.next()){
        
            StudentDto dto = new StudentDto(rst.getString("name"),rst.getInt("age"),rst.getInt("grade"));
            studentDtos.add(dto);
        }
        return studentDtos;
    }
    
    public StudentDto getStudent(String studentName) throws Exception{
    
        String sql="SELECT * FROM student WHERE name = ?";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setString(1, studentName);
        ResultSet rst= statement.executeQuery();
        
        while(rst.next()){
        
            StudentDto dto = new StudentDto(rst.getString("name"),rst.getInt("age"),rst.getInt("grade"));
            return dto;
        }
        return null;
    }
    
    public String deleteStudent(String name)throws  Exception{
    
        String sql ="DELETE FROM student WHERE name = ?";
        PreparedStatement statement= connection.prepareStatement(sql);
        statement.setString(1,name );
        
        return statement.executeUpdate() >0 ? "Success" : "Fail";
    }
    
    public String updateStudent(StudentDto studentDto)throws Exception{
    
        String sql ="UPDATE student SET age=? grade=? WHERE name=?";
        PreparedStatement statement=connection.prepareStatement(sql);
        
        statement.setInt(1, studentDto.getAge());
        statement.setInt(2, studentDto.getGrade());
        statement.setString(3, studentDto.getName());
    }
}
