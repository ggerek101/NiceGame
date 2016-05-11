package com.mygdx.game.Objects.Contents;

import com.badlogic.gdx.physics.box2d.Body;

/**
 * Created by mateusz on 2016-05-11.
 */
public class PhysicsContent
{
    private Body body;
    public String nazwa;

    public PhysicsContent(String nazwa)
    {
        this.nazwa = nazwa;
    }
}
