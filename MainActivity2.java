package com.example.form;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button bt1;
    Button bt2;
    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bt1 = findViewById(R.id.button3);
        bt2 = findViewById(R.id.button4);
        tv1 = findViewById(R.id.textView);
        tv2 = findViewById(R.id.textView2);
        tv3 = findViewById(R.id.textView3);
        tv4 = findViewById(R.id.textView4);
        tv5 = findViewById(R.id.textView6);

        Intent intent =getIntent();
        String Name=getIntent().getStringExtra("keyname");
        String Email=getIntent().getStringExtra("keyemail");
        String Degree=getIntent().getStringExtra("keydegree");
        String Skills=getIntent().getStringExtra("keyskills");
        String des=getIntent().getStringExtra("keydes");
        String Experience=getIntent().getStringExtra("keyexp");
        String phone = getIntent().getStringExtra("keyphone");


        tv1.setText(Name);
        tv2.setText(des);
        tv3.setText(Degree);
        tv4.setText(Skills);
        tv5.setText(Experience);
        bt1.setText("contact");
        bt2.setText("email");

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = getIntent();
                Uri dat= Uri.parse("tel:03115199742"+ phone);
                Intent intent = new Intent(Intent.ACTION_DIAL,dat);
                intent.setData(dat);
                startActivity(intent);
            }
        });

                bt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent mailIntent = new Intent(Intent.ACTION_VIEW);

                Uri data = Uri.parse("mailto:?subject=" + "subject text"+ "&body=" + "body text " + "&to=" + Email);
                mailIntent.setData(data);
                startActivity(Intent.createChooser(mailIntent, "Send mail..."));
            }
        });
    }

}
