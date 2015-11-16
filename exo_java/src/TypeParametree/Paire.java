package TypeParametree;


public class Paire<T> {

	private T i, j;
	
	public Paire(T i, T j)
	{
		this.i = i;
		this.j = j;
	}
	
	public void setI(T i)
	{
		this.i = i;
	}
	public void setJ(T j)
	{
		this.j = j;
	}
	public T getI()
	{
		return i;
	}
	public T getJ()
	{
		return j;
	}
	public String toString()
	{
		return this.toString();
		
	}
}
