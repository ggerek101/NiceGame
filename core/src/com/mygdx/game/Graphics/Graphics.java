package com.mygdx.game.Graphics;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.Box2d.Box2dWorld;

import javafx.scene.layout.Background;

/**
 * Created by mateusz on 2016-05-31.
 */
public class Graphics
{
    public static Vector2 centerOfCamera = new Vector2();
    SpriteBatch spriteBatch;
    OrthographicCamera camera;

    public Graphics()
    {
        spriteBatch = new SpriteBatch();
        camera = new OrthographicCamera(1200, 1920f);
        camera.setToOrtho(false, 12f, 19.2f);
        spriteBatch.setProjectionMatrix(camera.combined);

        centerOfCamera.set(Box2dWorld.toReal(camera.viewportWidth / 2), Box2dWorld.toReal(camera.viewportHeight / 2));
    }

  /*  public static void setCameraToHero(float y)
    {
        camera.position.set(camera.viewportWidth / 2, y + camera.viewportHeight * 100 / 275, 0);
        spriteBatch.setProjectionMatrix(camera.combined);
    }
    */

    public void update() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);
        camera.update();
    }

    public SpriteBatch getSpriteBatch() {
        return spriteBatch;
    }


}
