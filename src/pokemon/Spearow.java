package pokemon;

import moves.*;
import red.PokemonGame;

public class Spearow extends Poke
{
	public Spearow()
	{
		super("Spearow", 21, PokemonGame.Normal, PokemonGame.Flying, 40, 60, 30, 31, 31, 70);
		moveSetter();
		evolveSetter(22, 20);
		super.setEVYield(new int[]{0, 0, 0, 0, 0, 1});
	}

	private void moveSetter()
	{
		Move[] moves = {new Peck(), new Growl(), new Leer(), new FuryAttack(), new MirrorMove(), new DrillPeck(), new Agility()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 9, 15, 22, 29, 36}, {2, 4, 6, 9, 10, 20, 31, 32, 34, 39, 43, 44, 50, 102}};
		super.setMoveLevel(moveLevel);
	}
	
	
}