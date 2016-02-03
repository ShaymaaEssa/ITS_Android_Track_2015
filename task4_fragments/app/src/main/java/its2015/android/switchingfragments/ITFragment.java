package its2015.android.switchingfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ITFragment extends ListFragment {


    public ITFragment() {
        // Required empty public constructor
    }


    private static final String [] data = {"DataBase Courses","Programming Courses","Network Courses"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(inflater.getContext(),android.R.layout.simple_list_item_1,data);
        setListAdapter(arrayAdapter);
        return super.onCreateView(inflater,container,savedInstanceState);

    }


}
