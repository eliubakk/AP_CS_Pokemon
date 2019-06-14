package red;

import java.util.Scanner;

import moves.Move;
import pokemon.CaughtPokemon;
import pokemon.SeenPokemon;
import trainers.Hero;
import trainers.Trainer;
import red.PokemonGame;

public class Battle {
	
	private Hero you;
	private Trainer t;
	private Scanner sc = new Scanner(System.in);
	private SeenPokemon trainerPoke;
	private CaughtPokemon ownPoke;
	int doWhat = -1;
	int trainerDoWhat = -1;
	int numInTeamAlive;
	boolean cancel = false;
	boolean first = false;
	boolean heroPokemonIsAlive;
	boolean Switched = false;
	
	public static int HeroMove = 5;
	public static int LastHeroMoveUsed = 5;
	public static int HeroPokemon = 0;
	public static int NewHeroPokemon = 0;
	public static int TrainerMove = 5;
	public static int LastTrainerMoveUsed = 5;
	public static int TrainerPokemon = 0;
	public static int NewTrainerPokemon = 0;
	
	
	public Battle(Hero h, Trainer fighter)
	{
		you = h;
		t = fighter;
		trainerPoke = t.getTeam().get(0);
		ownPoke = (CaughtPokemon) h.getTeam().get(0);
		numInTeamAlive = h.getTeam().size();
		heroPokemonIsAlive = ownPoke.isAlive();
	}
	
	public Battle()
	{
		
	}
	
	public void beginBattle()
	{
		
		do{
			do{
				PickAction();
				ExecuteAction();
			}while(cancel);
			TrainerAction();
			ExecuteTurn();
		    FinishTurn();
		    BlackedOut();
			
		}while(!t.isBlackedOut() && !you.isBlackedOut());
		EndBattle();
	}
	
	private int PickAction()
	{
		do{
			if(LastHeroMoveUsed != 5? ownPoke.getMove(LastHeroMoveUsed).getCurrentTurnCompletion() < 1: true)
			{
				if(LastHeroMoveUsed != 5)
					ownPoke.getMove(LastHeroMoveUsed).setCurrentTurnCompletion(ownPoke.getMove(LastHeroMoveUsed).getMaxTurnCompletion());
				System.out.println("What do you want to do? (0-Attack,1-Switch,2-Bag,3-Run)");
				System.out.println(ownPoke);
				System.out.println(trainerPoke);
				
				numInTeamAlive = you.numberOfPokemonAlive();
				doWhat = sc.nextInt();
				if(numInTeamAlive <= 1 && doWhat == 1)
				{
					System.out.println("You have no other pokemon are viable to battle!");
					doWhat = -1;
				}
			}
			else
			{
				HeroMove = LastHeroMoveUsed;
				doWhat = 5;
				cancel = false;
			}
		}while(doWhat == -1);
		
		return doWhat;
	}
	
	private void ExecuteAction()
	{
		switch(doWhat)
		{
		case 0: pickMove();
				break;
				
		case 1: pickSwitch(true);
				break;
		case 5: doWhat = 0;
			 	break;
		}
	}
	
	private int pickMove()
	{
		System.out.println("Use which move? (0-" + (ownPoke.getMoves().size() - 1) + ", or " + ownPoke.getMoves().size() + " to cancel)");
		ownPoke.PrintMoves();
		HeroMove = sc.nextInt();
		if(HeroMove == ownPoke.getMoves().size())
		{
			cancel = true;
		    LastHeroMoveUsed = 5;
		}
		else
			cancel = false;
		return HeroMove;
	}
	
	private int pickSwitch(boolean beginning)
	{
		you.setPokemon(HeroPokemon, ownPoke);
		int i = HeroPokemon;
		int back = 0;

		do{
			System.out.println("Send in what pokemon? (0-" + (you.numberOfPokemonAlive() - 1) + ", or " + (you.numberOfPokemonAlive()) + " to cancel)");
			you.PrintTeam();
			back = sc.nextInt();
			
			if(back == you.numberOfPokemonAlive())
				cancel = true;
			else
			{
				ownPoke.setLastDamageTaken(0);
				you.setPokemon(HeroPokemon, ownPoke);
				NewHeroPokemon = back;
				cancel = false;
				Switched = true;
			}	
			
			if(beginning)
			{	
				if(NewHeroPokemon == i && !cancel)
					System.out.println(ownPoke.getPoke().name + " is already in Battle!");
				
				try{
					heroPokemonIsAlive = you.getTeam().get(NewHeroPokemon).isAlive();
					if(!heroPokemonIsAlive)
						System.out.println(you.getTeam().get(NewHeroPokemon).getPoke().name + " is not viable for battle!");
				}
				catch(IndexOutOfBoundsException e){
					heroPokemonIsAlive = false;
					if(!cancel)
						System.out.println("Dumbass, that isn't a number I said you can choose!");
				}
			}
			else
			{
				if(cancel || NewHeroPokemon == i)
				{
					System.out.println("Your pokemon is dead dumbass, switch them out!");
					cancel = false;
					NewHeroPokemon = i;
				}
			}
		}while((NewHeroPokemon == i || !heroPokemonIsAlive) && !cancel);
		return NewHeroPokemon;
	}
	
	private void switchPokemon()
	{
		System.out.println("Come back " + ownPoke.getPoke().name + "!");
		System.out.println("Go " + you.getTeam().get(NewHeroPokemon).getPoke().name + "!");
		ownPoke = (CaughtPokemon) you.getTeam().get(NewHeroPokemon);
		HeroPokemon = NewHeroPokemon; 
		HeroMove = 5;
		LastHeroMoveUsed = 5;
	}
	
	private void ExecuteTurn()
	{
		switch(doWhat)
		{
		case 0:
			TurnOrder();
			if(first)
			{
				UseHeroMove();
				UseTrainerMove();
				Flinched(1);
				TrainerPokeFaint();
				HeroPokeFaint();
			}
			else
			{
			
				UseTrainerMove();
				UseHeroMove();
				Flinched(0);
				HeroPokeFaint();
				TrainerPokeFaint();
			}
			break;
		case 1:
			switchPokemon();
		case 2:
		case 3:
			UseTrainerMove();
			HeroPokeFaint();
			TrainerPokeFaint();
		}
	}
	
	private void FinishTurn()
	{
		HeroPokeFaint();
		TrainerPokeFaint();
		ownPoke.enactCondition(false);
		trainerPoke.enactCondition(false);
		if(ownPoke.isTrapped())
		{
			ownPoke.enactTrapped();
		}
		if(trainerPoke.isTrapped())
		{
			trainerPoke.enactTrapped();
		}
		trainerPoke.setFlinched(false);
		ownPoke.setFlinched(false);
		setVariables();
	}
	
	private void setVariables()
	{
		LastHeroMoveUsed = HeroMove;
		ownPoke.setLastMoveUsed(LastHeroMoveUsed);
		LastTrainerMoveUsed = TrainerMove;
		trainerPoke.setLastMoveUsed(LastTrainerMoveUsed);
		HeroMove = 5;
		TrainerMove = 5;
		t.setPokemon(TrainerPokemon, trainerPoke);
		TrainerPokemon = t.OrganizeTeam(TrainerPokemon);
		you.setPokemon(HeroPokemon, ownPoke);
		HeroPokemon = you.OrganizeTeam(HeroPokemon);
	}
	
	private void TrainerAction()
	{
		if(LastTrainerMoveUsed == 5? true: trainerPoke.getMove(LastTrainerMoveUsed).getCurrentTurnCompletion() < 1)
		{
			trainerDoWhat = t.BattleAI(TrainerPokemon, ownPoke);
			switch(trainerDoWhat)
			{
			case 0:
				TrainerMove = t.chooseMove(TrainerPokemon, ownPoke);
				break;
			case 1:
				trainerPoke.setLastDamageTaken(0);
				t.setPokemon(TrainerPokemon, trainerPoke);
				System.out.println(t.getName() + " called back " + trainerPoke.getPoke().name + "!");
				do{
					TrainerPokemon = t.chooseSwitch(TrainerPokemon, ownPoke);
					trainerPoke = t.getTeam().get(TrainerPokemon);
				}while(!trainerPoke.isAlive());
				System.out.println(t.getName() + " sent out " + trainerPoke.getPoke().name + "!");
				TrainerMove = 5;
				break;
			}
		}
		else
		{
			TrainerMove = LastTrainerMoveUsed;
		}
	}
	
	private void TurnOrder()
	{
		if(HeroMove != 5)
		{
			if(TrainerMove != 5)
			{
				if(ownPoke.getMove(HeroMove).getPriority() > trainerPoke.getMove(TrainerMove).getPriority())
				{
					first = true;
				}
				else if(ownPoke.getMove(HeroMove).getPriority() == trainerPoke.getMove(TrainerMove).getPriority())
				{
					if(ownPoke.getSpeed() * ownPoke.getSpeedMultiplier() > trainerPoke.getSpeed() * trainerPoke.getSpeedMultiplier())
						first = true;
					else if(ownPoke.getSpeed() * ownPoke.getSpeedMultiplier() < trainerPoke.getSpeed() * trainerPoke.getSpeedMultiplier())
						first = false;
					else
					{
						if(Move.genrand(0, 1) == 0)
							first = true;
					}
				}
				else
				{
					first = false;
				}
			}
			else
			{
				first = true;
			}
		}
		else
		{
			first = false;
		}
	}
	
	private void UseHeroMove()
	{
		if(ownPoke.enactCondition(true) && ownPoke.isAlive() && HeroMove != 5  && !ownPoke.getFlinched())
		{
			System.out.println(you.name + "'s " + ownPoke.getPoke().name + " used " + ownPoke.getMove(HeroMove).ID + "!");
			//Owned.getMove(HeroMove).Attack(Owned, trainer);
			ownPoke.Attack(trainerPoke, HeroMove);
		}
		
	}
	
	private void UseTrainerMove()
	{
		if(trainerPoke.enactCondition(true) && TrainerMove != 5 && trainerPoke.isAlive() && !trainerPoke.getFlinched())
		{
			System.out.println(t.name + "'s " + trainerPoke.getPoke().name + " used " + trainerPoke.getMove(TrainerMove).ID + "!");
			//trainer.getMove(TrainerMove).Attack(trainer, Owned);
			trainerPoke.Attack(ownPoke, TrainerMove);
		}
	}
	
	private void Flinched(int i)
	{
		SeenPokemon flinchedPoke = new SeenPokemon();
		Trainer flinchedTrainer = new Trainer();
		switch(i)
		{
		case 0: flinchedPoke = ownPoke;
		        flinchedTrainer = you;
				break;
		case 1: flinchedPoke = trainerPoke;
		        flinchedTrainer = t;
		}
		
		if(flinchedPoke.getFlinched())
		{
			System.out.println(flinchedTrainer.name + "'s " + flinchedPoke.getPoke().name + " flinched!");
		}
	}
	
	private void HeroPokeFaint()
	{
		if(!ownPoke.isAlive())
		{
			if(!you.isBlackedOut())
				System.out.println(you.name + "'s " + ownPoke.getPoke().name + " fainted!");
			you.setPokemon(HeroPokemon, ownPoke);
			HeroPokemon = you.OrganizeTeam(HeroPokemon);
			if(!you.isBlackedOut())
			{
				pickSwitch(false);
				System.out.println("Go " + you.getTeam().get(NewHeroPokemon).getPoke().name + "!");
				ownPoke = (CaughtPokemon) you.getTeam().get(NewHeroPokemon);
				HeroPokemon = NewHeroPokemon;
				HeroMove = 5;
			}
		}
	}
	
	private void TrainerPokeFaint()
	{
		if(!trainerPoke.isAlive())
		{   
			if(!t.isBlackedOut())
				System.out.println(t.name + "'s " + trainerPoke.getPoke().name + " fainted!");
			t.setPokemon(TrainerPokemon, trainerPoke);
			TrainerPokemon = t.OrganizeTeam(TrainerPokemon);
			if(!t.isBlackedOut())
			{
				do{
				TrainerPokemon = t.chooseSwitch(TrainerPokemon, ownPoke);
				trainerPoke = t.getTeam().get(TrainerPokemon);
				TrainerMove = 5;
				}while(!trainerPoke.isAlive());
				System.out.println(t.getName() + " sent out " + trainerPoke.getPoke().name + "!");
			}
		}
	}
	
	private void BlackedOut()
	{
		if(t.isBlackedOut())
		{
			System.out.println(you.name + " won!");
		}
		if(you.isBlackedOut())
		{
			PokemonGame.blackedOut = true;
			System.out.println(you.name + " blacked out and rushed to a pokemon center!");
		}
	}
	
	private void EndBattle()
	{
		
		HeroMove = 5;
		TrainerMove = 5;
		LastHeroMoveUsed = HeroMove;
		ownPoke.setLastMoveUsed(LastHeroMoveUsed);
		LastTrainerMoveUsed = TrainerMove;
		trainerPoke.setLastMoveUsed(LastTrainerMoveUsed);
	}
}
