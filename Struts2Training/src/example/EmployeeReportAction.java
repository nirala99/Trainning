package example;

import java.util.List;
import javax.servlet.ServletContext;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import org.apache.struts2.util.ServletContextAware;
import org.hibernate.Session;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class EmployeeReportAction extends ActionSupport implements
        HibernateSessionAware, ServletContextAware {

    Session currentSession;
    String format;
    List<Employee> employees;
    ServletContext ctx;

    @Override
    public void setHibernateSession(Session currentSession) {
        this.currentSession = currentSession;

    }

    @Override
    public void setServletContext(ServletContext ctx) {
        this.ctx = ctx;
    }

    @Override
    public String execute() throws Exception {
        setEmployees(currentSession.createCriteria(Employee.class).list());
        // fatch the data from DB for Report
        JasperCompileManager.compileReportToFile(ctx.getRealPath("report/employee_report.jrxml"), ctx.getRealPath("report/employee_report.jasper"));
        setEmployees(currentSession.createCriteria(Employee.class).list());
        return super.execute();
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
