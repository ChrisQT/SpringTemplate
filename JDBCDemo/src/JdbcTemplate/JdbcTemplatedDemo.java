package JdbcTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import utils.JdbcUtils;

import javax.sql.DataSource;

public class JdbcTemplatedDemo {
    public static void main(String[] args) {
        DataSource ds = JdbcUtils.getDataSource();
        JdbcTemplate template = new JdbcTemplate(ds);
        String sql = "update paper set detail = 'hahahaa' where paper_id=?";
        int count = template.update(sql, 2);
        System.out.println(count);
    }
}
