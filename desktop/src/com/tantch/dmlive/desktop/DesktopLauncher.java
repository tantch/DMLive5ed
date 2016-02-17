package com.tantch.dmlive.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.tantch.dmlive.DMLiveApp;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.resizable=false;
		config.height=700;
		config.width=1200;
		new LwjglApplication(new DMLiveApp(), config);
		
	}
}
