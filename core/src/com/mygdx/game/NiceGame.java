package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Objects.ObjectBuilders.DynamicObjectBuilder;
import com.mygdx.game.Objects.ObjectBuilders.Object;
import com.mygdx.game.Objects.ObjectBuilders.ObjectBuilder;
import com.mygdx.game.Objects.ObjectBuilders.ObjectDirector;
import com.mygdx.game.Objects.ObjectBuilders.StaticObjectBuilder;

public class NiceGame extends ApplicationAdapter {

	ObjectDirector objectDirector;
	ObjectBuilder dynamicObjectBuilder;
	ObjectBuilder staticObjectBuilder;
	Object dynamicObject;
	Object staticObject;

	@Override
	public void create ()
	{
		objectDirector = new ObjectDirector();
		dynamicObjectBuilder = new DynamicObjectBuilder();
		staticObjectBuilder = new StaticObjectBuilder();

		objectDirector.setBuilder(dynamicObjectBuilder);
		objectDirector.makeObject();
		dynamicObject = objectDirector.getObject();

		objectDirector.setBuilder(staticObjectBuilder);
		objectDirector.makeObject();
		staticObject = objectDirector.getObject();
	}

	@Override
	public void render ()
	{
		dynamicObject.show();
		staticObject.show();
	}
}
