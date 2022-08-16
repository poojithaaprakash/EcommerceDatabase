package DbOperations;

//import java.awt.HeadlessException;
//import java.util.ArrayList;
//import javax.swing.JOptionPane;
//import java.sql.*;

//public class ProductTable {
//
//    public static void main(String[] args) {
//  public static ArrayList<Products> getAllRecords() throws SQLException {
//        ArrayList<Products> arrayList = new ArrayList<>();
//        try {
//            ResultSet rs = Select.getData("select * from products");
//            while (rs.next()) {
//                Products product = new Products();
//                product.setChocoID(rs.getString("ChocoID"));
//                product.setChocoName(rs.getString("ChocoName"));
//                product.setPrice(rs.getString("Price"));
//                product.setStock(rs.getString("Stock"));
//                arrayList.add(product);
//            }
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
//        return null;
//    }
//}

    public class Products {

         String chocoID;
         String chocoName;
         String price;
         String stock;

        public String getChocoID() {
            return chocoID;
        }

        public void setChocoID(String chocoID) {
            this.chocoID = chocoID;
        }

        public String getChocoName() {
            return chocoName;
        }

        public void setChocoName(String chocoName) {
            this.chocoName = chocoName;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getStock() {
            return stock;
        }

        public void setStock(String stock) {
            this.stock = stock;
        }

    }


