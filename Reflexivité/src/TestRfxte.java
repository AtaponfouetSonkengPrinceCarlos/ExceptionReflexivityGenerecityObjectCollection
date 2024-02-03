import java.lang.reflect.Method;
import java.awt.event.MouseListener;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Font;
public class TestRfxte {
	public static void main(String[] args)
	{
		Class c = MouseListener.class;
		Class c2 = new Object().getClass();
		System.out.println("la super class de la classe "+c.getName()+" est java "+c.getSuperclass());
		Class faces[] = c.getInterfaces();
				System.out.println("il ya "+faces.length+" interfaces implementeantd "+c.getName());
				for(int i =0;i<faces.length;i++ )
					System.out.println(faces[i]);
				Method m[] = c2.getMethods();
				Method m1[] = c.getMethods();
				System.out.println("il ya"+m1.length+" methode de qui sont:");
				for( int i=0;i<m1.length;i++)
				{
					System.out.println(m1[i]);
					Class p[] =m1[i].getParameterTypes();
					for(int j=0;j<p.length;j++)
						System.out.println(p[j].getName());
					System.out.println("--------------------------------------------------------\n");
					
				}
				
				Constructor construc[] =c.getConstructors();
				System.out.println("\n\nIl ya "+construc.length+" constructeur(s) Dans cette class");
				for(int i=0;i<construc.length;i++) {
			System.out.println(construc[i].getName());
			System.out.println("----------------------------------------------------------------------------------\n");
			Paire p = new Paire("valeur1","valeurs2");
				}
	}

}
