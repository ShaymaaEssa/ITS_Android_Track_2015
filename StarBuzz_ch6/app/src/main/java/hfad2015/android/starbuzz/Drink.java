package hfad2015.android.starbuzz;

/**
 * Created by android on 1/19/2016.
 */
public class Drink {
    String name;
    String desc;
    int imageResourceId;


    public static final Drink [] drinks = {new Drink("Latte","A couple of espresso shots with steamed milk",R.drawable.latte),
    new Drink("Cappuccino","Espresso, hot milk, and a steamed milk foam",R.drawable.cappuccino),
    new Drink("Filter", "Highest quality beans roasted and brewed fresh",R.drawable.filter)};


    public Drink (String name, String desc,int imageResourceId){
        this.name = name;
        this.desc = desc;
        this.imageResourceId = imageResourceId;
    }

    public String getDesc() {
        return desc;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getName() {
        return name;
    }
    public String toString (){
        return name;
    }
}
