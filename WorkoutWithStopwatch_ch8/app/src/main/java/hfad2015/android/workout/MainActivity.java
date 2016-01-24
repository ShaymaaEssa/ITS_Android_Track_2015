package hfad2015.android.workout;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity implements WorkoutListFragment.WorkoutListListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    @Override
    public void itemClicked(long id) {
        View fragmentContainer = findViewById(R.id.contaier_detailFragment);
        if (fragmentContainer!= null){
            WorkoutDetailFragment details = new WorkoutDetailFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            details.setWorkoutId(id);
            ft.replace(R.id.contaier_detailFragment, details);
            ft.addToBackStack(null);
            //ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            ft.setCustomAnimations(android.R.anim.fade_in,android.R.anim.fade_out);
            ft.commit();
        }
        else {
            Intent intent = new Intent (this,DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_VALUE,id);
            startActivity(intent);
        }

    }
}
