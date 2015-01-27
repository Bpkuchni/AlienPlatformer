package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.screen.MenuScreen;
import com.mygdx.game.screen.ScreenManager;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	
	public static int width = 800, height = 480;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		ScreenManager.setScreen(new MenuScreen());
	}
	
	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		if(ScreenManager.getScreen() != null)
			ScreenManager.getScreen().update();
		
		if(ScreenManager.getScreen() != null)
			ScreenManager.getScreen().render(batch);
	}
	
	@Override
	public void dispose(){
		if(ScreenManager.getScreen() != null)ScreenManager.getScreen().dispose();
		batch.dispose();
	}
	
	@Override
	public void resize(int width, int height){
		if(ScreenManager.getScreen() != null)ScreenManager.getScreen().resize(width, height);
		
	}
	
	@Override
	public void pause(){
		if(ScreenManager.getScreen() != null)ScreenManager.getScreen().pause();
	}
	
	
	@Override
	public void resume(){
		if(ScreenManager.getScreen() != null)ScreenManager.getScreen().resume();
	}
}
