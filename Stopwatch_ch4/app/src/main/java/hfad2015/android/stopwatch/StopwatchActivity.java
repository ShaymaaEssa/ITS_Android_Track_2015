package hfad2015.android.stopwatch;

import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class StopwatchActivity extends ActionBarActivity {

    int seconds=0;
    boolean running= false;
    TextView txt_time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);
        if(savedInstanceState!=null){
            seconds = savedInstanceState.getInt("seconds");
            running = savedInstanceState.getBoolean("running");
        }
        txt_time = (TextView)findViewById(R.id.txt_time);
        runTime();
    }



    public void onStartMethod (View view){
        running = true;

    }
    public  void onStopMethod (View view){
        running = false;
    }
    public  void onResetMethod (View view){
        running = false;
        seconds = 0;
    }

    private  void runTime (){
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds / 3600;
                int min = (seconds % 3600) / 60;
                int sec = seconds % 60;
                txt_time.setText(String.format("%d:%02d:%2d", hours, min, sec));
                if (running) {
                    seconds++;
                }
                handler.postDelayed(this,1000);
            }
        });

    }



    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("seconds",seconds);
        outState.putBoolean("running",running);
    }
}
