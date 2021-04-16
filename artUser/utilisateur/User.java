package utilisateur;

public class User {
	private int id; 
	private String nom ;
	private String prenom ;
	private String email;
	private String password;
	public user() {
		super();
	
	}
	public user (String nom, String prenom, String email, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getemail() {
		return email; 
	}
	public void setemail(String email) {
		this.email = email;
	}
	public string getpassword() {
		return password ;
	}
	public void setpassword( ) {
		this.password = password ; 
	}
}
	