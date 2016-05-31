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
    Box2dWorld box2dWorld;
    private Object object;
    public enum ObjectType{PLAYER, BOMB , BLOCK}

    public ObjectFactory(Box2dWorld box2dWorld)
    {
        this.box2dWorld = box2dWorld;
    }

    public Object getObject(ObjectType objectType)
    {
        String pathToFile = null;
        BodyDef.BodyType bodyType = null;

        switch (objectType)
        {
            case PLAYER:
                object = new Player();
                pathToFile = "badlogic.jpg";
                bodyType = BodyDef.BodyType.DynamicBody;
                break;
            case BOMB:
                object = new Bomb();
                pathToFile = "badlogic.jpg";
                bodyType = BodyDef.BodyType.StaticBody;
                break;
            case BLOCK:
                object = new Block();
                pathToFile = "badlogic.jpg";
                bodyType = BodyDef.BodyType.StaticBody;
                break;
        }

        Texture texture = new Texture(Gdx.files.internal(pathToFile));
        Sprite sprite = new Sprite(texture);
        Body body = box2dWorld.getBody(sprite,bodyType);

        object.setTexture(texture);
        object.setSprite(sprite);
        object.setBody(body);
        object.setProperties();
        object.makeToBox();

        return object;
    }
}
