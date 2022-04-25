package class_6;

import javax.persistence.EntityManager;

import models.Aluno;
import utils.JpaUtils;

public class ClientDeleteAluno {
	public static void main(String[] args) {
		EntityManager manager = JpaUtils.getEntityManager();
		manager.getTransaction().begin();
		Aluno aluno = manager.find(Aluno.class, 1L);
		manager.remove(aluno);
		manager.getTransaction().commit();
	}
}
