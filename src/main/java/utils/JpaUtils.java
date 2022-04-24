package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtils {
	private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
}
