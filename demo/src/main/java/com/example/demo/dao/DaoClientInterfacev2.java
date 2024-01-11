package com.example.demo.dao;

import com.example.demo.entity.Client;

import java.sql.SQLException;
import java.util.List;

public interface DaoClientInterfacev2 {


//	<Client> List<Client> getAllClients();
	// public List<Client> getByID(int id) throws SQLException ;
	//	public Client updateClient(int id,Client client);

	Client getByID(int id) throws SQLException;

    List<Client> getAll() throws SQLException;

//	<Client> Client updateClient(int id, Client client);

//	public void deleteClient(int id);
	public Client createClient(Client client);
//
//	Client createClient(Client client);
//	// public List<Client> getByMC(String mc);
}
