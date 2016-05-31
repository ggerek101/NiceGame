package com.mygdx.game.Objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.mygdx.game.Box2d.Box2dWorld;

/**
 * Created by mateusz on 2016-05-27.
 */
public abstract class Object
{
    Body body;
    Sprite sprite;
    Texture texture;

    public Object()
    {
    }

    public void setBody(Body b)
    {
        this.body = b;
    }
    public void setTexture(Texture t)
    {
        this.texture = t;
    }
    public void setSprite(Sprite s)
    {
        this.sprite = s;
    }

    public void makeToBox()
    {
        float x = Box2dWorld.toBox(sprite.getX());
        float y = Box2dWorld.toBox(sprite.getY());
        float width = Box2dWorld.toBox(sprite.getWidth());
        float height = Box2dWorld.toBox(sprite.getHeight());

        sprite.setPosition(x, y);
        sprite.setSize(width, height);
        sprite.flip(false, false);

        body.setTransform(sprite.getX(), sprite.getY(), 0);
    }

    private Vector2 getSpritePositionConvertedToBox()
    {
        float halfOfWidth = sprite.getWidth() / 2;
        float halfOfHeight = sprite.getHeight() / 2;
        return new Vector2(body.getPosition().x - halfOfWidth, body.getPosition().y - halfOfHeight);
    }

    public void draw(SpriteBatch spriteBatch)
    {
        Vector2 positionConvertedToBox = getSpritePositionConvertedToBox();

        spriteBatch.begin();
        sprite.setPosition(positionConvertedToBox.x, positionConvertedToBox.y);
        sprite.draw(spriteBatch);
        spriteBatch.end();
    }

    public abstract void action();
    public abstract void setProperties();

}
