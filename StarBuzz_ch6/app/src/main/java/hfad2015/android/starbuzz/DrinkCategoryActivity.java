package hfad2015.android.starbuzz;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by android on 1/19/2016.
 */
public class DrinkCategoryActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listDrinks = getListView();
        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<Drink>(this,android.R.layout.simple_list_item_1,Drink.drinks);
        listDrinks.setAdapter(listAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = new Intent(this,DrinkActivity.class);
        intent.putExtra(DrinkActivity.EXTRA_VALUE,(int)id);
        startActivity(intent);

    }
}
