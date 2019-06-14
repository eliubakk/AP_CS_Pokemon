package pokemon;

import moves.*;
import red.PokemonGame;

public class Kabuto extends Poke
{
	public Kabuto()
	{
		super("Kabuto", 140, PokemonGame.Rock, PokemonGame.Water, 30, 80, 90, 55, 45, 55);
		moveSetter();
		evolveSetter(141, 40);
		super.setEVYield(new int[]{0, 0, 1, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Scratch(), new Harden(), new Absorb(), new Slash(), new Leer(), new HydroPump()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 34, 39, 46, 53}, {6, 8, 9, 10, 11, 12, 13, 14, 20, 30, 31, 32, 33, 34, 44, 50, 103}};
		super.setMoveLevel(moveLevel);
	}
	
	
}
