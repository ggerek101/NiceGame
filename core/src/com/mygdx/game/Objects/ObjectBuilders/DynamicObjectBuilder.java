package com.mygdx.game.Objects.ObjectBuilders;

import com.mygdx.game.Objects.Contents.GraphicsContent;
import com.mygdx.game.Objects.Contents.PhysicsContent;

/**
 * Created by mateusz on 2016-05-11.
 */
public class DynamicObjectBuilder extends ObjectBuilder
{
    @Override
    public void buildGraphicsContent()
    {
        object.setGraphicsContent(new GraphicsContent("dynamicznyGraficzny"));
    }

    @Override
    public void buildPhysicsContent()
    {
        object.setPhysicsContent(new PhysicsContent("dynamicznyFizyczny"));
    }
}
