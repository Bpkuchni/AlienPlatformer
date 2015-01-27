package com.mygdx.game.entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public abstract class Entity {
	
	protected Texture texture;
	protected Vector2 pos;
	protected Vector2 direction;

	public Entity(Texture texture, Vector2 pos, Vector2 direction){
		this.texture = texture;
		this.pos = pos;
		this.direction = direction;
	}

	public void render(SpriteBatch ab){
		ab.draw(texture, pos.x, pos.y);
	}
	
	public Vector2 getPosition(){
		return pos;
	}
	
	public void setDirection(float x, float y){
		direction.set(x, y);
		direction.scl(Gdx.graphics.getDeltaTime());
	}
	
	public abstract void update();
	

}
