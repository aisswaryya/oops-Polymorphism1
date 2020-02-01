package edu.neu.csye6200;

public abstract class AbstractExplodableModel {
	/**
	 * load a sample batch of explosives into model
	 */
	public abstract void load();
	/**
	 * add one explosive to the model
	 * @param e
	 */
	public abstract void add(ExplodableAPI e);
	/**
	 * explode all explosives loaded into the model
	 */
	public abstract void explodeAll();
}
