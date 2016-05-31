package com.mygdx.game.Objects;

import com.badlogic.gdx.Gdx;

/**
 * Created by mateusz on 2016-05-27.
 */
public class GoodBlock extends Block
{
    @Override
    public void action() {
        Gdx.app.log("Jestem obiektem: ", "Dobry Obiekt");
    }
}
