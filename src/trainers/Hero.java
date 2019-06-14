package trainers;

import java.util.ArrayList;

import pokemon.*;

public class Hero extends Trainer
{

	private ArrayList<CaughtPokemon> team = new ArrayList<CaughtPokemon>();
	private int money;
	private int badges;
	
	public Hero(String s)
	{
		super(s);
	}	

	public int getMoney() 
	{
		return money;
	}

	public void setMoney(int money) 
	{
		this.money = money;
	}

	public int getBadges() 
	{
		return badges;
	}

	public void setBadges(int badges)
	{
		this.badges = badges;
	}
	
}