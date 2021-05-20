package example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

@SuppressWarnings("serial")
public class HibernateSessionInterceptor implements Interceptor {

    SessionFactory factory;

    @Override
    public void destroy() {
        factory.close();

    }

    @Override
    public void init() {
        factory = HibernateUtil.gerSessionFactory();

    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        String result = "none";
        Object currentAction = invocation.getAction();
        if (currentAction instanceof HibernateSessionAware) {
            Session currentSession = factory.openSession();
            currentSession.beginTransaction();
            ((HibernateSessionAware) currentAction).setHibernateSession(currentSession);
            result = invocation.invoke();
            currentSession.getTransaction().commit();
        } else {
            result = invocation.invoke();
        }
        return result;
    }
}
