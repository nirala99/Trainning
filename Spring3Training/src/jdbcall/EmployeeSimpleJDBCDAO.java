package jdbcall;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;


@SuppressWarnings("deprecation")
public class EmployeeSimpleJDBCDAO implements BaseDAO<Employee>{
		private SimpleJdbcTemplate simpleJdbcTemplate;

		public void setSimpleJdbcTemplate(SimpleJdbcTemplate simpleJdbcTemplate) {
			this.simpleJdbcTemplate = simpleJdbcTemplate;
		}

		@Override
		public Employee find(Object key) {
			String sql = "select * from employee where empno=?";
			Employee employee = simpleJdbcTemplate.queryForObject(sql, 
			 new RowMapper<Employee>(){
				@Override
				public Employee mapRow(ResultSet rs, int rowNum)
						throws SQLException {
					Employee emp = new Employee();
					emp.setEmpno(rs.getInt("empno"));
					emp.setEname(rs.getString("ename"));
					return emp;
				}
				
			},key
			);
			return employee;
		}

		@Override
		public void addEmp(Employee e) {
			//int i = jdbcTemplate.update("insert into j_employee values("+e.getEmpno()+",'"+e.getName()+"')");
			String sql = "insert into employee values(?,?)";
			int i = simpleJdbcTemplate.update(sql, e.getEmpno(),e.getEname());
			System.out.println("[INFO] "+ i + "employee added "+ e);
		}

		@Override
		public List<Employee> findAll() {
			List<Employee> employees = (List<Employee>)simpleJdbcTemplate.query(
					"select * from employee ", 
					new EmployeeRowMapper()
			);	
			return employees;
		}

		@Override
		public int getCount() {
			String sql = "select count(*) from employee";
			int count = simpleJdbcTemplate.queryForInt(sql);
			return count;
		}
		
		private static final class EmployeeRowMapper implements RowMapper<Employee>
		{
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
