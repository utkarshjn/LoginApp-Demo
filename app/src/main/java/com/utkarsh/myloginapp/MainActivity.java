package com.utkarsh.myloginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nameEditText;
    EditText passEditText;
    EditText repassEditText;
    EditText name2EditText;
    EditText pass2EditText;
    LinearLayout signUpLayout;
    LinearLayout signInLayout;
    String userName;
    String passWord;
    Button button0;
    Button button1;

    public void signUp(View view){
        userName=String.valueOf(nameEditText.getText());
        passWord= String.valueOf(passEditText.getText());
        String repassWord=String.valueOf(repassEditText.getText());

        if(passWord.equals(repassWord)){

            signUpLayout.setVisibility(View.INVISIBLE);
            button0.setClickable(false);
            button1.setClickable(true);
            signInLayout.setVisibility(View.VISIBLE);
            Toast.makeText(MainActivity.this,"Sign Up was Successful",Toast.LENGTH_LONG).show();

        }
        else{
            passEditText.getText().clear();
            repassEditText.getText().clear();
            Toast.makeText(MainActivity.this, "Passwords didnt match!\nPlease re-enter the passwords", Toast.LENGTH_LONG).show();
        }

    }

    public void signIn(View view){
        String userName2=String.valueOf(name2EditText.getText());
        String passWord2= String.valueOf(pass2EditText.getText());

        if((userName2.equals(userName)) && (passWord2.equals(passWord))){
            Toast.makeText(MainActivity.this,"Logged In Successfully",Toast.LENGTH_LONG).show();
            signInLayout.setVisibility(View.INVISIBLE);
            }
        else{
            name2EditText.getText().clear();
            pass2EditText.getText().clear();
            Toast.makeText(MainActivity.this,"Username or Password entered are incorrect or doesnt match! Please Check",Toast.LENGTH_LONG).show();
            }
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signUpLayout=(LinearLayout)findViewById(R.id.signUpLayout);
        signInLayout=(LinearLayout)findViewById(R.id.signInLayout);
        button0=(Button)findViewById(R.id.button0);
        button1=(Button)findViewById(R.id.button1);
        nameEditText=(EditText)findViewById(R.id.nameEditText);
        passEditText=(EditText)findViewById(R.id.passEditText);
        repassEditText=(EditText)findViewById(R.id.repassEditText);
        name2EditText=(EditText)findViewById(R.id.name2EditText);
        pass2EditText=(EditText)findViewById(R.id.pass2EditText);

        button1.setClickable(false);

    }
}
