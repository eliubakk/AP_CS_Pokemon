package pokemon;

import moves.*;
import red.PokemonGame;

public class Starmie extends Poke
{
	public Starmie()
	{
		super("Starmie", 121, PokemonGame.Water, PokemonGame.Psychic, 60, 75, 85, 100, 85, 115);
		moveSetter();
	//	evolveSetter(121, 105);
		super.setEVYield(new int[]{0, 0, 0, 0, 0, 2});
	}

	private void moveSetter()
	{
		Move[] moves = {new Tackle(), new WaterGun(), new Harden()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0}, {6, 9, 10, 11, 12, 13, 14, 15, 20, 24, 25, 29, 30, 31, 32, 33, 34, 39, 40, 44, 45, 46, 49, 50, 103, 105}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
