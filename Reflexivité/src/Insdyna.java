import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class Insdyna {
	public static void main(String[] args)
	{
		String nom = Paire.class.getName();
		System.out.println(nom);
		try
		{
			Class c1 = Class.forName(nom);
			Object o = c1.newInstance();
			Class types[] = new Class[] {String.class,String.class};
			Constructor ct = c1.getConstructor(types);
			Object o1 = ct.newInstance(new String[] {"valeur1","valeur2"});
			Method m = c1.getMethod("toString",null);
			System.out.println("Method "+m.getName()+" sur o2 :" +m.invoke(o1, null));
		}
	catch(SecurityException e)
		{
			e.printStackTrace();
		}catch(IllegalArgumentException e)
		{
			e.printStackTrace();
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}catch(InstantiationException e)
		{
			e.printStackTrace();
		}catch(IllegalAccessException e)
		{
			e.printStackTrace();
		}catch(NoSuchMethodException e)
		{
			e.printStackTrace();
		}catch(InvocationTargetException e)
		{
			e.printStackTrace();
		}
	}
	

}
