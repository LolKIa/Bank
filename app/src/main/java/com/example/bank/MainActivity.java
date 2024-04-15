package com.example.bank;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnV;
    Context context;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnV = (Button)findViewById(R.id.button6);
        constraintLayout = (ConstraintLayout)findViewById(R.id.ConstraintLayout);
        context = MainActivity.this;

        btnV.setOnClickListener(this);
    }

    public void onClick1(View v) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }

    public void onClick2(View v) {
        Intent intent = new Intent(MainActivity.this, MainActivity3.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.message);
        builder.setMessage(R.string.tint);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        final EditText username = new EditText(this);
        username.setHint(R.string.login);
        layout.addView(username);

        final EditText password = new EditText(this);
        password.setHint(R.string.password);
        layout.addView(password);


        builder.setView(layout);


        builder.setPositiveButton(R.string.otm, null);
        builder.setNegativeButton(R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(), "Вход выполнен!",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, MainActivity4.class);
                    startActivity(intent);}
                else {
                        Toast.makeText(getApplicationContext(), "Неправильные данные!",Toast.LENGTH_SHORT).show();
                }
            }
        });
        builder.show();
    }
}