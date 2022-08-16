/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DbOperations;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProductDao {

    public static ArrayList<Products> getAllRecords() throws SQLException {
        ArrayList<Products> arrayList = new ArrayList<>();
        try {
            ResultSet rs = Select.getData("select * from products");
            while (rs.next()) {
                Products product = new Products();
                product.setChocoID(rs.getString("ChocoID"));
                product.setChocoName(rs.getString("ChocoName"));
                product.setPrice(rs.getString("Price"));
                product.setStock(rs.getString("Stock"));
                arrayList.add(product);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static Products getProductByName(String name) {
        Products product = new Products();
        try {
            ResultSet rs = Select.getData("select * from products where ChocoName='" + name + "' ");
            while (rs.next()) {
                product.setChocoName(rs.getString(2));
                product.setPrice(rs.getString(3));
            }
        }
        catch(SQLException e){
 JOptionPane.showMessageDialog(null, e);
}
        return product;
}



}
