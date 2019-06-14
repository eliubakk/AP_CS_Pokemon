package pokemon;

import moves.*;
import red.PokemonGame;

public class Pidgey extends Poke
{
	public Pidgey()
	{
		super("Pidgey", 16, PokemonGame.Normal, PokemonGame.Flying, 40, 45, 40, 35, 35, 56);
		moveSetter();
		evolveSetter(18, 17);
		super.setEVYield(new int[]{0, 0, 0, 0, 0, 1});
	}

	private void moveSetter()
	{
		Move[] moves = {new Gust(), new SandAttack(), new QuickAttack(), new Whirlwind(), new WingAttack(), new Agility(), new MirrorMove()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 5, 12, 19, 28, 36, 44}, {2, 4, 6, 9, 10, 20, 31, 32, 33, 34, 39, 43, 44, 50, 102}};
		super.setMoveLevel(moveLevel);
	}
	
	
}