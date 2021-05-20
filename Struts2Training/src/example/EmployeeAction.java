package example;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;

@Validations(requiredStrings = {
    @RequiredStringValidator(fieldName = "model.name", key = "validation.requiredString")},
stringLengthFields = {
    @StringLengthFieldValidator(fieldName = "model.name", minLength = "5", maxLength = "15", key = "validation.stringLength")},
intRangeFields = {
    @IntRangeFieldValidator(fieldName = "model.empno", max = "99999", min = "1", key = "validation.intLength")})
public class EmployeeAction extends ActionSupport implements
        ModelDriven<Employee>, SessionAware, HibernateSessionAware {

    private static final long serialVersionUID = 1L;
    Map<String, Object> sessionData;
    Employee currentEmployee = new Employee();
    Session currentSession;

    //will be invoke by HibernateSessionInterceptor
    @Override
    public void setHibernateSession(Session currentSession) {
        this.currentSession = currentSession;

    }

    @Override
    public String input() throws Exception {
        currentEmployee.setEmpno(-1);
        currentEmployee.setName("NONAME");
        return super.input();
    }

    public String register() {
        if (sessionData.get("employee") == null) {
            sessionData.put("employee", new ArrayList<Employee>());
        }
        setEmployees((List<Employee>) sessionData.get("employee"));
        if (getEmployees().contains(getModel())) {
            addActionError("Employee Registration Failed");
            addFieldError("modelemono", "Employee Number " + getModel().getEmpno() + " is allready Registered.");
            return "input";
        }
        getEmployees().add(getModel());
        System.out.println("Employee Added" + getModel());
        currentSession.persist(getModel());
        return list();
    }

    @SuppressWarnings("unchecked")
    public String list() {
        setEmployees(currentSession.createCriteria(Employee.class).list());
        return "list";
    }
    List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public Employee getModel() {
        return currentEmployee;
    }

    @Override
    public void setSession(Map<String, Object> sessionData) {
        this.sessionData = sessionData;
    }
}
