package hfad2015.android.workout;

/**
 * Created by android on 1/23/2016.
 */
public class Workout {
    String name ;
    String desc;
    static final Workout[] workout  = {new Workout("The Limb Loosener",
            "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups"),
            new Workout("Core Agony",
                    "100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats"),
            new Workout("The Wimp Special",
                    "5 Pull-ups\n10 Push-ups\n15 Squats"),
            new Workout("Strength and Length",
                    "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups")};

    public Workout(String name, String desc){
        this.name = name;
        this.desc = desc;

    }

    public String getDesc() {
        return desc;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return name;
    }
}
