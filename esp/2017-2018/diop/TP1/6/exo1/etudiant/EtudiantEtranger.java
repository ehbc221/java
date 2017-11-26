package etudiant;

public class EtudiantEtranger extends Etudiant
{

	private String paysOrigine;
	
	public EtudiantEtranger() {
		super();
		this.setPaysOrigine("inconnu");
	}

	public EtudiantEtranger(String nom, String prenom, int age, String niveau, String filiere, String paysOrigine)
	{
		super(nom, prenom, age, niveau, filiere);
		this.setPaysOrigine(paysOrigine);
	}

	public String getPaysOrigine() {
		return paysOrigine;
	}

	public void setPaysOrigine(String paysOrigine) {
		this.paysOrigine = paysOrigine;
	}

	public void affiche() {
		super.affiche();
		String infosE = new String("\n");
		infosE += "Pays d'origine : " + this.getPaysOrigine();
		System.out.print(infosE);
	}

}