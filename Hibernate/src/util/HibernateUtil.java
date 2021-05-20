package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import annotations.Category;
import annotations.Ingredient;
import annotations.Product;

public class HibernateUtil {
    static SessionFactory factory;
    static SessionFactory cachedFactory;
    static SessionFactory anFactory;
    public static SessionFactory getSessionFactory() {
        if (factory == null) {
            Configuration cfg = new Configuration();
            // adding properties
            //cfg.setProperty(propertyName, value)
            factory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
            System.out.println("Session Factory Created");
        }
        return factory;
    }
    
    public static SessionFactory getAnnotationSessionFactory() {
        if (anFactory == null) {
            AnnotationConfiguration anConfig = new AnnotationConfiguration();
            anConfig.addAnnotatedClass(Category.class);
            anConfig.addAnnotatedClass(Product.class);
            anConfig.addAnnotatedClass(Ingredient.class);
            anFactory = anConfig.configure("hibernate.cfg.xml").buildSessionFactory();
        }
        return anFactory;
    }
    
    public static SessionFactory getCacheSessionFactory() {
        if (cachedFactory == null) {
            // create the Factory

            Configuration cfg = new Configuration();
            cachedFactory = cfg.configure("hibernate-caching.cfg.xml").buildSessionFactory();
            System.out.println("Cached Session Factory Created");
        }
        return cachedFactory;
    }
}
