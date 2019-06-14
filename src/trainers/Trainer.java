package trainers;

import java.util.ArrayList;

import moves.Move;
import pokemon.*;

public class Trainer extends Person
{
	
	private ArrayList<SeenPokemon> team = new ArrayList<SeenPokemon>();
	public int level;//0-(lv 5-7), 1-(lv 7-10), 2-(lv 10-15), 3-(lv 15-20), 4-(20-23), 5-(23-26), 6-(26-30), 7-(30-35), 8-(35-40), 9-(40-50), 10-(50-60)
	//private int typeOfTrainer;
	
	public Trainer()
	{
		super("Blank");
	}
	public Trainer(String s)
	{
		super(s);
	}
	public Trainer(String s, SeenPokemon p) 
	{
		super(s);
		team.add(p);
	}
	public Trainer(String s, SeenPokemon p1, SeenPokemon p2) 
	{
		super(s);
		team.add(p1);
		team.add(p2);
	}
	public Trainer(String s, SeenPokemon p1, SeenPokemon p2, SeenPokemon p3) 
	{
		super(s);
		team.add(p1);
		team.add(p2);
		team.add(p3);
	}
	public Trainer(String s, SeenPokemon p1, SeenPokemon p2, SeenPokemon p3, SeenPokemon p4) 
	{
		super(s);
		team.add(p1);
		team.add(p2);
		team.add(p3);
		team.add(p4);
	}
	public Trainer(String s, SeenPokemon p1, SeenPokemon p2, SeenPokemon p3, SeenPokemon p4, SeenPokemon p5) 
	{
		super(s);
		team.add(p1);
		team.add(p2);
		team.add(p3);
		team.add(p4);
		team.add(p5);
	}
	public Trainer(String s, SeenPokemon p1, SeenPokemon p2, SeenPokemon p3, SeenPokemon p4, SeenPokemon p5, SeenPokemon p6) 
	{
		super(s);
		team.add(p1);
		team.add(p2);
		team.add(p3);
		team.add(p4);
		team.add(p5);
		team.add(p6);
	}
	
	public Trainer(String string, Object setMoves, Object setMoves2, Object setMoves3, Object setMoves4, Object setMoves5, Object setMoves6)
	{
		super(string);
		team.add((SeenPokemon)(setMoves));
		team.add((SeenPokemon)(setMoves2));
		team.add((SeenPokemon)(setMoves3));
		team.add((SeenPokemon)(setMoves4));
		team.add((SeenPokemon)(setMoves5));
		team.add((SeenPokemon)(setMoves6));
	}
	public void setPokemon(int place, SeenPokemon poke)
	{
		team.set(place, poke);
	}
	
	public void addPokemon(SeenPokemon poke)
	{
		team.add(poke);
	}
	
	public void setFirst(SeenPokemon first) 
	{
		team.set(0, first);
	}

	public void setSecond(SeenPokemon second) 
	{
		team.set(1, second);
	}
	
	public void setThird(SeenPokemon third) 
	{
		team.set(2, third);
	}
	
	public void setFourth(SeenPokemon fourth) 
	{
		team.set(3, fourth);
	}
	
	public void setFifth(SeenPokemon fifth) 
	{
		team.set(4, fifth);
	}

	public void setSixth(SeenPokemon sixth) 
	{
		team.set(5, sixth);
	}
	public ArrayList<SeenPokemon> getTeam()
	{
		return team;
	}
	
	public int OrganizeTeam(int currentPokeIndex)
	{
		SeenPokemon temp = new SeenPokemon();
		SeenPokemon newPoke = team.get(currentPokeIndex);
		int newPokeIndex = currentPokeIndex;
		int numAlive = team.size();
		for(int i = 0; i < numAlive; i++)
		{
			if(!team.get(i).isAlive())
			{
				
				temp = team.remove(i);
				team.add(temp);	
				i--;
				numAlive--;
			}
		}
		newPokeIndex = team.indexOf(newPoke);
		return newPokeIndex;
	}
	
	public int numberOfPokemonAlive()
	{
		int total = 0;
		total = team.size() - numberOfPokemonFainted();
		return total;
	}
	
	public int numberOfPokemonFainted()
	{
		int total = 0;
		for(SeenPokemon x: team)
		{
			if(!x.isAlive())
			{
				total++;
			}
		}
		return total;
	}
	
	public boolean isBlackedOut()
	{
		for(SeenPokemon x: team)
		{
			if(x.isAlive())
				return false;
		}
		return true;
	}
	
	public int BattleAI(int trainer, CaughtPokemon h)
	{
		SeenPokemon t = team.get(trainer);
		int numOfTeamAlive = 0;
		for(SeenPokemon x: team)
		{
			if(x.isAlive())
				numOfTeamAlive++;
		}
		if(numOfTeamAlive <= 1)
			return 0;
		for(Move m: t.getMoves())
		{
			if(m.getAttackType() != 2)
				if(1.0 < m.getPokeType().getDamageMultiplier(h.getType().get(0), h.getType().get(1)))
					return 0;
		}
		for(Move m: t.getMoves())
		{
			if(m.getAttackType() == 2)
				if(0 != m.getPokeType().getDamageMultiplier(h.getType().get(0), h.getType().get(1)))
					return 0;
		}
		if(1.0 < h.getType().get(0).getDamageMultiplier(t.getType().get(0), t.getType().get(1)))
		{
			if(hasSwitch(trainer, h))
				return 1;
		}
		else if(h.getType().get(1) != null)
			if(1.0 < h.getType().get(1).getDamageMultiplier(t.getType().get(0), t.getType().get(1)))
				if(hasSwitch(trainer, h))
					return 1;
		return Move.genrand(0, 1);
	}
	
	public int chooseMove(int trainer, CaughtPokemon h)
	{
		SeenPokemon t = team.get(trainer);
		for(int m = 0; m < t.getMoves().size(); m++)
		{
			if(t.getMoves().get(m).getAttackType() != 2)
				if(1.0 < t.getMoves().get(m).getPokeType().getDamageMultiplier(h.getType().get(0), h.getType().get(1)))
					return m;
		}
		for(int m = 0; m < t.getMoves().size(); m++)
		{
			if(t.getMoves().get(m).getAttackType() == 2)
				if(0 != t.getMoves().get(m).getPokeType().getDamageMultiplier(h.getType().get(0), h.getType().get(1)))
					return m;
		}
		return Move.genrand(0, t.getMoves().size() - 1);
	}
	
	public boolean hasSwitch(int trainer, CaughtPokemon h)
	{
		for(int i = 0; i < team.size(); i++)
		{
			if(i != trainer)
			{
				if(team.get(i).isAlive())
				{
					if(h.getType().get(1) != null)
					{
						if(1.0 >= h.getType().get(0).getDamageMultiplier(team.get(i).getType().get(0), team.get(i).getType().get(1)) || 1.0 >= h.getType().get(1).getDamageMultiplier(team.get(i).getType().get(0), team.get(i).getType().get(1)))
							return true;
					}
					else if(1.0 >= h.getType().get(0).getDamageMultiplier(team.get(i).getType().get(0), team.get(i).getType().get(1)))
						return true;
				}
			}
		}
		return false;
	}
	
	public int chooseSwitch(int trainer, CaughtPokemon h)
	{
		int bestChoice;
		int typeOfChoice = 0; //0-random,1-resistant against one type, 2-immune, 3-resistant + resistant, 4-immune + resistant, 5-immune + immune, 6-resistant and supereffective move, 7-immune and supereffective, 8-resistant+resistant and supereffective, 9-immune + resistant supereffective, 10-immune + immune and supereffective
		do
		{
			bestChoice = Move.genrand(0, team.size() - 1);
		}while(bestChoice == trainer && !team.get(bestChoice).isAlive());
		
		for(int i = 0; i < team.size(); i++)
		{
			if(i != trainer)
			{
				if(team.get(i).isAlive())
				{
					if(h.getType().get(1) != null)
					{
						boolean TypeOneResistant = (h.getType().get(0).getDamageMultiplier(team.get(i).getType().get(0), team.get(i).getType().get(1)) == 0.5 || h.getType().get(0).getDamageMultiplier(team.get(i).getType().get(0), team.get(i).getType().get(1)) == 0.25);
						boolean TypeOneImmune = (h.getType().get(0).getDamageMultiplier(team.get(i).getType().get(0), team.get(i).getType().get(1)) == 0.0);
						boolean TypeTwoResistant = (h.getType().get(1).getDamageMultiplier(team.get(i).getType().get(0), team.get(i).getType().get(1)) == 0.5 || h.getType().get(1).getDamageMultiplier(team.get(i).getType().get(0), team.get(i).getType().get(1)) == 0.25);
						boolean TypeTwoImmune = (h.getType().get(1).getDamageMultiplier(team.get(i).getType().get(0), team.get(i).getType().get(1)) == 0.0);
						boolean SuperEffectiveMove = false;
						for(Move m: team.get(i).getMoves())
						{
							if(m.getAttackType() != 2)
							{
								if(m.getPokeType().getDamageMultiplier(h.getType().get(0), h.getType().get(1)) > 1.0)
									SuperEffectiveMove = true;
							}
						}
						if((TypeOneResistant ^ TypeTwoResistant) && !(TypeOneImmune || TypeTwoImmune) && !SuperEffectiveMove)
						{
							if(typeOfChoice < 1)
							{
								bestChoice = i;
								typeOfChoice = 1;
							}
						}
						else if(!(TypeOneResistant || TypeTwoResistant) && (TypeOneImmune ^ TypeTwoImmune) && !SuperEffectiveMove)
						{
							if(typeOfChoice < 2)
							{
								bestChoice = i;
								typeOfChoice = 2;
							}
						}
						else if(TypeOneResistant && TypeTwoResistant && !(TypeOneImmune || TypeTwoImmune) && !SuperEffectiveMove)
						{
							if(typeOfChoice < 3)
							{
								bestChoice = i;
								typeOfChoice = 3;
							}
						}
						else if((TypeOneResistant ^ TypeTwoResistant) && (TypeOneImmune ^ TypeTwoImmune) && !SuperEffectiveMove)
						{
							if(typeOfChoice < 4)
							{
								bestChoice = i;
								typeOfChoice = 4;
							}
						}
						else if(!(TypeOneResistant || TypeTwoResistant) && (TypeOneImmune && TypeTwoImmune) && !SuperEffectiveMove)
						{
							if(typeOfChoice < 5)
							{
								bestChoice = i;
								typeOfChoice = 5;
							}
						}
						else if((TypeOneResistant ^ TypeTwoResistant) && !(TypeOneImmune || TypeTwoImmune) && SuperEffectiveMove)
						{
							if(typeOfChoice < 6)
							{
								bestChoice = i;
								typeOfChoice = 6;
							}
						}
						else if(!(TypeOneResistant || TypeTwoResistant) && (TypeOneImmune ^ TypeTwoImmune) && SuperEffectiveMove)
						{
							if(typeOfChoice < 7)
							{
								bestChoice = i;
								typeOfChoice = 7;
							}
						}
						else if(TypeOneResistant && TypeTwoResistant && !(TypeOneImmune || TypeTwoImmune) && SuperEffectiveMove)
						{
							if(typeOfChoice < 8)
							{
								bestChoice = i;
								typeOfChoice = 8;
							}
						}
						else if((TypeOneResistant ^ TypeTwoResistant) && (TypeOneImmune ^ TypeTwoImmune) && SuperEffectiveMove)
						{
							if(typeOfChoice < 9)
							{
								bestChoice = i;
								typeOfChoice = 9;
							}
						}
						else if(!(TypeOneResistant || TypeTwoResistant) && (TypeOneImmune && TypeTwoImmune) && SuperEffectiveMove)
						{
							if(typeOfChoice < 10)
							{
								bestChoice = i;
								typeOfChoice = 10;
							}
						}
					}
					else 
					{
						boolean TypeOneResistant = (h.getType().get(0).getDamageMultiplier(team.get(i).getType().get(0), team.get(i).getType().get(1)) == 0.5 || h.getType().get(0).getDamageMultiplier(team.get(i).getType().get(0), team.get(i).getType().get(1)) == 0.25);
						boolean TypeOneImmune = (h.getType().get(0).getDamageMultiplier(team.get(i).getType().get(0), team.get(i).getType().get(1)) == 0.0);
						boolean SuperEffectiveMove = false;
						for(Move m: team.get(i).getMoves())
						{
							if(m.getAttackType() != 2)
							{
								if(m.getPokeType().getDamageMultiplier(h.getType().get(0), h.getType().get(1)) > 1.0)
									SuperEffectiveMove = true;
							}
						}
						if(TypeOneResistant && !TypeOneImmune && !SuperEffectiveMove)
						{
							if(typeOfChoice < 3)
							{
								bestChoice = i;
								typeOfChoice = 3;
							}
						}
						if(!TypeOneResistant && TypeOneImmune && !SuperEffectiveMove)
						{
							if(typeOfChoice < 5)
							{
								bestChoice = i;
								typeOfChoice = 5;
							}
						}
						if(TypeOneResistant && !TypeOneImmune && SuperEffectiveMove)
						{
							if(typeOfChoice < 8)
							{
								bestChoice = i;
								typeOfChoice = 8;
							}
						}
						if(!TypeOneResistant && TypeOneImmune && SuperEffectiveMove)
						{
							if(typeOfChoice < 10)
							{
								bestChoice = i;
								typeOfChoice = 10;
							}
						}
					}
				}
			}
		}
		return bestChoice;
	}
	
	public void HealTeam()
	{
		for(int i = 0; i < team.size();i++)
			team.get(i).fullyHeal();
	}
	
	public void PrintTeam()
	{
		int i = 0;
		for(SeenPokemon x: team)
		{
			System.out.print(i + ". ");
			System.out.println(x);
			i++;
		}
	}
}
