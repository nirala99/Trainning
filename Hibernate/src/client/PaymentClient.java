package client;

import org.hibernate.Session;

import util.HibernateUtil;
import entities.CardPayment;
import entities.ChequePayment;
import entities.Payment;

public class PaymentClient {

    public static void main(String[] args) {
        Payment p1 = new Payment();
        p1.setAmount(111);

        ChequePayment chp1 = new ChequePayment();
        chp1.setChequeNumber(1111);
        chp1.setAmount(133);
        chp1.setBankName("MyBank");

        CardPayment chp2 = new CardPayment();
        chp2.setCardNumber(1122221111222211l);
        chp2.setAmount(13444);
        chp2.setCardType("VISA");

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        session.persist(p1);
        session.persist(chp1);
        session.persist(chp2);

        session.getTransaction().commit();
        session.close();

        //fetching Objects in Inheritance Mapping
        session = HibernateUtil.getSessionFactory().openSession();

        // generic Fetching
        Payment payGeneric = (Payment) session.get(Payment.class, 2);

        System.out.println(payGeneric.getPaymentId()
                + " Type is :" + payGeneric.getClass().getName());

        //specific Fetching
        CardPayment paySpecific = (CardPayment) session.get(CardPayment.class, 3);

        System.out.println(paySpecific.getPaymentId()
                + " card Number :" + paySpecific.getCardNumber());
    }
}
