package hfad2015.android.workout;


import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class StopwatchFragment extends Fragment implements View.OnClickListener{

    int seconds=0;
    boolean running= false;
    TextView txt_time;
    Button btn_start;
    Button btn_reset;
    Button btn_stop;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState!=null){
            seconds = savedInstanceState.getInt("seconds");
            running = savedInstanceState.getBoolean("running");
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_stopwatch, container, false);
        txt_time = (TextView)layout.findViewById(R.id.txt_time);
        btn_start = (Button)layout.findViewById(R.id.btn_start);
        btn_reset = (Button)layout.findViewById(R.id.btn_reset);
        btn_stop = (Button)layout.findViewById(R.id.btn_stop);

        btn_start.setOnClickListener(this);
        btn_stop.setOnClickListener(this);
        btn_reset.setOnClickListener(this);
        runTime();
        return layout;
    }

    public void onStartMethod (){
        running = true;

    }
    public  void onStopMethod (){
        running = false;
    }
    public  void onResetMethod (){
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
                handler.postDelayed(this, 1000);
            }
        });

    }



    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putInt("seconds",seconds);
        outState.putBoolean("running",running);
    }

    public StopwatchFragment() {
        // Required empty public constructor
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_start)
            onStartMethod();
        else if (v.getId() == R.id.btn_reset)
            onResetMethod();
        else if (v.getId() == R.id.btn_stop)
            onStopMethod();
    }
}
