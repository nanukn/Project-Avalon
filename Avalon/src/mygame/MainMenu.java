package mygame;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class MainMenu extends BasicGameState {
	
	Image playButton, exitButton, creditsButton;
	
	public MainMenu(int state) {
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		playButton = new Image("res/playbutton.png");
		exitButton = new Image("res/exitbutton.png");
		creditsButton = new Image("res/creditsbutton.png");
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		g.drawString("Project Avalon", 335, 100);
		g.drawImage(playButton, 350, 200);
		g.drawImage(exitButton, 350, 250);
		g.drawImage(creditsButton, 350, 300);
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		int mouseX = Mouse.getX();
		int mouseY = Mouse.getY();
		
		if((mouseX > 350 && mouseX < 450) && (mouseY > 350 && mouseY < 400)) {
			if(Mouse.isButtonDown(0)) {
				sbg.enterState(1);
			}
		}
		if((mouseX > 350 && mouseX < 450) && (mouseY > 250 && mouseY < 300)) {
			if(Mouse.isButtonDown(0)) {
				sbg.enterState(2);
			}
		}
		if((mouseX > 350 && mouseX < 450) && (mouseY > 300 && mouseY < 350)) {
			if(Mouse.isButtonDown(0)) {
				System.exit(0);
			}
		}
	}
	
	public int getID() {
		return 0;
	}

}
