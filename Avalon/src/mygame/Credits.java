package mygame;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Credits extends BasicGameState {
	
	public Credits(int state) {
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) {
		
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) {
		g.drawString("This is credits", 100, 100);
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) {
		
	}
	
	public int getID() {
		return 2;
	}

}
