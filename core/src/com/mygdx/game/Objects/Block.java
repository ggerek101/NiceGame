package com.mygdx.game.Objects;

import com.badlogic.gdx.Gdx;

/**
 * Created by mateusz on 2016-05-27.
 */
public class Block extends Object
{
    @Override
    public void action() {
        Gdx.app.log("Jestem obiektem: ", "Block");
    }

    @Override
    public void setProperties() {

    }
}
