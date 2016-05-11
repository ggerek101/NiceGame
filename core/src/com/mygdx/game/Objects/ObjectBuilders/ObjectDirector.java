package com.mygdx.game.Objects.ObjectBuilders;

import java.lang.*;

/**
 * Created by mateusz on 2016-05-11.
 */
public class ObjectDirector
{
    private ObjectBuilder objectBuilder;

    public void setBuilder(ObjectBuilder objectBuilder)
    {
        this.objectBuilder = objectBuilder;
    }

    public Object getObject()
    {
        return objectBuilder.getObject();
    }

    public void makeObject()
    {
        objectBuilder.newObject();
        objectBuilder.buildGraphicsContent();
        objectBuilder.buildPhysicsContent();
    }
}
