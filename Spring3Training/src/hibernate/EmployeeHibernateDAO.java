package hibernate;

import java.io.Serializable;
import java.util.List;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class EmployeeHibernateDAO implements BaseDAO<Employee> {

    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public Employee find(Object key) {
        return hibernateTemplate.get(Employee.class, (Serializable) key);
    }

    @Override
    public void addEmp(Employee e) {
        hibernateTemplate.save(e);
    }

    @Override
    public List<Employee> findAll() {
        return hibernateTemplate.find("from Employee");
    }

    @Override
    public int getCount() {
        //Hibernate Callback
        return 0;
    }
}
