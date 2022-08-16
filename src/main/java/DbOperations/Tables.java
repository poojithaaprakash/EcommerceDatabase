package DbOperations;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Tables {

    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            String customersTable = "CREATE TABLE CUSTOMER "
                    + "(CID INTEGER AUTO_INCREMENT not NULL, "
                    + " Cname VARCHAR(40), "
                    + " Email_ID VARCHAR(40) UNIQUE, "
                    + " Password VARCHAR(40),"
                    + " Mobile_Number VARCHAR(20), "
                    + " Address VARCHAR(30),"
                    + " Status VARCHAR(10),"
                    + " PRIMARY KEY ( CID ))";
            InsertUdateDelete.setData(customersTable, "Customer Table created successfully!");
            String ProductTable = "CREATE TABLE PRODUCTS "
                    + "(ChocoID INTEGER AUTO_INCREMENT not NULL, "
                    + " ChocoName VARCHAR(40), "
                    + " Price INTEGER, "
                    + " Stock INTEGER,"
                    + " PRIMARY KEY ( ChocoID ))";
            InsertUdateDelete.setData(ProductTable, "Product Table created successfully!");
            String OrdersTable = "CREATE TABLE ORDERS "
                    + "(CID INTEGER, "
                    + " ChocoID INTEGER, "
                    + " OrderID INTEGER AUTO_INCREMENT not NULL, "
                    + " OrderDate date, "
                    + " Quantity INTEGER, "
                    + " Price INTEGER,"
                    + " TotalAmt INTEGER,"
                    + " PRIMARY KEY (OrderID),"
                    + " FOREIGN KEY(CID) REFERENCES CUSTOMER(CID) ON DELETE CASCADE,"
                    + " FOREIGN KEY(ChocoID) REFERENCES products(ChocoID) ON DELETE CASCADE)";
            InsertUdateDelete.setData(OrdersTable, "Orders Table created successfully!");
            String CourierTable = "CREATE TABLE COURIER "
                    + "(CID INTEGER,"
                    + " OrderID INTEGER,"
                    + " CourierID INTEGER  not NULL, "
                    + " CourierName VARCHAR(40), "
                    + " CourierPhone VARCHAR(40), "
                    + " DeliveryStatus VARCHAR(40), "
                    + " PRIMARY KEY ( CourierID ),"
                    + " FOREIGN KEY(CID) REFERENCES Customer(CID) ON DELETE CASCADE,"
                    + " FOREIGN KEY(OrderID) REFERENCES Orders(OrderID) ON DELETE CASCADE)";
            InsertUdateDelete.setData(CourierTable, "Courier Table created successfully!");
//            String SelectTable = "CREATE TABLE CHOCOSELECTS "
//                    + "(CID INTEGER  not NULL, "
//                    + " ChocoID INTEGER, "
//                    + " PRIMARY KEY ( CID,ChocoID ),"
//                    + " FOREIGN KEY(CID) REFERENCES Customer(CID) ON DELETE CASCADE,"
//                    + " FOREIGN KEY(ChocoID) REFERENCES Products(ChocoID) ON DELETE CASCADE)";
//            InsertUdateDelete.setData(SelectTable, "ChocoSelect Table created successfully!");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
}
