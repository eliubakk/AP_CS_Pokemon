package pokemon;

import moves.*;
import red.PokemonGame;

public class Kabutops extends Poke
{
	public Kabutops()
	{
		super("Kabutops", 140, PokemonGame.Rock, PokemonGame.Water, 60, 115, 105, 65, 70, 80);
		moveSetter();
		//evolveSetter(141, 40);
		super.setEVYield(new int[]{0, 2, 0, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Scratch(), new Harden(), new Absorb(), new Slash(), new Leer(), new HydroPump()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 39, 46, 53}, {2, 3, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 17, 19, 20, 31, 32, 33, 34, 40, 44, 50, 101, 103}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
