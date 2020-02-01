package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class ExplosionModel extends AbstractExplosionModel{
	
private List<Explosion> explosions = new ArrayList<Explosion>();
	
	@Override
	public void load() {
		add(new AtomBomb());
		add(new Grenade());
		add(new HydrogenBomb());
	}

	@Override
	public void add(Explosion e) {
		this.explosions.add(e);
	}

	@Override
	public void explodeAll() {
		System.out.println(explosions.size() + " explosions in ExplosionModel.");
		for (Explosion explosion : explosions) {
			explosion.explode();
		}
	}
	
	public static void demo() {
		System.out.println("\n\t" + ExplosionModel.class.getName() + ".demo()...");
		
		ExplosionModel obj = new ExplosionModel();

		/**
		 * add AbstractExplosion objects into the ExplosionModel
		 */
		obj.add(new AtomBomb());
		obj.add(new Grenade());
		obj.add(new HydrogenBomb());
		/**
		 * Allow each ExplosionModel to explode
		 */
		obj.explodeAll();
		
		System.out.println("\n\t" + ExplosionModel.class.getName() + ".demo()...done!");
	}

}


