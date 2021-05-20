package query;

import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import util.HibernateUtil;

public class NativeQueryExample {
    public static void main(String[] args) {
        Session currentSession = HibernateUtil.getSessionFactory().openSession();
        SQLQuery sqry = currentSession.createSQLQuery("Select * from HIB_Account");
        sqry.setMaxResults(10);
        List<Object[]> records = sqry.list();
        for (Object[] objects : records) {
            System.out.print("[");
            for (Object data : objects) {
                System.out.print(data + " ");
            }
            System.out.println("]");
        }
        currentSession.close();
    }
}
