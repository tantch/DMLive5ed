package com.tantch.dmlive;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;

public class DMLiveApp extends Game {

	
	private AdvScreen adventureScreen;
	
	@Override
	public void create () {
		adventureScreen =  new AdvScreen();
		System.out.println("Setting screen straight to default adventure");
		setScreen(adventureScreen);
		
	
	}

	@Override
	public void render () {
		super.render();
	}
}
