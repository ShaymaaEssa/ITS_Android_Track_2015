package hfad2015.android.starbuzz;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class DrinkActivity extends ActionBarActivity {
    public static final String EXTRA_VALUE = "itemClicked";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        int drink_id =(Integer) getIntent().getExtras().get(EXTRA_VALUE);
        Drink drink = Drink.drinks[drink_id];
        ImageView img_drink = (ImageView)findViewById(R.id.img_drink);
        img_drink.setImageResource(drink.getImageResourceId());
        img_drink.setContentDescription(drink.getName());

        TextView txt_name = (TextView) findViewById(R.id.txt_name);
        txt_name.setText(drink.toString());

        TextView txt_desc = (TextView)findViewById(R.id.txt_desc);
        txt_desc.setText(drink.getDesc());
    }


}
