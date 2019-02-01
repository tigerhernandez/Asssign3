/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign3c0621483;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tiger
 */
public class Assign3c0621483 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    //First I need to declare my variables 
    String customterId="";
    String productId="";
    String orderNum="";
    String quantity="";
    String shippingCost="";
    String saleDate="";
    String shippingDate="";
    String freightCo="";
    
    //import Scanner so that we can get input from user
    Scanner nb = new Scanner(System.in);
    
    
    // SQL Queries
    
    String sql1 = "SELECT * FROM CUSTOMER";
    String sql2="SELECT * FROM PRODCUT";
    String sql3="INSERT into PURCHASE_ORDER(ORDER_NUM, CUSTOMER_ID, PRODUCT_ID,"
            + "QUANTITY, SHIPPING_COST, SALES_DATE,SHIPPING_DATE,"
            + "FREIGHT_COMPANY) values(?,?,?,?,?,?,?,?,?)"; // 8 values for the 8 variables the user will input
        try {
            //Need to set up stringfor connection plus the Driver Manager connection like in the example we did in class
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String jbdc="jdbc:derby://localhost:1527/sample";
            Connection conn= DriverManager.getConnection(jbdc,"app","app");
            
            
            //Now we need to run and excute our first SQL line 
            
            PreparedStatement pstmt = conn.prepareStatement(sql1);
            
            ResultSet rs = pstmt.executeQuery();
            
            //Looked up on google how to create a table.Found multiple was but 
            //this one made the most sense to me
            //Tried multiple tables but coulnd't get them to work
            
            // Ask user for input
            
            
            System.out.println("What's the Prodcut ID?");
            productId= nb.nextLine();
            System.out.println("What's the order number");
            orderNum= nb.nextLine();
            System.out.println("What's the quantity");
            quantity= nb.nextLine();
            System.out.println("What's the shipping cost?");
            shippingCost= nb.nextLine();
            System.out.println("What's the sale date?");
            saleDate= nb.nextLine();
            System.out.println("What's the shipping date?");
            shippingDate= nb.nextLine();
            System.out.println("What's the freight company name?");
            freightCo= nb.nextLine();
            
         
         
        
   }
         
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Assign3c0621483.class.getName()).log(Level.SEVERE, null, ex);
        }
    
            
    }
    
}
