package class_7;

import javax.persistence.EntityManager;

import models.Aluno;
import models.Endereco;
import utils.JpaUtils;

public class ClientAlunoEndereco {
	public static void main(String[] args) {
		EntityManager manager = JpaUtils.getEntityManager();
		
		manager.getTransaction().begin();
		Aluno aluno = new Aluno();
		Endereco endereco = new Endereco();
		
		aluno.setNome("nityananda barbosa");
		aluno.setRG("111111111");
		aluno.setCPF("2222222");
		
		endereco.setLogradouro("Rua Dom Pedro II");
		endereco.setNumero("10");
		endereco.setBairro("Parangaba");
		endereco.setCep("2334");
		
		aluno.setEndereco(endereco);
		
		manager.persist(endereco);
		manager.persist(aluno);
		
		manager.getTransaction().commit();
		manager.close();
	}
}
