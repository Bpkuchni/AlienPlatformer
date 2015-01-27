package com.mygdx.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.camera.OrthoCamera;
import com.mygdx.game.entity.Player;

public class MenuScreen extends Screen{

	private OrthoCamera camera;
	private Player player;
	
	@Override
	public void create() {
		camera = new OrthoCamera();
		player = new Player(new Vector2(200, 15), new Vector2(0, 0));
	}

	@Override
	public void render(SpriteBatch ab) {
		ab.setProjectionMatrix(camera.combined);
		ab.begin();
		player.render(ab);
		ab.end();
		
	}

	@Override
	public void resize(int width, int height) {
		camera.resize();
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		camera.update();
		player.update();
	}

}
