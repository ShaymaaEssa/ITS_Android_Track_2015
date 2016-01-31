package its.android.task1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class LoginActivity extends ActionBarActivity {

    EditText txt_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txt_name = (EditText)findViewById(R.id.txt_name);
    }

    public void btnSigninMethod(View view){
        Intent intent = new Intent(this,WelcomeScreenActivity.class);
        intent.putExtra(WelcomeScreenActivity.NAME,txt_name.getText().toString());
        startActivity(intent);
    }
}
