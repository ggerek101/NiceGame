package com.mygdx.game.Objects.ObjectBuilders;

import com.mygdx.game.Objects.ObjectBuilders.Object;

/**
 * Created by mateusz on 2016-05-11.
 */
public abstract class ObjectBuilder
{
    protected Object object;

    public void newObject()
    {
        object = new Object();
    }

    public Object getObject()
    {
        return object;
    }

    public abstract void buildGraphicsContent();
    public abstract void buildPhysicsContent();

}
