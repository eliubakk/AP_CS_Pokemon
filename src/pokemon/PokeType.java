package pokemon;

import java.util.*;

public class PokeType 
{
	private String ID;
	private int color; //0-White, 1-Dark Red, 2- light Blue, 3-Poison, 4-Ground, 5-Rock, 6-Bug, 7-Ghost, 8-Steel, 9-Fire, 10-Water, 11-Grass, 12-Electric, 13-Psychic, 14-Ice, 15-Dragon, 16-Dark 
	private ArrayList<String> ResistedBy, Strengths, ImmuneTo;
	static public int[][] rgbNumbers= {{255, 139, 173, 128, 139, 128, 50, 218, 105, 255, 0, 0, 255, 255, 0, 255, 47}, {255, 0, 216, 0, 69, 128, 205, 112, 105, 0, 0, 255, 255, 20, 206, 165, 79}, {255, 0, 230, 128, 19, 128, 50, 214, 105, 0, 255, 0, 0, 147, 209, 0, 79}}; 
	
	public PokeType(String typeID)
	{
		ID = typeID;
		ResistedBy = new ArrayList<String>();
		Strengths = new ArrayList<String>();
		ImmuneTo = new ArrayList<String>();
		switch(ID)
		{
			case "Normal": ResistedBy.add("Rock");
				       	   ResistedBy.add("Steel");
				       	   Strengths.add("Normal");//New
				           ImmuneTo.add("Ghost");
				           setColor(0);
				           break;
			case "Fighting": ResistedBy.add("Flying");
							 ResistedBy.add("Poison");
							 ResistedBy.add("Bug");
							 ResistedBy.add("Psychic");
							 Strengths.add("Normal");
							 Strengths.add("Rock");
							 Strengths.add("Steel");
							 Strengths.add("Ice");
							 Strengths.add("Dark");
							 ImmuneTo.add("Ghost");
							 setColor(1);
							 break;
			case "Flying": ResistedBy.add("Rock");
			   			   ResistedBy.add("Steel");
			   			   ResistedBy.add("Electric");
			   			   Strengths.add("Fighting");
			   			   Strengths.add("Bug");
			   			   Strengths.add("Grass");
			   			   setColor(2);
			   			   break;
			case "Poison": ResistedBy.add("Poison");
			   			   ResistedBy.add("Ground");
			   			   ResistedBy.add("Rock");
			   			   ResistedBy.add("Ghost");
			   			   Strengths.add("Bug");//Bug
			   			   Strengths.add("Grass");
			   			   ImmuneTo.add("Steel");
			   			   setColor(3);
			   			   break;
			case "Ground": ResistedBy.add("Bug");
						   ResistedBy.add("Grass");
						   Strengths.add("Poison");
						   Strengths.add("Rock");
						   Strengths.add("Steel");
						   Strengths.add("Fire");
						   Strengths.add("Electric");
						   ImmuneTo.add("Flying");
						   setColor(4);
						   break;
			case "Rock": ResistedBy.add("Fighting");
						 ResistedBy.add("Ground");
						 ResistedBy.add("Steel");
						 Strengths.add("Flying");
						 Strengths.add("Bug");
						 Strengths.add("Fire");
						 Strengths.add("Ice");
						 setColor(5);
						 break;
			//Start here for reordering;
			case "Bug": ResistedBy.add("Fighting");
						ResistedBy.add("Flying");
						ResistedBy.add("Poison");
						ResistedBy.add("Ghost");
						ResistedBy.add("Steel");
						ResistedBy.add("Fire");
						Strengths.add("Grass");
						Strengths.add("Psychic");
						Strengths.add("Dark");
						setColor(6);
						break;
			case "Ghost": ResistedBy.add("Steel");
						  ResistedBy.add("Dark");
						  Strengths.add("Ghost");
						  Strengths.add("Psychic");
						  ImmuneTo.add("Normal");
						  setColor(7);
						  break;
			case "Steel": ResistedBy.add("Steel");
						  ResistedBy.add("Fire");
						  ResistedBy.add("Water");
						  ResistedBy.add("Electric");
						  Strengths.add("Rock");
						  Strengths.add("Ice");
						  setColor(8);
						  break;
			case "Fire": ResistedBy.add("Rock");
					     ResistedBy.add("Fire");
					     ResistedBy.add("Water");
					     ResistedBy.add("Dragon");
					     Strengths.add("Bug");
					     Strengths.add("Steel");
					     Strengths.add("Grass");
					     Strengths.add("Ice");
					     setColor(9);
					     break;
			case "Water": ResistedBy.add("Water");
				 		  ResistedBy.add("Grass");
				 		  ResistedBy.add("Dragon");
				 		  Strengths.add("Ground");
				 		  Strengths.add("Rock");
				 		  Strengths.add("Water");
				 		  setColor(10);
				 		  break;
			case "Grass": ResistedBy.add("Flying");
						  ResistedBy.add("Poison");
						  ResistedBy.add("Bug");
						  ResistedBy.add("Steel");
						  ResistedBy.add("Fire");
						  ResistedBy.add("Grass");
						  ResistedBy.add("Dragon");
						  Strengths.add("Ground");
						  Strengths.add("Rock");
						  Strengths.add("Water");
						  setColor(11);
						  break;
			case "Electric": ResistedBy.add("Grass");
							 ResistedBy.add("Electric");
							 ResistedBy.add("Dragon");
							 Strengths.add("Flying");
							 Strengths.add("Water");
							 ImmuneTo.add("Ground");
							 setColor(12);
							 break;
			case "Psychic": ResistedBy.add("Steel");
						    ResistedBy.add("Psychic");
						    Strengths.add("Fighting");
						    Strengths.add("Poison");
						    ImmuneTo.add("Dark");
						    setColor(13);
						    break;
			case "Ice": ResistedBy.add("Steel");
					    ResistedBy.add("Fire");
					    ResistedBy.add("Water");
					    ResistedBy.add("Ice");
					    Strengths.add("Flying");
					    Strengths.add("Ground");
					    Strengths.add("Grass");
					    Strengths.add("Dragon");
					    setColor(14);
					    break;
			case "Dragon": ResistedBy.add("Normal");//New
						   ResistedBy.add("Steel");
						   Strengths.add("Electric");//New
					       Strengths.add("Dragon");
					       setColor(15);
					       break;
			case "Dark": ResistedBy.add("Fighting");
						 ResistedBy.add("Steel");
						 ResistedBy.add("Dark");
						 Strengths.add("Ghost");
						 Strengths.add("Psychic");
						 setColor(16);
						 break;
			
						   
		}
	}
	
	public boolean isResisted(String s)
	{
		return ResistedBy.contains(s);
	}
	
	public boolean isStrength(String s)
	{
		return Strengths.contains(s);
	}
	
	public boolean isImmune(String s)
	{
		return ImmuneTo.contains(s);
	}
	
	public double getDamageMultiplier(PokeType Type1, PokeType Type2)
	{
		String DefendingType1 = Type1.getID(); 
		double Multiplier = 0;
		if(this.isResisted(DefendingType1))
			Multiplier = 0.5;
		else if(this.isStrength(DefendingType1))
			Multiplier = 2.0;
		else if (this.isImmune(DefendingType1))
			Multiplier = 0.0;
		else 
			Multiplier = 1.0;
		try{
			String DefendingType2 = Type2.getID();
			if(this.isResisted(DefendingType2))
				return Multiplier * 0.5;
			else if(this.isStrength(DefendingType2))
				return Multiplier * 2.0;
			else if(this.isImmune(DefendingType2))
				return Multiplier * 0.0;
			else
				return Multiplier * 1.0;
		}
		catch(NullPointerException e){}
		return Multiplier;
	}
	
	public String getID()
	{
		return ID;
	}

	public int getColor()
	{
		return color;
	}

	public void setColor(int color)
	{
		this.color = color;
	}
}
