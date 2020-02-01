package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class ExplosionModelA extends AbstractExplosionModelA{
	
private List<AbstractExplosion> explosions = new ArrayList<AbstractExplosion>();
	
	@Override
	public void load() {
		add(new BigiliBomb());
		add(new NuclearBomb());
		add(new Bomb());
		
	}

	@Override
	public void add(AbstractExplosion e) {
		this.explosions.add(e);
	}

	@Override
	public void explodeAll() {
		System.out.println(explosions.size() + " explosions in ExplosionModelA.");
		for (AbstractExplosion explosion : explosions) {
			explosion.explode();
		}
	}
	
	public static void demo() {
		System.out.println("\n\t" + ExplosionModelA.class.getName() + ".demo()...");
		
		ExplosionModelA obj = new ExplosionModelA();

		/**
		 * add AbstractExplosion objects into the ExplosionModel
		 */
		obj.add(new BigiliBomb());
		obj.add(new NuclearBomb());
		obj.add(new Bomb());
	
		
		
		obj.explodeAll();
		
		System.out.println("\n\t" + ExplosionModelA.class.getName() + ".demo()...done!");
	}

}




