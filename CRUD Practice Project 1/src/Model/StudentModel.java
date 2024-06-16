/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import db.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author ASUS
 */
public class StudentModel {
    
    private final Connection connection;
    
    public StudentModel() throws SQLException, ClassNotFoundException{
    
        this.connection=DBConnection.getInstance().getConnection();
    }
}
