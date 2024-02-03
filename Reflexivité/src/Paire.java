
public class Paire {
	private String valeur1,valeur2;
	public Paire()
	{
		this.valeur1 = null;
		this.valeur2 =null;
		System.out.println("Instanciation !!");
	}
	public Paire(String val1,String val2)
	{
		this.valeur1 =val1;
		this.valeur1 = val2;
		System.out.println("Instaciation avec ses parametres");
	}
	public String toString()
	{
		return "je suis un Object qui a pour valeur"+this.valeur1+"-"+this.valeur2;
	}
	public String getValeur1()
	{
		return this.valeur1;
	}
	public void setvaleur2(String val1)
	{
		this.valeur1 = val1;
	}
	public String getvaleur2()
	{
		return this.valeur2;
	}
	public void setvaleur2()
	{
		this.valeur1 =valeur1;
	}
	

}
