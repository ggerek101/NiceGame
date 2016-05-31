package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;

public class NiceGame extends Game
{
	@Override
	public void create ()
	{
        setScreen(new GameScreen(this));
	}

	@Override
	public void render ()
	{
        super.render();
	}
}
