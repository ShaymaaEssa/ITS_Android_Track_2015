package hfad2015.android.messenger;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;


public class ReceiveMessageActivity extends ActionBarActivity {
    public static final String EXTRA_VALUE = "MESSAGE";
    TextView txt_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        txt_msg = (TextView)findViewById(R.id.txt_msg);

        Intent intent = getIntent();

        txt_msg.setText(intent.getStringExtra(EXTRA_VALUE));

    }


}
