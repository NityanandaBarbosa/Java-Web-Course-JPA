package class_7;

import javax.persistence.EntityManager;

import models.Aluno;
import models.Sede;
import models.Telefone;
import utils.JpaUtils;

public class ClientSedeEndereco {
	public static void main(String[] args) {
		EntityManager manager = JpaUtils.getEntityManager();
		manager.getTransaction().begin();
		
		Aluno aluno = manager.find(Aluno.class, 8L);
		
		Telefone telefone1 = new Telefone();
		telefone1.setTelefone("99999-9999");
		telefone1.setTipo("Celular");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTelefone("34959816");
		telefone2.setTipo("Fixo");
		
		aluno.getTelefones().add(telefone1);
		aluno.getTelefones().add(telefone2);
		
		Sede sede = new Sede();
		sede.setNomesede("Maracanau");
		aluno.setSede(sede);
		
		manager.persist(sede);
		manager.persist(telefone2);
		manager.persist(telefone1);
		manager.persist(aluno);
		
		manager.getTransaction().commit();
		manager.close();
		
	}
}
