package query;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;
import entities.Account;

public class CriterionExample {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria critAcc = session.createCriteria(Account.class);
        // Add simple Restrictions
        critAcc.add(Restrictions.or(Restrictions.between(
                "balance", 1000.0, 2000.0),
                Restrictions.in("accountId", new Object[]{99, 98, 90})));
		Restrictions.sqlRestriction("case balance when 1000");
        critAcc.addOrder(Order.desc("balance"));
        critAcc.setMaxResults(10);

        List<Account> accs = critAcc.list();
        for (Account account : accs) {
            System.out.println(account);
        }

        // Query By Example
        critAcc = session.createCriteria(Account.class);
        Account aExample = new Account();
        aExample.setAccountType("S%");
        aExample.setBalance(5000);
        Example egAccount = Example.create(aExample);
        egAccount.enableLike();
        egAccount.excludeProperty("balance");
        critAcc.add(egAccount);
        accs = critAcc.list();
        for (Account account : accs) {
            System.out.println(account);
        }
        session.close();
    }
}