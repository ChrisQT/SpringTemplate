package hw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDM {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new", "root", "123456");
        conn.prepareStatement("select ? from papaer");
        String sql = "select * from paper";
        Statement stmt = conn.createStatement();
        ResultSet res= stmt.executeQuery(sql);
        while(res.next()){
            System.out.println("id:"+res.getInt(1) + "name" +res.getString(2)
            + "detail" + res.getString(3));
        }
//        String str = res.getString(2);
//        System.out.println(str);
        stmt.close();
        conn.close();



    }
}
