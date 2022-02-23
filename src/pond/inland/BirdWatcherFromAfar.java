package pond.inland;

import pond.shore.Bird; // different package than Bird

public class BirdWatcherFromAfar { //isn't extended from Bird
        public void watchBird() {
            Bird bird = new Bird();
            //bird.floatInWater(); DOESN'T COMPILE
        }
}
