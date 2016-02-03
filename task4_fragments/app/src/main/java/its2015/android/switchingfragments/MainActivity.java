package its2015.android.switchingfragments;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    Button btn_IT;
    Button btn_Design;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_IT = (Button) findViewById(R.id.btn_it);
        btn_Design = (Button) findViewById(R.id.btn_design);

        btn_IT.setOnClickListener(this);
        btn_Design.setOnClickListener(this);


    }



    Fragment fragment;
    @Override
    public void onClick(View v) {

        if (v.getId() == btn_IT.getId())
            fragment = new ITFragment();

        else if (v.getId() == btn_Design.getId())
            fragment = new DesignFragment();

        if(fragment != null){
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.container_fragment,fragment);
            ft.addToBackStack(null);
            ft.commit();
        }

    }
}
