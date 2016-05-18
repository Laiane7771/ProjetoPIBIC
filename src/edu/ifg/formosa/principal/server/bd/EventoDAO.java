package edu.ifg.formosa.principal.server.bd;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Vector;
import edu.ifg.formosa.principal.shared.Endereco;
import edu.ifg.formosa.principal.shared.Evento;


public class EventoDAO {

	public static ArrayList<Evento> buscaEventoNome(Evento evento){
		try{
			ArrayList<Evento> eventos = new ArrayList<Evento>();
			PreparedStatement stmt = new ConnectionFactory().getConnection().
					prepareStatement("Select idEvento, nomeEvento,dataInicio, dataencerra from evento " +
							"where nomeEvento like '%"+evento.getNomeEvento()+"%'");

			ResultSet rs = stmt.executeQuery();

			while(rs.next()){
				//criando o objeto Evento
				Evento evento1 =  new Evento();

				evento1.setIdEvento(rs.getInt("idEvento"));
				evento1.setNomeEvento(rs.getString("nomeEvento"));
				evento1.setDataInicio(rs.getString("datainicio"));
				evento1.setDataEncerra(rs.getString("dataEncerra"));
				eventos.add(evento1);
				
			}
			rs.close();
			stmt.close();
			return eventos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}