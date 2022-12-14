import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductUtil {

    public static void createTable() {
        String createSql = "CREATE TABLE PRODUCTS (" +
                "ID INTEGER NOT NULL AUTO_INCREMENT," +
                "PRODUCT_NAME VARCHAR(255)," +
                "PROVIDER VARCHAR(255)," +
                "QUANTITY INTEGER NOT NULL," +
                "PRIMARY KEY(ID))";
        try {
            JDBCUtil.getStatement().executeUpdate(createSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Table Created Successfully...");
    }

    public static void insert(Product product) {

        String insertSql = "INSERT INTO PRODUCTS(PRODUCT_NAME,PROVIDER,QUANTITY) VALUES(" +
                "'" + product.getProductName() + "', " +
                "'" + product.getProvider() + "', " +
                "" + product.getQuantity() + ")";
        try {
            JDBCUtil.getStatement().executeUpdate(insertSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Product Added!");
    }

    public static List<Product> getAllProducts(){
        String selectSql = "SELECT * FROM PRODUCTS";

        List<Product> products = new ArrayList<>();

        try {
            ResultSet resultSet = JDBCUtil.getStatement().executeQuery(selectSql);

            while(resultSet.next()){
                products.add(new Product(
                        resultSet.getLong("ID"),
                        resultSet.getString("PRODUCT_NAME"),
                        resultSet.getString("PROVIDER"),
                        resultSet.getInt("QUANTITY")
                ));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
    }

    public static void updateProduct(long id,String newPoductName){
        String updateSql = "UPDATE PRODUCTS SET PRODUCT_NAME = '"+ newPoductName + "'WHERE ID ="+id;

        try {
            JDBCUtil.getStatement().executeUpdate(updateSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Product Name Updated!");
    }

    public static List<Product> getSameProducts() {
        String selectSql = "SELECT * FROM PRODUCTS WHERE QUANTITY ="+2000;

        List<Product> products = new ArrayList<>();

        try {
            ResultSet resultSet = JDBCUtil.getStatement().executeQuery(selectSql);

            while (resultSet.next()) {
                products.add(new Product(
                        resultSet.getLong("ID"),
                        resultSet.getString("PRODUCT_NAME"),
                        resultSet.getString("PROVIDER"),
                        resultSet.getInt("QUANTITY")
                ));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
    }


    public static void deleteProduct(Integer ID){

        String deleteSql = "DELETE FROM PRODUCTS WHERE ID = '"+ID+"' ";

        try {
            JDBCUtil.getStatement().executeUpdate(deleteSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Product deleted!");
    }


    public static void sum(long quantity){
        String sumSql = "SELECT SUM("+quantity+")AS TOTAL FROM PRODUCTS";
        try {
            JDBCUtil.getStatement().executeQuery(sumSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

//    public static List<Product> quantitySum(){
//        String selectSql = "SELECT ";
//    }



}
