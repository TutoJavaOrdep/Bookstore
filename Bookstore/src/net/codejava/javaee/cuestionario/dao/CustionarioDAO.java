package net.codejava.javaee.cuestionario.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import net.codejava.javaee.conexion.Conexion;
import net.codejava.javaee.cuestionario.model.Custionario;
import net.codejava.javaee.cuestionario.model.Pregunta;
import net.codejava.javaee.cuestionario.model.Respuesta;
import net.codejava.javaee.cuestionario.model.Tema;

/**
 * AbstractDAO.java This DAO class provides CRUD database operations for the
 * table Custionario in the database.
 * 
 * @author www.codejava.net
 *
 */
public class CustionarioDAO {

	public boolean insertCustionario(Custionario custionario) throws SQLException {
		String sql = "INSERT INTO Custionario (cuestionario_id,tema_id, pregunta_id, respuesta_id,status) VALUES (id_seq_Custionario.NEXTVAL, ?, ?, ?,?)";
		PreparedStatement statement = Conexion.connect().prepareStatement(sql);
		statement.setFloat(1, custionario.getTema().getId());
		statement.setFloat(2, custionario.getPreg().getId());
		statement.setFloat(3, custionario.getResp().getId());
		statement.setFloat(4, custionario.getStatus());
		boolean rowInserted = statement.executeUpdate() > 0;
		statement.close();
		Conexion.disconnect();
		return rowInserted;
	}

	public List<Tema> listAllTema() throws SQLException {
		List<Tema> listTema = new ArrayList<>();
		String sql = "SELECT * FROM Tema";
		Statement statement = Conexion.connect().createStatement();
		ResultSet resultSet = statement.executeQuery(sql);

		while (resultSet.next()) {
			int id = resultSet.getInt("tema_id");
			String temaCol = resultSet.getString("tema");
			Tema tema = new Tema(id, temaCol);
			listTema.add(tema);
		}

		resultSet.close();
		statement.close();
		Conexion.disconnect();
		return listTema;
	}
	
	
	public List<Pregunta> listAllPreguntas() throws SQLException {
		List<Pregunta> listTema = new ArrayList<>();
		String sql = "SELECT * FROM Preguntas";
		Statement statement = Conexion.connect().createStatement();
		ResultSet resultSet = statement.executeQuery(sql);

		while (resultSet.next()) {
			int id = resultSet.getInt("pregunta_id");
			String preg = resultSet.getString("pregunta");
			Pregunta p = new Pregunta(id,preg);
			listTema.add(p);
		}

		resultSet.close();
		statement.close();
		Conexion.disconnect();
		return listTema;
	}

	public List<Respuesta> listAllRespuestas() throws SQLException {
		List<Respuesta> listRespuesta = new ArrayList<>();
		String sql = "SELECT * FROM Respuestas";
		Statement statement = Conexion.connect().createStatement();
		ResultSet resultSet = statement.executeQuery(sql);

		while (resultSet.next()) {
			int id = resultSet.getInt("respuesta_id");
			String resp = resultSet.getString("respuesta");
			Respuesta p = new Respuesta(id,resp);
			listRespuesta.add(p);
		}
		resultSet.close();
		statement.close();
		Conexion.disconnect();
		return listRespuesta;
	}
	
	
	
	

//
//	public boolean deleteCustionario(Custionario Custionario) throws SQLException {
//		String sql = "DELETE FROM Custionario where Custionario_id = ?";
//
//
//		PreparedStatement statement = Conexion.connect().prepareStatement(sql);
//		statement.setInt(1, Custionario.getId());
//
//		boolean rowDeleted = statement.executeUpdate() > 0;
//		statement.close();
//		Conexion.disconnect();
//		return rowDeleted;
//	}
//
//	public boolean updateCustionario(Custionario Custionario) throws SQLException {
//		String sql = "UPDATE Custionario SET title = ?, author = ?, price = ?";
//		sql += " WHERE Custionario_id = ?";
//
//		PreparedStatement statement = Conexion.connect().prepareStatement(sql);
//		statement.setString(1, Custionario.getTitle());
//		statement.setString(2, Custionario.getAuthor());
//		statement.setFloat(3, Custionario.getPrice());
//		statement.setInt(4, Custionario.getId());
//
//		boolean rowUpdated = statement.executeUpdate() > 0;
//		statement.close();
//		Conexion.disconnect();
//		return rowUpdated;
//	}
//
//	public Custionario getCustionario(int id) throws SQLException {
//		Custionario Custionario = null;
//		String sql = "SELECT * FROM Custionario WHERE Custionario_id = ?";
//
//
//		PreparedStatement statement = Conexion.connect().prepareStatement(sql);
//		statement.setInt(1, id);
//
//		ResultSet resultSet = statement.executeQuery();
//
//		if (resultSet.next()) {
//			String title = resultSet.getString("title");
//			String author = resultSet.getString("author");
//			float price = resultSet.getFloat("price");
//
//			Custionario = new Custionario(id, title, author, price);
//		}
//
//		resultSet.close();
//		statement.close();
//		
//		Conexion.disconnect();
//
//		return Custionario;
//	}
}
