package com.example.katayevMid.db;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


@Component
public class MyConnection {
    String url;
    private Connection con;

    public MyConnection(String url) throws SQLException {
        this.url = url;
        try{
            con= DriverManager.getConnection(url);
        }catch (SQLException e){
            throw new Error("Error connecting to db ", e);
        }
    }

    public ResultSet GetSmth(String query) throws SQLException {
        if (con.isClosed()){
            return null;
        }

        Statement stmt=con.createStatement();

        ResultSet res=stmt.executeQuery(query);
        return res;
    }

}
