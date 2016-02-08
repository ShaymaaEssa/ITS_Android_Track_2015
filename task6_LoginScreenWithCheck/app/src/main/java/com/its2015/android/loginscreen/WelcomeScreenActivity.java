package com.its2015.android.loginscreen;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class WelcomeScreenActivity extends ActionBarActivity {

    TextView welcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        welcome = (TextView)findViewById(R.id.txt_welcomescreen_welcome);
        Intent intent = getIntent();
        welcome.setText("Welcome "+ intent.getStringExtra("name") + "...");

    }

}
