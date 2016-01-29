package hfad2015.android.workout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutDetailFragment extends Fragment {
    long workoutId;


    TextView txt_name;
    TextView txt_desc;


    public WorkoutDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if (savedInstanceState != null)
            workoutId = savedInstanceState.getLong("workoutId");

        else {
            StopwatchFragment stopwatchFragment = new StopwatchFragment();
            FragmentTransaction ft = getChildFragmentManager().beginTransaction();
            ft.replace(R.id.container_stopwatch,stopwatchFragment);
            ft.addToBackStack(null);
            ft.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
            ft.commit();
        }


        View layout = inflater.inflate(R.layout.fragment_workout_detail, container, false);

        return layout;
    }

    @Override
    public void onStart() {
        super.onStart();
        View layout = getView();
        txt_name = (TextView)layout.findViewById(R.id.txt_name);
        txt_desc = (TextView)layout.findViewById(R.id.txt_desc);

        txt_name.setText(Workout.workout[(int)workoutId].getName());
        txt_desc.setText(Workout.workout[(int)workoutId].getDesc());
    }

    public void setWorkoutId(long workoutId) {
        this.workoutId = workoutId;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putLong("workoutId",workoutId);
    }


}
