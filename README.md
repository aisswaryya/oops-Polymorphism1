# oops-Polymorphism1

Explosion: Demonstrate Run-Time Polymorphism

100 Total points.
1. 5 points: Create your own Explosion Concrete Parent Class:
    a. include one explode() method.
2. 10 points: Create your own ExplosionModel derived from AbstractExplosionModel
           a. Include a static demo() method (to be called from Driver.main()) to demonstrate its usage
    with objects derived from Explosion.
3. 10 points: Create your own ExplosionModelA derived from AbstractExplosionModelA
           a. Include a static demo() method (to be called from Driver.main()) to demonstrate its usage
    with objects derived from AbstractExplosion.
4. 10 points: Create your own ExplodableModel derived from AbstractExplodableModel
           a. Include a static demo() method (to be called from Driver.main()) to demonstrate its usage
    with objects implementing from ExplodableAPI.
5. 45 points total (5 points each class): Derive 3 Child classes from your Parent class to use with your object model (ExplosionModel). For each derived class:
    a. override the Explode() method in the Explosion base class
           c.  instantiate class
Repeat and Derive 3 or more classes from an AbstractExplosion abstract class and use with ExplosionModelA.
Repeat and Derive 3 or more classes from an ExplodableAPI interface and use with ExplodableModel.
.
6. 10 points: In the model demo method, use objects from your derived classes to demonstrate Dynamic Run-Time Polymorphism.

7. 10 points: Name and zip compress your Eclipse workspace according to our standard (workspace_201906_dan_peters_explosion.zip) Your Eclipse workspace should contain your working program, compiled without errors with all console output pasted into main() method as a comment.

Hint:
    Firstly, you need to create a concrete class Explosion, an abstract class AbstractExplosion and an interface ExplodableAPI. Each of them should have a method "explode".
    Create your own ExplosionModel derived from AbstractExplosionModel and include a static demo() method (to be called from Driver.main()) to demonstrate its usage with objects derived from Explosion.
    Same for the other two(create ExplosionModelA with usage of objects derived from AbstractExplosion, create ExplodableModel with usage of objects derived from ExplodableAPI)
    Continue the remaining tasks in BB.
