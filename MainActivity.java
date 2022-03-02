package com.example.form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button bt1;
    EditText name;
    EditText email;
    EditText phone;
    EditText degree;
    EditText skills;
    EditText experience;
    EditText desc;

    private static final String LOG_TAG =  MainActivity.class.getSimpleName();;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name= findViewById(R.id.editTextTextPersonName);
        email= findViewById(R.id.editTextTextPersonName2);
        phone= findViewById(R.id.editTextTextPersonName3);
        degree= findViewById(R.id.editTextTextPersonName5);
        skills= findViewById(R.id.editTextTextPersonName6);
        experience= findViewById(R.id.editTextTextPersonName7);
        desc= findViewById(R.id.editTextTextPersonName4);

        bt1 = (Button)this.findViewById(R.id.button);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String personName=name.getText().toString();
                String personEmail=email.getText().toString();
                String personDegree=degree.getText().toString();
                String personSkills=skills.getText().toString();
                String personExperience=experience.getText().toString();
                String personDesc=desc.getText().toString();
                int personPhone =phone.getText().length();

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("keydes",personDesc);
                intent.putExtra("keyname",personName);
                intent.putExtra("keyemail",personEmail);
                intent.putExtra("keyskills",personSkills);
                intent.putExtra("keyexp",personExperience);
                intent.putExtra("keyphone",personPhone);
                intent.putExtra("keydegree",personDegree);

                startActivity(intent);

            }
        });
    }
    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
}
}