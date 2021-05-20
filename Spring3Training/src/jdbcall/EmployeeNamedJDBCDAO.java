package jdbcall;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class EmployeeNamedJDBCDAO implements BaseDAO<Employee> {

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public void setNamedParameterJdbcTemplate(
			NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	@Override
	public Employee find(Object key) {
		String sql = "select * from employee where empno=:empno";
		SqlParameterSource parameters= new MapSqlParameterSource("empno",key);
		Employee employee = namedParameterJdbcTemplate.queryForObject(sql,
				parameters, new RowMapper<Employee>() {
					@Override
					public Employee mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						Employee emp = new Employee();
						emp.setEmpno(rs.getInt("empno"));
						emp.setEname(rs.getString("ename"));
						return emp;
					}

				}

		);
		return employee;
	}

	

	@Override
	public void addEmp(Employee e) {
		String sql = "insert into employee values(:empno,:ename)";
		BeanPropertySqlParameterSource parameters=new BeanPropertySqlParameterSource(e);
		int i = namedParameterJdbcTemplate.update(sql, parameters);
		System.out.println("[INFO] " + i + "employee added " + e);
	}

	@Override
	public List<Employee> findAll() {
		MapSqlParameterSource parameters=new MapSqlParameterSource();
//		parameters.addValue("ename", "John");
//		parameters.addValue("range", 10);
		List<Employee> employees = namedParameterJdbcTemplate.query("select * from employee",
				parameters, new EmployeeRowMapper());

		return employees;
	}
	
//	@Override
//	public List<Employee> findAll() {
//		MapSqlParameterSource parameters=new MapSqlParameterSource();
//		parameters.addValue("ename", "John");
//		parameters.addValue("range", 10);
//		List<Employee> employees = namedParameterJdbcTemplate.query("select * from employee where ename=:ename and empno<:range",
//				parameters, new EmployeeRowMapper());
//
//		return employees;
//	}

	@Override
	public int getCount() {
		String sql = "select count(*) from employee";
		int count = namedParameterJdbcTemplate.getJdbcOperations().queryForInt(sql);
		return count;
	}

	private static final class EmployeeRowMapper implements RowMapper<Employee> {
		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee emp = new Employee();
			emp.setEmpno(rs.getInt("empno"));
			emp.setEname(rs.getString("ename"));
			return emp;
		}
	}
}
