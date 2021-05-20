package jdbcall;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeJDBCDAO implements BaseDAO<Employee> {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Employee find(Object key) {
        String sql = "select * from employee where empno=?";
        Employee employee = jdbcTemplate.queryForObject(sql, new Object[]{key},
                new RowMapper<Employee>() {

                    @Override
                    public Employee mapRow(ResultSet rs, int rowNum)
                            throws SQLException {
                        Employee emp = new Employee();
                        emp.setEmpno(rs.getInt("empno"));
                        emp.setEname(rs.getString("ename"));
                        return emp;
                    }
                });

        return employee;
    }

    @Override
    public void addEmp(Employee e) {
        //int i = jdbcTemplate.update("insert into j_employee values("+e.getEmpno()+",'"+e.getName()+"')");
        String sql = "insert into employee values(?,?)";
        int i = jdbcTemplate.update(sql, e.getEmpno(), e.getEname());
        System.out.println("[INFO] " + i + "employee added " + e);
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> employees = jdbcTemplate.query(
                "select * from employee",
                new Object[]{},
                new EmployeeRowMapper());

        return employees;
    }

    @Override
    public int getCount() {
        String sql = "select count(*) from employee";
        int count = jdbcTemplate.queryForInt(sql);
        return count;
    }

    private static final class EmployeeRowMapper implements RowMapper<Employee> {

        @Override
        public Employee mapRow(ResultSet rs, int rowNum)
                throws SQLException {
            Employee emp = new Employee();
            emp.setEmpno(rs.getInt("empno"));
            emp.setEname(rs.getString("ename"));
            return emp;
        }
    }
}
