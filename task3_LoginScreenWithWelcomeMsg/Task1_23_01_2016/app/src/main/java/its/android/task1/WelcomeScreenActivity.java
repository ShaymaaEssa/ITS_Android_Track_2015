package its.android.task1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class WelcomeScreenActivity extends ActionBarActivity {

    public static final String NAME = "Name";

    TextView txt_welcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        txt_welcome = (TextView)findViewById(R.id.txt_welcome);

        Intent intent = getIntent();
        txt_welcome.setText("Welcome "+intent.getStringExtra(NAME)+"!");
    }

}
