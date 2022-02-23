package pond.swan;

import pond.shore.Bird;

public class Swan extends Bird { //Swan is not in the same package as Bird, but extend it
    public void swim() {
        floatInWater();
        System.out.println(text);
    }

    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater(); //these line refer to a Swan object (that extend Bird, it's the reason why it works)
        System.out.println(other.text); //these line refer to a Swan object (that extend Bird, it's the reason why it works)
    }

    public void helpOtherBirdSwim(){
        Bird other = new Bird(); //here is created a new object, that stay in different package and this class is not inheriting from Bird, so this "other" variable reference ISNT a swan
        //other.floatInWater(); DOESN'T COMPILE
        //System.out.println(other.text);  DOESN'T COMPILE
    }

}
