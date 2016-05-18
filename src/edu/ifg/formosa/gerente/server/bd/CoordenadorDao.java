package edu.ifg.formosa.gerente.server.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import edu.ifg.formosa.gerente.shared.Coordenador;

public class CoordenadorDao {


	public static void inserir(Coordenador coordenador){

		Connection con = null;

		try{
			String sql = "insert into estado(nomeestado) values (?)";
			con = new ConnectionFactory().getConnection();
			PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

			stmt.setString(1,coordenador.getUsuario().getEnderecoUsuario().getCidade().getEstado().getNomeEstado());
			stmt.executeUpdate();

			ResultSet rs = stmt.getGeneratedKeys();
			int idEstado = 0;
			if(rs.next()){
				idEstado = rs.getInt("idEstado");
			}
			System.out.println(idEstado);


			String sql1 = "insert into Cidade(nomeCidade,idEstado) values(?,?)";
			stmt = con.prepareStatement(sql1, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, coordenador.getUsuario().getEnderecoUsuario().getCidade().getNomeCidade());
			stmt.setInt(2,idEstado);
			stmt.executeUpdate();

			rs = stmt.getGeneratedKeys();
			int idCidade = 0;
			if(rs.next()){
				idCidade = rs.getInt("idcidade");
			}
			System.out.println(idCidade);

			String sql2 = "insert into EnderecoUsuario"
					+"(numero,bairro,cep,idCidade) values (?,?,?,?)";
			stmt = con.prepareStatement(sql2, Statement.RETURN_GENERATED_KEYS);

			stmt.setString(1, coordenador.getUsuario().getEnderecoUsuario().getNumero());
			stmt.setString(2, coordenador.getUsuario().getEnderecoUsuario().getBairro());
			stmt.setString(3, coordenador.getUsuario().getEnderecoUsuario().getCep());
			stmt.setInt(4, idCidade);

			stmt.executeUpdate();

			rs = stmt.getGeneratedKeys();
			int idEnderecoPessoa = 0;
			if(rs.next()){
				idEnderecoPessoa = rs.getInt("idEnderecoPessoa");
			}
			System.out.println(idEnderecoPessoa);

			String sql3 = "insert into ContatoUsuario"
					+"(email,telefonePessoa) values (?,?)";

			stmt = con.prepareStatement(sql3, Statement.RETURN_GENERATED_KEYS);

			stmt.setString(1, coordenador.getUsuario().getContatoPessoa().getEmail());
			stmt.setString(2, coordenador.getUsuario().getContatoPessoa().getTelefonePessoa());

			stmt.executeUpdate();
			rs = stmt.getGeneratedKeys();
			int idContatoPessoa = 0;
			if(rs.next()){
				idContatoPessoa = rs.getInt("idContatoUsuario");
			}
			System.out.println(idContatoPessoa);


			String sql4 = "insert into usuario(nomePessoa,cpf,rg,senha,idEnderecoPessoa,idContatoPessoa) values(?,?,?,?,?,?)";

			stmt = con.prepareStatement(sql4, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, coordenador.getUsuario().getNome());
			stmt.setString(2, coordenador.getUsuario().getCpf());
			stmt.setString(3, coordenador.getUsuario().getRg());
			stmt.setString(4, coordenador.getUsuario().getSenha());
			stmt.setInt(5, idEnderecoPessoa);
			stmt.setInt(6, idContatoPessoa);

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
}