package com.its2015.android.loginscreen;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class LoginScreenActivity extends ActionBarActivity {

    EditText age ;
    EditText name;
    CheckBox [] courses ;
    AlertDialog alertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        age = (EditText) findViewById(R.id.etxt_loginscreen_age);
        name = (EditText)findViewById(R.id.etxt_loginscreen_name);
        courses = new CheckBox[3];
        courses[0] = (CheckBox)findViewById(R.id.ckbox_loginscreen_android);
        courses[1] = (CheckBox)findViewById(R.id.ckbox_loginscreen_java);
        courses[2] = (CheckBox)findViewById(R.id.ckbox_loginscreen_csharp);


    }

    public void btnCheckMethod (View view){
        String toastMsg = "";
        if (Integer.parseInt(age.getText().toString())<18)
            toastMsg = "Sorry,your age must not be less than 18";
        else
            toastMsg = "You can login";

        Toast.makeText(this,toastMsg,Toast.LENGTH_SHORT).show();
    }

    public void btnLoginMethod (View view){
        String course = "";
        if (Integer.parseInt(age.getText().toString())<18){
            alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Wrong Age!");
            alertDialog.setMessage("Your Age is less than 18, You can't continue!");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            alertDialog.show();

        }


        else {
            for(CheckBox c : courses){
               if (c.isChecked())
                   course += c.getText().toString() + " ";
            }
            if (course != ""){
                Toast.makeText(this,"Your courses: "+course,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this,WelcomeScreenActivity.class);
                intent.putExtra("name",name.getText().toString());
                startActivity(intent);

            }



        }
    }


}
