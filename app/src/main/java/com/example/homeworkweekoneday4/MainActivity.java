package com.example.homeworkweekoneday4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements TextWatcher{


    EditText etFirstName;
    EditText etLastName;
    EditText etAddress;
    EditText etCity;
    EditText etState;
    EditText etPostalCode;

    Button btnDisplayName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFirstName  = findViewById(R.id.etFirstNameInput);
        etLastName   = findViewById(R.id.etLastNameInput);
        etAddress    = findViewById(R.id.etAddressInput);
        etCity       = findViewById(R.id.etCityInput);
        etState      = findViewById(R.id.etStateInput);
        etPostalCode = findViewById(R.id.etPostalCodeInput);
        btnDisplayName = findViewById(R.id.btnSendData);


    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {

    }

    public void onButtonClickHandler(View view) {

        //setting variables
        String fistName   = etFirstName.getText() != null ? etFirstName.getText().toString() : "";
        String lastName   = etLastName.getText().toString();
        String address    = etAddress.getText().toString();
        String city       = etCity.getText().toString();
        String state      = etState.getText().toString();
        String postalCode = etPostalCode.getText().toString();

        //create a Bundle object
        Bundle extras = new Bundle();
        //Adding key value pairs to this bundle
        //there are quite a lot data types you can store in a bundle
        extras.putString("FIRST_NAME",fistName);
        extras.putString("LAST_NAME",lastName);
        extras.putString("ADDRESS",address);
        extras.putString("CITY",city);
        extras.putString("STATE",state);
        extras.putString("POSTAL_CODE",postalCode);
        //create and initialize an intent
        Intent intent = new Intent(this, Main2Activity.class);
        //attach the bundle to the Intent object
        intent.putExtras(extras);
        //finally start the activity
        startActivity(intent);
    }

}
