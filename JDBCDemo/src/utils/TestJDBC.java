package utils;

import javax.sql.DataSource;
import java.sql.SQLException;

public class TestJDBC {
    public static void main(String[] args) throws SQLException {
        DataSource ds = JdbcUtils.getDataSource();
        System.out.println(ds);
        ds.getConnection();
    }
}
