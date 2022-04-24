package class_5;

import javax.persistence.EntityManager;
import utils.JpaUtils;

public class ClientAluno {
	public static void main(String[] args) {
		
		EntityManager manager = JpaUtils.getEntityManager();
		
		manager.getTransaction().begin();
		Aluno aluno = new Aluno();
		
		aluno.setNome("nityananda barbosa");
		aluno.setRG("111111111");
		aluno.setCPF("2222222");
		aluno.setEndereco("Rua teste 91");
		aluno.setBairro("Teste");
		aluno.setCep("2334");
		aluno.setCidade("Fortaleza");
		manager.persist(aluno);
		manager.getTransaction().commit();
		manager.close();
	}
}
