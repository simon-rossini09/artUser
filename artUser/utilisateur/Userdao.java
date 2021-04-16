 package utilisateur ;
 
 import java.sql.Connection;
import java.sql.PreparedStatement;

import bean.User;

public class Userdao implements IDAO<User> {

	Connection connect = Connect.getConnection();

	@Override
	public boolean ajoutUtilisateur(User object) {
		boolean message = false;
		try {
			PreparedStatement req = connect.prepareStatement("INSERT INTO user (nom,prenom,email,password)"
					+ "VALUES (?,?,?,?)");

			req.setString(1, object.getNom());
			req.setString(2, object.getPrenom());
			req.setString(3, object.getEmail());
			req.setString(4, object.getPwd());

			req.executeUpdate();

			System.out.println( object.getPrenom()+ "  " +object.getNom() +" a été bien ajouté en base");

			message= true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Insertion KO");
		}
		return message;