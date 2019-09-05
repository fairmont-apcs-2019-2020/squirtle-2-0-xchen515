public class SquirtleBoard extends Board {

	
	public SquirtleBoard() 
	{
		// Call the Board constructor to make an 8x4 Board
	 	super(8, 4);
	 	newGame(false);
	 	setTitle("PokemonCode Assignment 1");
	 	setInitialText("What will Squirtle do with Bulbasaur's flowers?");
	}
	

	
	@Override
	public void newGame(boolean repaint)
	{
		super.newGame(repaint);
		
		// Create a SquirtleThing at 0, 0
	 	SquirtleThing squirtle = new SquirtleThing();
	 	squirtle.setLocation(0, 0);
	 	add(squirtle);
	 	
	 	SquirtleThing squirtle2 = new SquirtleThing();
	  	squirtle2.setLocation(3, 1);
	  	add(squirtle2);
	 	
	 	// Create a BulbasaurThing at 0, 4
	 	BulbasaurThing bulbasaur = new BulbasaurThing();
	 	bulbasaur.setLocation(4, 0);
	 	add(bulbasaur);
	 	
	 	BulbasaurThing bulbasaur2 = new BulbasaurThing();
	 	bulbasaur2.setLocation(5, 2);
	 	add(bulbasaur2);
	}
} 
