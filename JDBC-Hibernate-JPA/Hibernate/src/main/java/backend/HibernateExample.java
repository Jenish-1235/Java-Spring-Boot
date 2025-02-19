package backend;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateExample {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(100);
        student.setName("Rajesh");


        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(Student.class);
        cfg.configure("hibernate.cfg.xml");


        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
//        s.save(student); // save method is deprecated we use persist instead
//        tx.commit();
//        s.close();
//        sf.close();

        // fetching data with hibernate
        s = sf.openSession();
        tx = s.beginTransaction();
        Student st = s.get(Student.class, 100);
        System.out.println(st.getName());

        // update data with hibernate
        s = sf.openSession();
        tx = s.beginTransaction();
        st.setName("Rajesh1");
        s.update(st); // update is deprecated and we use merge method instead...
        tx.commit();
        s.close();
        sf.close();

        // delete data with hibernate
        s = sf.openSession();
        tx = s.beginTransaction();
        st = s.get(Student.class, 100);
        s.delete(st); // delete method is deprecated and we use remove method instead...
        tx.commit();
        s.close();
        sf.close();


    }

    /*
    Relationship Mapping using hibernate
    --> Types : @OneToOne ,@OneToMany, @ManyToOne, @ManyToMany
     */

    /*
    Eager and Lazy Fetching :

     By default lazy fetching is implemented and we can set the fetch type to Eager explicitly.

     */
}
