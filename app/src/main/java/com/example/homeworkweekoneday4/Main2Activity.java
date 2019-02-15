package com.example.homeworkweekoneday4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tvFirstName;
    TextView tvLastName;
    TextView tvAddress;
    TextView tvCity;
    TextView tvState;
    TextView tvPostalCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvFirstName = findViewById(R.id.tvFirstNameDisplay);
        tvLastName = findViewById(R.id.tvLastNameDisplay);
        tvAddress = findViewById(R.id.tvAddressDisplay);
        tvCity = findViewById(R.id.tvCityDisplay);
        tvState = findViewById(R.id.tvStateDisplay);
        tvPostalCode = findViewById(R.id.tvPostalCodeDisplay);


        //get the intent in the target activity
        Intent intent = getIntent();
        //get the attached bundle from the intent
        Bundle extras = intent.getExtras();
        //Extracting the stored data from the bundle
        String fistName   = extras.getString("FIRST_NAME");
        String lastName   = extras.getString("LAST_NAME");
        String address    = extras.getString("ADDRESS");
        String city       = extras.getString("CITY");
        String state      = extras.getString("STATE");
        String postalCode = extras.getString("POSTAL_CODE");

        //setting text
        tvFirstName.setText(fistName);
        tvLastName.setText(lastName);
        tvAddress.setText(address) ;
        tvCity.setText(city);
        tvState.setText(state);
        tvPostalCode.setText(postalCode);




    }


}
