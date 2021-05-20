package client;

import org.hibernate.Session;
import annotations.Category;
import util.HibernateUtil;

public class CategoryClient {
    public static void main(String[] args) {
        Session session = HibernateUtil.getAnnotationSessionFactory().openSession();
        session.beginTransaction();
        Category cat = new Category();
        cat.setCategoryName("C1");
        session.persist(cat);
        session.getTransaction().commit();
        System.out.println(session.get(Category.class, 1));
        session.close();
    }
}
