package com.example.assone;
import android.content.Intent;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //actionbar title
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Second Activity");

        //intent to get data
        Intent intent = getIntent();
        String name= intent.getStringExtra("NAME");
        String hobbies =intent.getStringExtra("HOBBIES");
        String email =intent.getStringExtra("EMAIL");
        String phone =intent.getStringExtra("PHONE");
        String age =intent.getStringExtra("AGE");
        String date =intent.getStringExtra("DATE");
        //Text View
        TextView mResultTv= findViewById(R.id.resultTv);
        //setText
        mResultTv.setText("Name: "+name+ "\nHobbies: "+hobbies+ "\nEmail: "+email+ "\nPhone: "+phone+ "\nAge: "+age+ "\nDate: "+date);

    }
}