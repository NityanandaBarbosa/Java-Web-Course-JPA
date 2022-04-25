package class_6;

import javax.persistence.EntityManager;

import models.Aluno;
import utils.JpaUtils;

public class ClientUpdateAluno {
	public static void main(String[] args) {
		EntityManager manager = JpaUtils.getEntityManager();
		manager.getTransaction().begin();
		Aluno aluno = manager.find(Aluno.class, 3L);
		aluno.setBairro("Parangaba");
		aluno.setEndereco("Rua Dom Pedro II, 10");
		manager.persist(aluno);
		manager.getTransaction().commit();
	}
}
