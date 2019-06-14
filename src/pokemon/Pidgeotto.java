package pokemon;
import moves.*;
import red.PokemonGame;

public class Pidgeotto extends Poke
{
	public Pidgeotto()
	{
		super("Pidgeotto", 17, PokemonGame.Normal, PokemonGame.Flying, 63, 60, 55, 50, 50, 76);
		moveSetter();
		evolveSetter(36, 18);
		super.setEVYield(new int[]{0, 0, 0, 0, 0, 2});
	}

	private void moveSetter()
	{
		Move[] moves = {new Gust(), new SandAttack(), new QuickAttack(), new Whirlwind(), new WingAttack(), new Agility(), new MirrorMove()};
		super.setLearnableMoves(moves);
		int[][] moveLevel = new int[][]{{0, 0, 12, 21, 31, 40, 49}, {2, 4, 6, 9, 10, 20, 31, 32, 33, 34, 39, 43, 44, 50, 102}};
		super.setMoveLevel(moveLevel);
	}
	
	
}