package edu.neu.csye6200;

public class Driver {

	public static void main(String args[]) {
		ExplosionModel.demo();
		ExplosionModelA.demo();
		ExplodableModel.demo();
	}
}
/*
 * -------------OUTPUT---------------------------
 *
edu.neu.csye6200.ExplosionModel.demo()...
3 explosions in ExplosionModel.
AerialBomb blast from Explosion
Grenade blast from Explosion
HydrogenBomb blast from Explosion

edu.neu.csye6200.ExplosionModel.demo()...done!

edu.neu.csye6200.ExplosionModelA.demo()...
3 explosions in ExplosionModelA.
BigiliBomb blast from Abstract Explosion
NuclearBomb blast from Abstract Explosion
Bomb blast from Abstract Explosion

edu.neu.csye6200.ExplosionModelA.demo()...done!

edu.neu.csye6200.ExplodableModel.demo()...
3 explosions in ExplodableModel.
HeliumBomb blast from Explodable API
B61Bomb blast from Explodable API
AerialBomb  blast from Explodable API

edu.neu.csye6200.ExplodableModel.demo()...done!
*/