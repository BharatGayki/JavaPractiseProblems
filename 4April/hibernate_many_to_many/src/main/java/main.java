import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class main {

    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Session session = entityManager.unwrap(Session.class);

        EntityTransaction transaction1 = entityManager.getTransaction();
        Transaction transaction = session.beginTransaction();

        vehicle v = new vehicle();
        v.setVeh_id(1);
        v.setVeh_name("Discover");

        vehicle v1 = new vehicle();
        v1.setVeh_id(2);
        v1.setVeh_name("Activa");

        user u = new user();
        u.setId(1);
        u.setName("Bharat");

        user u1 = new user();
        u1.setId(2);
        u1.setName("Vishal");

        u.getUser_list().add(v);
        v.getVeh_list().add(u);
        u1.getUser_list().add(v1);
        v1.getVeh_list().add(u1);

        entityManager.persist(u);
        entityManager.persist(v);
        entityManager.persist(u1);
        entityManager.persist(v1);




session.save(u);




        transaction1.commit();
        entityManager.close();
        entityManagerFactory.close();



    }


}
