package com.mygdx.game.entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.TextureManager;

public class Player extends Entity{

	public Player(Vector2 pos, Vector2 direction) {
		super(TextureManager.player, pos, direction);
		
	}

	@Override
	public void update() {
		pos.add(direction);
		boolean up = Gdx.input.isKeyPressed(Keys.UP) || Gdx.input.isKeyPressed(Keys.W);
		boolean down = Gdx.input.isKeyPressed(Keys.DOWN) || Gdx.input.isKeyPressed(Keys.S);
		boolean left = Gdx.input.isKeyPressed(Keys.LEFT) || Gdx.input.isKeyPressed(Keys.A);
		boolean right = Gdx.input.isKeyPressed(Keys.RIGHT) || Gdx.input.isKeyPressed(Keys.D);
		
		if (up && left){
			setDirection(-150, 150);
		}
		else if(up && right){
			setDirection(150, 150);
		}
		else if(down && left){
			setDirection(-150, -150);
		}
		else if(down && right){
			setDirection(150, -150);
		}
		else if(up){
			setDirection(0,300);
		}
		else if(down){
			setDirection(0,-300);
		}
		else if(left){
			setDirection(-300,0);
		}
		else if(right){
			setDirection(300, 0);
		}
		else setDirection(0,0);
	}

}
