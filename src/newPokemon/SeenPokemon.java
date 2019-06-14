package newPokemon;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

import moves.Move;

public class SeenPokemon extends Pokemon
{
	// Stats accrued in battle
	private Stats battleStats;
	private int lvl;
	private List<Move> moves;
	
	public SeenPokemon(SeenPokemon poke)
	{
		this(poke.getPokeSpecies(), poke.moves, poke.lvl);
	}
	
	public SeenPokemon(String pokeName, Move move1, Move move2, Move move3, 
			Move move4, int level)
	{
		this(pokeName, Arrays.asList(new Move[]{move1, move2, move3, move4}), level);
	}

	public SeenPokemon(String pokeName, Collection<Move> moves, int level)
	{
		this(pokeName, level);
		
		this.moves = new Vector<Move>(moves);
		
		// Only can be a max of four moves
		while (this.moves.size() > 4)
			this.moves.remove(this.moves.size()-1);
	}
	
	public SeenPokemon(String pokeName, int level)
	{
		super(pokeName);
		lvl = level;
		
		/// TODO: implement a IV + EV things
	}
	
	public int getHP()
	{
		return battleStats.hp;
	}
	
	public int getLevel()
	{
		return lvl;
	}
	
	public boolean isFainted()
	{
		return (battleStats.hp == 0); 
	}
	
	// Only caughtPokemon can use this function
	// Observer to check when the level changes?
	protected void incrementLevel()
	{
		if (lvl >= 100)
			return;
		
		lvl++;
	}
}
