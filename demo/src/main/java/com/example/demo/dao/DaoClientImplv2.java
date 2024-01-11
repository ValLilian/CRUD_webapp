package com.example.demo.dao;

import com.example.demo.entity.Client;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DaoClientImplv2 implements DaoClientInterfacev2 {
	ConnexionJdbc connexionJdbc;
	public DaoClientImplv2(){
		this.connexionJdbc = new ConnexionJdbc();
	}



//	@Override
//	public <Client> List<Client> getAllClients()  {
//        return null;
//    }

//	@Override
//	public Client updateClient(int id, Client client) {
//		return null;
//	}


	@Override
	 public Client getByID(int id) throws SQLException {
	 	connexionJdbc = new ConnexionJdbc();
	 	PreparedStatement request = connexionJdbc.getConnection().prepareStatement("select * from clients where id = ? ");
	 	request.setInt(1,id);
	 	ResultSet resultSet;
		 resultSet = request.executeQuery();



	 		Client client = null;

			 if (resultSet.next()) {
				 client = new Client(
						 resultSet.getInt("id"),
						 resultSet.getString("nom"),
						 resultSet.getString("prenom"),
						 resultSet.getString("email"),
						 resultSet.getString("telephone")
				 );
			 }

	 		connexionJdbc.getConnection().close();



	 	return client;

	 }

	@Override
	public List<Client> getAll() throws SQLException {
		connexionJdbc = new ConnexionJdbc();
		PreparedStatement request = connexionJdbc.getConnection().prepareStatement("SELECT * FROM clients");
		ResultSet resultSet;
		resultSet = request.executeQuery();

		List<Client> clients = new ArrayList<>();


		while (resultSet.next()) {
			Client client = new Client(
					resultSet.getInt("id"),
					resultSet.getString("nom"),
					resultSet.getString("prenom"),
					resultSet.getString("email"),
					resultSet.getString("telephone")
			);
			clients.add(client);
		}

		connexionJdbc.getConnection().close();

		return clients;
	}

//	@Override
//	public <Client> Client updateClient(int id, Client client) {
//		return null;
//	}

//	public List<Commande> getAll() throws SQLException {
//		connexionJdbc = new ConnexionJdbc();
//		PreparedStatement request = connexionJdbc.getConnection().prepareStatement("SELECT" +
//				"    Commande.CommandeID," +
//				"    Commande.DateCommande," +
//				"    Client.ClientID," +
//				"    Client.Nom AS NomClient," +
//				"    Client.Prenom AS PrenomClient," +
//				"    Client.Email AS EmailClient," +
//				"    Article.ArticleID," +
//				"    Article.NomArticle," +
//				"    Article.Prix," +
//				"    Article.Description," +
//				"    CommandeArticle.Quantite " +
//				"FROM" +
//				"    Commande " +
//				"JOIN" +
//				"    Client ON Commande.ClientID = Client.ClientID " +
//				"JOIN" +
//				"    CommandeArticle ON Commande.CommandeID = CommandeArticle.CommandeID " +
//				"JOIN" +
//				"    Article ON CommandeArticle.ArticleID = Article.ArticleID;");
//		ResultSet resultSet;
//		List<Commande> commandes = new ArrayList<>();
//			resultSet = request.executeQuery();
//
//			Commande commande = null;
//
//
//			// while (resultSet.next()) {
//			// 	client = new Client(
//			// 			resultSet.getInt("id"),
//			// 			resultSet.getString("nom"),
//			// 			resultSet.getString("prenom"),
//			// 			resultSet.getString("email"),
//			// 			resultSet.getString("telephone")
//			// 	);
//
//			while (resultSet.next()) {
//
//
//
//                commande = new Commande();
//                commande.setCommandeID(resultSet.getInt("CommandeID"));
//                commande.setDateCommande(resultSet.getDate("DateCommande"));
//				commande.setClientID(resultSet.getInt("ClientID"));
//				commande.setNomClient(resultSet.getString("NomClient"));
//				commande.setPrenomClient(resultSet.getString("PrenomClient"));
//				commande.setEmailClient(resultSet.getString("EmailClient"));
//				commande.setArticleID(resultSet.getInt("ArticleID"));
//				commande.setNomArticle(resultSet.getString("NomArticle"));
//
//                commandes.add(commande);
//            }
//
//			connexionJdbc.getConnection().close();
//
//
//
//		return commandes;
//
//	}

//	@Override
//	public <Client> Client updateClient(int id, Client client) {
//		try {
//			int resultSet;
//			PreparedStatement preparedStatement = connexionJdbc.getConnection().prepareStatement("UPDATE clients SET nom = ? , prenom = ?, email = ?, telephone = ? WHERE id = ?");
//
//			preparedStatement.setString(1, client.getNom());
//			preparedStatement.setString(2, client.getPrenom());
//			preparedStatement.setString(3, client.getEmail());
//			preparedStatement.setString(4, client.getTel());
//			preparedStatement.setInt(5, id);
//
//			resultSet = preparedStatement.executeUpdate();
//
//			connexionJdbc.getConnection().close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return client;
//	}

//	@Override
//	public void deleteClient(int id) {
//		try {
//			int resultSet;
//			PreparedStatement preparedStatement = connexionJdbc.getConnection().prepareStatement("DELETE FROM clients WHERE id = ?");
//
//			preparedStatement.setInt(1, id);
//
//			resultSet = preparedStatement.executeUpdate();
//
//			connexionJdbc.getConnection().close();
//
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}

	@Override
	public Client createClient(Client client) {
		try {
			int resultSet;
			PreparedStatement preparedStatement = connexionJdbc.getConnection().prepareStatement("INSERT INTO clients VALUES ('?', '?', '?', '?', '?'");

			preparedStatement.setInt(1, client.getId());
			preparedStatement.setString(2, client.getNom());
			preparedStatement.setString(3, client.getPrenom());
			preparedStatement.setString(4, client.getEmail());
			preparedStatement.setString(5, client.getTel());

			resultSet = preparedStatement.executeUpdate();

			connexionJdbc.getConnection().close();

			}catch (SQLException e) {
				e.printStackTrace();
			}
			return client;
		}

	// @Override
	// public List<Client> getByMC(String mc) {
	// 	List<Client> clients = new ArrayList<>();
	// 	try {
	// 		PreparedStatement preparedStatement = connexionJdbc.getConnection().prepareStatement("SELECT * FROM clients WHERE nom LIKE ? OR prenom LIKE ? OR email LIKE ? OR telephone LIKE ?");
			
	// 		preparedStatement.setString(1, "%mc%");
	// 		preparedStatement.setString(2, "%mc%");
	// 		preparedStatement.setString(3, "%mc%");
	// 		preparedStatement.setString(4, "%mc%");
			
	// 		ResultSet resultSet;

	// 		resultSet = preparedStatement.executeQuery();

	// 		Client client = null;

	// 		while (resultSet.next()) {
	// 			client = new Client(
	// 				resultSet.getInt("id"),
	// 				resultSet.getString("nom"),
	// 				resultSet.getString("prenom"),
	// 				resultSet.getString("email"),
	// 				resultSet.getString("telephone")
	// 			);
	// 			clients.add(client);
	// 		}
	// 		connexionJdbc.getConnection().close();

			
	// 	} catch (SQLException e) {
	// 			e.printStackTrace();
	// 	}
	// 	return clients;
    // }
}
