package pokemon;

import moves.*;
import red.PokemonGame;

public class Fearow extends Poke
{
	public Fearow()
	{
		super("Fearow", 22, PokemonGame.Normal, PokemonGame.Flying, 65, 90, 65, 61, 61, 100);
		moveSetter();
		//evolveSetter(22, 20);
		super.setEVYield(new int[]{0, 0, 0, 0, 0, 2});
	}

	private void moveSetter()
	{
		Move[] moves = {new Peck(), new Growl(), new Leer(), new FuryAttack(), new MirrorMove(), new DrillPeck(), new Agility()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 0, 15, 25, 34, 43}, {2, 4, 6, 9, 10, 15, 20, 31, 32, 34, 39, 43, 44, 50, 102}};
		super.setMoveLevel(moveLevel);
	}
	
	
}