package com.mygdx.game.Box2d;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;

/**
 * Created by mateusz on 2016-05-27.
 */
public class Box2dWorld
{
    World world;

    public Box2dWorld()
    {
        world = new World(new Vector2(0, 0), true);
    }

    public Body getBody(Sprite sprite, BodyDef.BodyType bodyType)
    {
        BodyDef bodyDef = new BodyDef();
        bodyDef.type = bodyType;

        float halfOfHeight = sprite.getHeight() / 2;
        float halfOfWidth = sprite.getWidth() / 2;
        bodyDef.position.set(new Vector2(sprite.getX() + halfOfWidth, sprite.getY() + halfOfHeight));

        PolygonShape shape = new PolygonShape();
        shape.setAsBox((sprite.getWidth()) / 2, (sprite.getHeight()) / 2);

        FixtureDef fixtureDef = new FixtureDef();
        fixtureDef.shape = shape;

        Body body = world.createBody(bodyDef);
        body.createFixture(fixtureDef);

        shape.dispose();
        return body;
    }

    public static float toBox(float value)
    {
        return value * 0.01f;
    }

    public static float toReal(float value)
    {
        return value * 100f;
    }



    public void update()
    {
        world.step(1/60f,8,3);
    }


}
