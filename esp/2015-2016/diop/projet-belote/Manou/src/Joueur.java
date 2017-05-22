package game;
import java.util.*;
public class Joueur
{
	Scanner read=new Scanner(System.in);
	private String name;
	private int score;
	private int carteRecord;
    private Carte[] tCarte=new Carte[13];
    
    public Joueur(String cName)
    { 
    	name=cName;
    	score=0;
    	carteRecord=0;
    	for(int i=0;i<13;i++)
    		tCarte[i] = new Carte();	
    }
    public String getName()
    {
    	return name;
    }
    public int getScore()
    {
    	return score;
    }
    public int getCarteRecord()
    {
    	return carteRecord;
    }
    public Carte getTCarte(int i)//pour reperé l'emplacecement de la carte dans le tabbleau de carte de joueur
    {
   		return tCarte[i];
    }
    public void setName(String sName)
    {
    	name=sName;
    }
    public void setScore(int sScore)
    {
    	score=sScore;
    }
    public void setCarteRecord(int sCarteRecord)
    {
    	carteRecord=sCarteRecord;
    }
    public void setTCarte(Carte sTCarte, int i)
    {
    	tCarte[i]=sTCarte;
    }
    
    public void addCarte(Carte carte, int i)//pour reperé l'emplacecement de la carte dans le tabbleau de carte de joueur
    {
    	this.setTCarte(carte, i);
    }
    
    public Carte playFirst()
    {
     	    for(int i=0; i<13; i++)
    		{
    			if(tCarte[i]!=null)
    			{
    				Carte tmp=tCarte[i];
		    		tCarte[i]=null;
		    		this.carteRecord--;
		    		return tmp;	
    			}
    		}
            
             return null;	   
    }			
    
    public Carte play(int signe)
    {
    	int[] pos = new int[12];
    	int nbre=0;
        for(int i=0; i<13; i++)
        {
        	if(tCarte[i]!=null)
	        	if( tCarte[i].getSigne()==signe)
	        	{
	        		pos[nbre]=i;
	        		nbre++;
	        	}     		
        }
        if(nbre>0)
        {
        	Carte tmp=tCarte[pos[nbre-1]];
    		tCarte[pos[nbre-1]]=null;
        	this.carteRecord--;
        	return tmp;
        }
        else
        {
        	for(int i=0; i<13; i++)
    		{
    			if(tCarte[i]!=null)
    			{
    				Carte tmp=tCarte[i];
		    		tCarte[i]=null;
		    		this.carteRecord--;
		    		return tmp;	
    			}
    		}
        	 return null;
    	} 
      
    }
    public void tourwine(Carte[] carte)
    {
    	for(int i=0; i<carte.length; i++)
    		this.score+=carte[i].getValue();
    	
    }
    
	

}
