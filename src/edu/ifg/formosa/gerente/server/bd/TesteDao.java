package edu.ifg.formosa.gerente.server.bd;

import java.sql.SQLException;


import edu.ifg.formosa.gerente.shared.Gerente;


public class TesteDao {
	
	public static void main(String[]args) throws SQLException{
		/*
		Coordenador coordenador = new Coordenador();
		coordenador.setNomeEstado("Goias");
		coordenador.setNomeCidade("Formosa");
		
		coordenador.setNumero("104");
		coordenador.setBairro("Rosa Maria");
		coordenador.setCep("73800-000");
		coordenador.setEndereco("Avenida Circular, qd:70");
		coordenador.setTelefonePessoa("996666-44");
		coordenador.setEmailPessoa("ricardolaiane8@gmail.com");
		
		coordenador.setNome("Laiane Ricardo");
		coordenador.setCpf("05210945189");
		coordenador.setRg("5987267");
		coordenador.setSenha("1234");
		coordenador.setMatriculaSiape("20141070130020");
		*/
		Gerente gerente = new Gerente();
		gerente.setNome("Laiane Ricardo");
		GerenteDao.buscaNomeGerente(gerente);
		
	}
		
}
