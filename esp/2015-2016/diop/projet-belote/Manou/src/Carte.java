package game;

public class Carte 
{
	private int signe;
	private String name;
	private int value;
	
	public Carte()
	{
		signe=0;
		name="nul";
		value=1;
	}
	public Carte(int cSigne, int cValue, String cName)
	{
		signe=cSigne;
		name=cName;
		value=cValue;
	}
	
	public int getSigne()
	{
		return signe;
	}
	public int getValue()
	{
		return value;
	}
	public String getName()
	{
		return name;
	}
	public void setSigne(int sSigne)
	{
		signe=sSigne;
	}
	public void setName(String sName)
	{
		name=sName;
	}
	public void setValue(int sValue)
	{
		value=sValue;
	}
	public String toString()
	{
		return this.signe + " " + this.name + " " + this.value;
	}
	
	

}
