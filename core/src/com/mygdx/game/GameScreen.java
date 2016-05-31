package com.mygdx.game;

import com.badlogic.gdx.Screen;
import com.mygdx.game.Box2d.Box2dWorld;
import com.mygdx.game.Graphics.Graphics;
import com.mygdx.game.Objects.Object;
import com.mygdx.game.Objects.ObjectFactory;

import java.util.Vector;

/**
 * Created by mateusz on 2016-05-27.
 */
public class GameScreen implements Screen
{
    final NiceGame niceGame;

    Graphics graphics;
    Box2dWorld box2dWorld;
    ObjectFactory objectFactory;
    Vector<Object>objects;

    public GameScreen (NiceGame niceGame)
    {
        this.niceGame = niceGame;
    }

    @Override
    public void show()
    {
        graphics = new Graphics();
        box2dWorld = new Box2dWorld();
        objectFactory = new ObjectFactory(box2dWorld);
        objects = new Vector<Object>();
    }

    @Override
    public void render(float delta)
    {
        for(int i = 0; i != objects.size(); i++)
        {
            objects.get(i).action();
            objects.get(i).draw(graphics.getSpriteBatch());
        }
        box2dWorld.update();
        graphics.update();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
