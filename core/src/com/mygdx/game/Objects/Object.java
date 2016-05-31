package com.mygdx.game.Objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.scenes.scene2d.Actor;

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

    public abstract void action();

}
