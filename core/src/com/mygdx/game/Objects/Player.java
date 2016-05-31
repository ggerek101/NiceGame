package com.mygdx.game.Objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.Graphics.Graphics;
import com.mygdx.game.Objects.Object;

/**
 * Created by mateusz on 2016-05-27.
 */
public class Player extends Object
{
    int velocity = 2;
    Vector2 velocityVector = new Vector2();

    @Override
    public void action()
    {
        move();
    }

    @Override
    public void setProperties()
    {
        try
        {
            sprite.setPosition(Graphics.centerOfCamera.x, Graphics.centerOfCamera.y);
        }
        catch (NullPointerException e)
        {
            Gdx.app.log("Błąd", "w ustawianiu właściwości");
        }
    }

    private void move()
    {
        velocityVector.set(0,0);

        if(Gdx.input.isKeyPressed(Input.Keys.A))
        {
            velocityVector.set(-velocity, body.getLinearVelocity().y);
        }
        if(Gdx.input.isKeyPressed(Input.Keys.D))
        {
            velocityVector.set(velocity, body.getLinearVelocity().y);
        }
        if(Gdx.input.isKeyPressed(Input.Keys.W))
        {
            velocityVector.set(body.getLinearVelocity().x, velocity);
        }
        if(Gdx.input.isKeyPressed(Input.Keys.S))
        {
            velocityVector.set(body.getLinearVelocity().x, -velocity);
        }

        body.setLinearVelocity(velocityVector);

    }
}
