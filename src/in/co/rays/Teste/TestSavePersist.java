package in.co.rays.Teste;



import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in. co.rays.user.UserDTO;

public class TestSavePersist {

	public static void main(String[] args) {

		UserDTO dto = new UserDTO();

		dto.setFirstName("pranav");
		dto.setLastName("mahajan");
		dto.setLoginId("pranav@gmail.com");
		dto.setPassword("123");
		dto.setDob(new Date());
		dto.setAddress("indore");

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		int i = (int) session.save(dto);

		System.out.println("i => " + i);

		// session.persist(dto);

		tx.commit();

		session.close();

	}
}


