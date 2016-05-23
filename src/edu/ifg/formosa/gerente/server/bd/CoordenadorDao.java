package edu.ifg.formosa.gerente.server.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import edu.ifg.formosa.gerente.shared.Coordenador;
import edu.ifg.formosa.gerente.shared.Evento;
import edu.ifg.formosa.gerente.shared.Usuario;


public class CoordenadorDao {


	public static void inserir(Coordenador coordenador){

		Connection con = null;
		try{
			String sql = "insert into estado(nomeEstado) values (?)";
			con = new ConnectionFactory().getConnection();
			PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			System.out.println(""+ stmt);

			stmt.setString(1,coordenador.getNomeEstado());
			stmt.executeUpdate();

			ResultSet rs = stmt.getGeneratedKeys();
			int idEstado = 0;
			if(rs.next()){
				idEstado = rs.getInt("idEstado");
			}
			System.out.println(idEstado);

			String sql1 = "insert into cidade(nomeCidade,idEstado) values(?,?)";
			stmt = con.prepareStatement(sql1, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, coordenador.getNomeCidade());
			stmt.setInt(2,idEstado);
			stmt.executeUpdate();

			rs = stmt.getGeneratedKeys();
			int idCidade = 0;
			if(rs.next()){
				idCidade = rs.getInt("idcidade");
			}
			System.out.println(idCidade);

			String sql2 = "insert into enderecoUsuario"
					+"(numero,bairro,cep,endereco, idCidade) values (?,?,?,?,?)";
			stmt = con.prepareStatement(sql2, Statement.RETURN_GENERATED_KEYS);

			stmt.setString(1, coordenador.getNumero());
			stmt.setString(2, coordenador.getBairro());
			stmt.setString(3, coordenador.getCep());
			stmt.setString(4, coordenador.getEndereco());
			stmt.setInt(5, idCidade);

			stmt.executeUpdate();

			rs = stmt.getGeneratedKeys();
			int idEnderecoPessoa = 0;
			if(rs.next()){
				idEnderecoPessoa = rs.getInt("idEnderecoPessoa");
			}
			System.out.println(idEnderecoPessoa);

			String sql3 = "insert into contatoUsuario"
					+"(email,telefonePessoa) values (?,?)";

			stmt = con.prepareStatement(sql3, Statement.RETURN_GENERATED_KEYS);

			stmt.setString(1, coordenador.getEmailPessoa());
			stmt.setString(2, coordenador.getTelefonePessoa());

			stmt.executeUpdate();
			rs = stmt.getGeneratedKeys();
			int idContatoUsuario = 0;
			if(rs.next()){
				idContatoUsuario = rs.getInt("idContatoUsuario");
			}
			System.out.println(idContatoUsuario);


			String sql4 = "insert into usuario(nomePessoa,cpf,rg,senha,idEnderecoPessoa,idContatoUsuario) values(?,?,?,?,?,?)";

			stmt = con.prepareStatement(sql4, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, coordenador.getNome());
			stmt.setString(2, coordenador.getCpf());
			stmt.setString(3, coordenador.getRg());
			stmt.setString(4, coordenador.getSenha());
			stmt.setInt(5, idEnderecoPessoa);
			stmt.setInt(6, idContatoUsuario);

			stmt.executeUpdate();

			rs = stmt.getGeneratedKeys();
			int idPessoa = 0;
			if(rs.next()){
				idPessoa = rs.getInt("idUsuario");
			}
			System.out.println(idPessoa);


			String sql5 = "insert into coordenador(matriculaSiape,idUsuario) values(?,?)";
			stmt =  con.prepareStatement(sql5);  

			stmt.setString(1, coordenador.getMatriculaSiape());
			stmt.setInt(2,idPessoa);

			stmt.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new RuntimeException("falha ao tentar executar um comando no BD. Verifique sua conexão");
		}finally{
			try {
				con.close();
			} catch (Exception e) {
				throw new RuntimeException("não foi possível fechar a conexão com o BD");
			}
		}
	}
	public ArrayList<ArrayList<String>> buscaCoordenadoresdeEventoPorNome(Coordenador coordenador){

		try {
			ArrayList<ArrayList<String>> coordenadores = new ArrayList<ArrayList<String>>();
			PreparedStatement stmt = new ConnectionFactory().getConnection().
					prepareStatement("SELECT usuario.idusuario, usuario.nomePessoa, coordenador.idCoordenador,"
							+ "coordenador.matriculasiape, evento.nomeEvento FROM usuario"
							+ "INNER JOIN coordenador ON coordenador.idusuario = usuario.idUsuario"
							+ "INNER JOIN coordenaEvento ON coordenador.idCoordenador = coordenaEvento.idCoordenador"
							+ "INNER JOIN evento ON evento.idevento = coordenaEvento.idevento where="+coordenador.getNome());


			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// criando o objeto Contato
				Evento evento = new Evento();
				Coordenador coor = new Coordenador();
				coor.setIdCoordenador(rs.getInt("idCoordenador"));
				coor.setNome(rs.getString("nomePessoa"));
				coor.setMatriculaSiape(rs.getString("matriculaSiape"));
				evento.setNomeEvento(rs.getString("nomeEvento"));

				ArrayList<String> colunas = new ArrayList<String>();
				colunas.add(""+coordenador.getIdCoordenador());
				colunas.add(coordenador.getNome());
				colunas.add(coordenador.getMatriculaSiape());
				colunas.add(evento.getNomeEvento());

				coordenadores.add(colunas);
			}
			rs.close();
			stmt.close();
			return coordenadores;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}