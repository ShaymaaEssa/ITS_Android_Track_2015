package hfad2015.android.workout;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class DetailActivity extends ActionBarActivity {

    public static final String EXTRA_VALUE = "ID";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        WorkoutDetailFragment details = (WorkoutDetailFragment)getSupportFragmentManager().findFragmentById(R.id.frag_detail);
        details.setWorkoutId(intent.getLongExtra(EXTRA_VALUE,0));

    }


}
