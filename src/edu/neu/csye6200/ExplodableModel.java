package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class ExplodableModel extends AbstractExplodableModel{
private List<ExplodableAPI> explosions = new ArrayList<ExplodableAPI>();
	
	@Override
	public void load() {
		add(new HeliumBomb());
		add(new B61Bomb());
		add(new AerialBomb());
	}

	@Override
	public void add(ExplodableAPI e) {
		this.explosions.add(e);
	}

	@Override
	public void explodeAll() {
		System.out.println(explosions.size() + " explosions in ExplodableModel.");
		for (ExplodableAPI explosion : explosions) {
			explosion.explode();
		}
	}
	
	public static void demo() {
		System.out.println("\n\t" + ExplodableModel.class.getName() + ".demo()...");
		
		ExplodableModel obj = new ExplodableModel();

		/**
		 * add ExplodableModel objects into the ExplodableAPI
		 */
		obj.add(new HeliumBomb());
		obj.add(new B61Bomb());
		obj.add(new AerialBomb());
		/**
		 * Allow each ExplodableModel to explode
		 */
		obj.explodeAll();
		
		System.out.println("\n\t" + ExplodableModel.class.getName() + ".demo()...done!");
	}

}
