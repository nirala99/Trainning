package example;

import org.hibernate.Session;

public interface HibernateSessionAware {

    public void setHibernateSession(Session currentSession);
}
