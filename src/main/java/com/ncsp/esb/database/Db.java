package com.ncsp.esb.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.function.Function;

public class Db {
	private static String connectionString = "jdbc:sqlserver://localhost:1433;"
			+ "databaseName=TestDB;"
			+ "integratedSecurity=true;"
			+ "user=intellectika\\p.sadchikova;"
			+ "password=1132612;";
	
	public static void execSql(String sql) {
        Connection connection = null;  
        Statement statement = null;

        try {
        	connection = DriverManager.getConnection(connectionString);
        	statement = connection.createStatement();
        	
        	String query = String.format(sql);
        	statement.executeUpdate(query);
        }  
        catch (Exception e) {  
            e.printStackTrace();  
        }  
        finally {  
        	try{
                if(statement!=null) {
                	connection.close();
            	}
             }catch(SQLException se){
            	 se.printStackTrace();
             }
             try{
                if(connection!=null) {
                	connection.close();
            	}
             }catch(SQLException se){
                se.printStackTrace();
             }
        }  
	}

	public static <T> ArrayList<T> select(String sql, Function<ResultSet, T> func) {
		Connection connection = null; 
        Statement statement = null;
        ArrayList<T> res = new ArrayList<T>();
        
        try {
        	connection = DriverManager.getConnection(connectionString);
        	statement = connection.createStatement();
        	
        	String query = String.format(sql);
        	ResultSet resultSet = statement.executeQuery(query);
        	while(resultSet.next()) {
        		res.add(func.apply(resultSet));
        	}
        }  
        catch (Exception e) {  
            e.printStackTrace();  
        }  
        finally {  
        	try{
                if(statement!=null) {
                	connection.close();
            	}
             }catch(SQLException se){
            	 se.printStackTrace();
             }
             try{
                if(connection!=null) {
                	connection.close();
            	}
             }catch(SQLException se){
                se.printStackTrace();
             }
        }  
        return res;
	}
}

