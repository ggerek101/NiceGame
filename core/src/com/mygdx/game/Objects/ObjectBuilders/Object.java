package com.mygdx.game.Objects.ObjectBuilders;

import com.badlogic.gdx.Gdx;
import com.mygdx.game.Objects.Contents.GraphicsContent;
import com.mygdx.game.Objects.Contents.PhysicsContent;

/**
 * Created by mateusz on 2016-05-11.
 */
public class Object
{
    private GraphicsContent graphicsContent;
    private PhysicsContent physicsContent;

    public void setGraphicsContent(GraphicsContent graphicsContent)
    {
        this.graphicsContent = graphicsContent;
    }

    public void setPhysicsContent(PhysicsContent physicsContent)
    {
        this.physicsContent = physicsContent;
    }

    public void show()
    {
        Gdx.app.log(graphicsContent.nazwa,"");
        Gdx.app.log(physicsContent.nazwa,"");
    }
}
