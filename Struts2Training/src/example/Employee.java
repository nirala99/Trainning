package example;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;

@Entity
@Table(name = "Struts_Employee")
public class Employee implements Serializable{
    int empno;
    String name;
    double salary;

    @Override
    public String toString() {
        return "E[" + getEmpno() + ", " + getName() + ", " + getSalary() + "]";
    }

    @Id()
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_number")
    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int empno, String name, double salary) {
        this.empno = empno;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    @Override
    public boolean equals(Object obj) {
        return this.empno == ((Employee) obj).empno;
    }
}
