import java.util.ArrayList;
import java.util.List;
public class TestGrnt {
	public static void main(String[] args)
	{
		ArrayList<Voiture> listVoiture = new ArrayList<Voiture>();
		listVoiture.add(new Voiture());
		listVoiture.add(new Voiture());
		ArrayList<Object> listVoitureSP = new ArrayList<Object>();
		listVoitureSP.add(new Object());
		listVoitureSP.add(new Object());
		affiche(listVoiture);
		
	}
	static void affiche(List<? super Voiture> list)
	{
	for(Object O : list)
		System.out.println(O.toString());
	}
}
