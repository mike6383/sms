package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dbUtil.dbConnection;

public class LogginModule {
    Connection connection;
    public LogginModule (){

        try {
            this.connection= dbConnection.getConnection();
        }catch (SQLException ex){
          ex.printStackTrace();
        }
        if (this.connection== null){
            System.exit(1);
        }
    }

    public boolean isdatabaseconnected(){
       return this.connection !=null;
    }
    public boolean islogin(String user, String pass, String opt)throws Exception{
        PreparedStatement pr= null;
        ResultSet rs= null;

        String sql ="SELECT * FROM login where username = ? and password = ?? and division = ?";
        try {
           pr = this.connection.prepareStatement(sql);
           pr.setString(1,user);
            pr.setString(2,pass);
            pr.setString(3,opt);

            rs =pr.executeQuery();

            boolean bool1;

            if (rs.next()){
                return true;
            }
            return false;
        }
        catch (SQLException ex) {
            return false;
        }
        finally {
            {
                pr.close();
                rs.close();
            }

        }
    }
}
