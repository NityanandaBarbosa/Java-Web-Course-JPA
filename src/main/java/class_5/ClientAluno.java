package class_5;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClientAluno {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		Aluno aluno = new Aluno();
		
		aluno.setNome("nityananda");
		aluno.setRG("123233432");
		aluno.setCPF("21302312321");
		aluno.setEndereco("Rua teste 90");
		aluno.setBairro("Teste");
		aluno.setCep("2334");
		aluno.setCidade("Fortaleza");
		manager.persist(aluno);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
}
