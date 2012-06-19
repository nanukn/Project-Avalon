package mygame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Game extends StateBasedGame {
	
	public static final int mainMenu = 0;
	public static final int play = 1;
	public static final int credits = 2;
	
	public Game() {
		super("Project Avalon");
		this.addState(new MainMenu(mainMenu));
		this.addState(new Play(play));
		this.addState(new Credits(credits));
	}
	
	public void initStatesList(GameContainer gc) throws SlickException {
		this.getState(mainMenu).init(gc, this);
		this.getState(play).init(gc, this);
		this.getState(credits).init(gc, this);
		this.enterState(mainMenu);		
	}

	public static void main(String[] args) {
		AppGameContainer appgc;
		try {
			appgc = new AppGameContainer(new Game());
			appgc.setDisplayMode(800, 600, false);
			appgc.setVSync(true);
			appgc.start();
		} catch(SlickException e) {
			e.printStackTrace();
		}

	}

}
