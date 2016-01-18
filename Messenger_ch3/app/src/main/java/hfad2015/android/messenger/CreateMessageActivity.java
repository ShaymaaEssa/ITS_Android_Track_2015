package hfad2015.android.messenger;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class CreateMessageActivity extends ActionBarActivity {

    EditText etxt_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
        etxt_msg = (EditText)findViewById(R.id.etxt_msg);
    }

    //explicit Intent
    public void btnSendMessage (View view){

        Intent intent = new Intent(this,ReceiveMessageActivity.class);
        intent.putExtra(ReceiveMessageActivity.EXTRA_VALUE, etxt_msg.getText().toString());
        startActivity(intent);

    }

    //Implicit Intent
    public void btnSendMessageApp(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, etxt_msg.getText().toString());
        Intent chosenIntent = Intent.createChooser(intent,"Apps available");
        startActivity(chosenIntent);

    }
}
