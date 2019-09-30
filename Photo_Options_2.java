package com.example.myapplication;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Photo_options {

    public Photo_options (final Context context)
    {
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setContentView(R.layout.photo_options);

        ImageView ivd1 = (ImageView) dialog.findViewById(R.id.Dialog2);
        TextView tvc = (TextView) dialog.findViewById(R.id.Change);
        final Button btn6 = (Button) dialog.findViewById(R.id.Next6);
        final Button btn7 = (Button) dialog.findViewById(R.id.Next7);
        final Button btn8 = (Button) dialog.findViewById(R.id.Next8);

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Galería = btn6.getText().toString();

                if (Galería.length() == 1) {
                    Toast.makeText(context, "", Toast.LENGTH_LONG);
                }else{
                    Toast.makeText(context, "Ingresando a Galería", Toast.LENGTH_SHORT).show();
                    dialog.dismiss();
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Externa = btn7.getText().toString();

                if (Externa.length() == 1) {
                    Toast.makeText(context, "", Toast.LENGTH_LONG);
                }else{
                    Toast.makeText(context, "Listo para importar imagen", Toast.LENGTH_SHORT).show();
                    dialog.dismiss();
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Delete = btn8.getText().toString();

                if (Delete.length() == 1) {
                    Toast.makeText(context, "", Toast.LENGTH_LONG);
                }else{
                    Toast.makeText(context, "Imagen eliminada correctamente", Toast.LENGTH_SHORT).show();
                    dialog.dismiss();
                }
            }
        });

        dialog.show();
    }

}


