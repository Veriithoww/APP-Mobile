package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private EditText et1, et2,et3,et4,et5, et6;
    private ImageView iv1, iv2, iv3, iv4, iv5, iv6, iv7;
    private ImageButton ib1;
    private TextView tv1;
//    Button btnf, btnm;

    Spinner Options;

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        context = this;

        et1 = (EditText) findViewById(R.id.Name);
        et2 = (EditText) findViewById(R.id.Lastname);
        et3 = (EditText) findViewById(R.id.Email);
        et4 = (EditText) findViewById(R.id.Birthday);
        et5 = (EditText) findViewById(R.id.Birthday2);
        et6 = (EditText) findViewById(R.id.Birthday3);
        iv1 = (ImageView) findViewById(R.id.Next5);
        iv2 = (ImageView) findViewById(R.id.Photo);
        iv3 = (ImageView) findViewById(R.id.Person);
        iv4 = (ImageView) findViewById(R.id.Person2);
        iv5 = (ImageView) findViewById(R.id.Mail);
        iv6 = (ImageView) findViewById(R.id.Sex);
        iv7 = (ImageView) findViewById(R.id.Calendar);
        ib1 = (ImageButton) findViewById(R.id.Photo2);
        tv1 = (TextView) findViewById(R.id.Leyenda);
        Options = (Spinner) findViewById(R.id.sp01);


        String [] Opciones = {"femenino", "masculino"};


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Options, R.layout.spinner);
        Options.setAdapter(adapter);


        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Complete = et1.getText().toString();
                String Complete1 = et2.getText().toString();
                String Complete2 = et3.getText().toString();
                String Complete3 = et4.getText().toString();
                String Complete4 = et5.getText().toString();
                String Complete5 = et6.getText().toString();

                if (Complete5.length() == 0) {
                    Toast.makeText(Main2Activity.this, "Ingresa tus datos", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(Main2Activity.this, "Bienvenido", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Main2Activity.this, Home.class);
                    startActivity(intent);
                }
            }
        });

        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Photo_options(context);
            }
        });

    }
}
