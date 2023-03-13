package br.com.agenda.aplicacao;

import java.util.Date;
import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) {

		ContatoDAO contatoDao = new ContatoDAO();

		Contato contato = new Contato();
		contato.setNome("João Vitor");
		contato.setIdade(18);
		contato.setDataCadastro(new Date());

//		contatoDao.save(contato);

		// Atualizar o contato.
		Contato c1 = new Contato();
		c1.setNome("Moisés Oliveira Araújo Júnior");
		c1.setIdade(21);
		c1.setDataCadastro(new Date());
		c1.setId(1); // É o número que está no banco de dados

//		contatoDao.update(c1);
		
		// Deletar o contato pelo seu número e ID
		contatoDao.deleteByID(3);

		// Visualização de todos os registros do banco

		for (Contato c : contatoDao.getContatos()) {
			System.out.println("Contato: " + c.getNome());
		}

	}

}
