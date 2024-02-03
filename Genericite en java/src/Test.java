import java.util.ArrayList;
public class Test {
public static void main(String[] args)
{
	Solo<String> val = new Solo<String>("Oui la genericite");
	String str = val.getValeur();
	Duo<?,?> dual = new Duo<Boolean,String>(true,"encore la double genericite" );
	System.out.println("valeur de l objet dual: "+dual.getSvaleur() +" et " +dual.getTvaleur());
	dual = new Duo<String,Character>("\ton peut changer le type de duo",'0');
	System.out.println("\n\tnouvelle valeur  de l objet dual par affectation: "+dual.getSvaleur() +" et " +dual.getTvaleur());
	System.out.println("Genericiter avec collection");
	System.out.println("####################################################################");
	ArrayList<String> ListeString = new ArrayList<String>();
	ListeString.add("une chaine");
	ListeString.add("une autre chaine");
	ListeString.add("encore une autre");
	ListeString.add("the last");
	for(String str1 : ListeString)
		System.out.println(str1);
	ArrayList<Float> listFloat = new ArrayList<Float>();
	listFloat.add(12.25f);
	listFloat.add(2.25f);
	System.out.println("\npour les listes de Float------------------------------------");
	for(Float f : listFloat)
		System.out.println(f);
	ArrayList<? extends Voiture> ListVoiture = new ArrayList<Voiture>();
	ArrayList<VoitureSansPermis> listVoitureSP= new ArrayList<VoitureSansPermis>();
	ListVoiture = listVoitureSP;
	for(int i=0;i<ListVoiture.size();i++)
		System.out.println("l element a l index "+i+"= "+ListVoiture.get(i));
	
}}