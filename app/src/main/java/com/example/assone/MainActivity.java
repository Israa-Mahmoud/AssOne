package com.example.assone;
import android.content.Intent;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
   // private EditText eName;
   // private EditText eHobbies;
   // private EditText eEmail;
   // private EditText ePhone;
    //private EditText eAge;
    //private EditText eDate;
   // private Button save;
    //Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //actionbar title
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("First Activity");


        //EditText
        final EditText mEName = findViewById(R.id.eName);
        final EditText mEHobbies = findViewById(R.id.eHobbies);
        final EditText mEEmail = findViewById(R.id.eEmail);
        final EditText mEPhone = findViewById(R.id.ePhone);
        final EditText mEAge = findViewById(R.id.eAge);
        final EditText mEDate = findViewById(R.id.eDate);

       //Button
        Button mBtnSave = findViewById(R.id.btnSave);

        //button click listener
        mBtnSave.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                String name =mEName.getText().toString();
                String hobbies=mEHobbies.getText().toString();
                String email=mEEmail.getText().toString() ;
                String phone=mEPhone.getText().toString() ;
                String age=mEAge.getText().toString() ;
                String date=mEDate.getText().toString();

                //Activity intent
                Intent intent= new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra(" NAME", name);
                intent.putExtra(" HOBBIES", hobbies);
                intent.putExtra(" EMAIL", email);
                intent.putExtra(" PHONE", phone);
                intent.putExtra(" AGE", age);
                intent.putExtra(" DATE", date);
                startActivity(intent);
            }
        });
    }}


    /*  eName=findViewById(R.id.eName);
        eHobbies=findViewById(R.id.eHobbies);
        eEmail=findViewById(R.id.eEmail);
        ePhone=findViewById(R.id.ePhone);
        eAge=findViewById(R.id.eAge);
        eDate=findViewById(R.id.eDate);
        save=findViewById(R.id.btnSave);
        save.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
          String usereName=eName.getText().toString();
          String usereHobbies=eHobbies.getText().toString();
          String usereEmail=eEmail.getText().toString();  } });
              android:onClick="btnSave_onClick"  */