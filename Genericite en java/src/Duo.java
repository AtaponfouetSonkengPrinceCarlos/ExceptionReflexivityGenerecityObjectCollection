
public class Duo<T,S> {
	private T Tval;
	private S Sval;
	public Duo()
	{
		this.Sval =null;
		this.Tval =null;
	}
	public Duo(T Tva, S Sva)
	{
		this.Tval =Tva;
		this.Sval = Sva;
	}
	public T getTvaleur()
	{
		return this.Tval;
	}
	public S getSvaleur()
	{
		return this.Sval;
	}
	public void setSvaleur(S val)
	{
		this.Sval = val;
	}
	public void setTvaleur(T val)
	{
		this.Tval =val;
	}
	

}
