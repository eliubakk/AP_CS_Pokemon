package pokemon;

import moves.*;
import red.PokemonGame;

public class Parasect extends Poke
{
	public Parasect()
	{
		super("Parasect", 47, PokemonGame.Bug, PokemonGame.Grass, 60, 95, 80, 60, 80, 30);
		moveSetter();
		//evolveSetter(47, 24);
		super.setEVYield(new int[]{0, 2, 1, 0, 0, 0});
	}

	private void moveSetter()
	{
		Move[] moves = {new Scratch(), new StunSpore(), new LeechLife(), new Spore(), new Slash(), new Growth()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 13, 20, 27, 34, 41}, {3, 6, 8, 9, 10, 15, 20, 21, 22, 28, 31, 32, 33, 34, 40, 44, 50, 101}};
		super.setMoveLevel(moveLevel);
	}
	
	
}