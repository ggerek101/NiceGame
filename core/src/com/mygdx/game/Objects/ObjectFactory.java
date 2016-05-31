package com.mygdx.game.Objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.mygdx.game.Box2d.Box2dWorld;

/**
 * Created by mateusz on 2016-05-27.
 */
public class ObjectFactory
{
    private Object object;
    public enum ObjectType{BadBlock, GoodBlock, Block}

    public ObjectFactory()
    {

    }

    public Object getObject(ObjectType objectType)
    {
        String pathToFile = null;
        BodyDef.BodyType bodyType = null;

        switch (objectType)
        {
            case GoodBlock:
                object = new GoodBlock();
                pathToFile = "badlogic.jpg";
                bodyType = BodyDef.BodyType.KinematicBody;
                break;
            case BadBlock:
                object = new BadBlock();
                pathToFile = "badlogic.jpg";
                bodyType = BodyDef.BodyType.KinematicBody;
                break;
            case Block:
                object = new Block();
                pathToFile = "badlogic.jpg";
                bodyType = BodyDef.BodyType.DynamicBody;
                break;
        }

        Texture texture = new Texture(Gdx.files.internal(pathToFile));
        Sprite sprite = new Sprite(texture);
        Body body = Box2dWorld.getBody(sprite,bodyType);

        object.setTexture(texture);
        object.setSprite(sprite);
        object.setBody(body);
        return object;
    }
}
