package com.theshatz.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CurrencyConverter extends AppCompatActivity {
    public void convert(View view){
        EditText dollarAmountString= (EditText) findViewById(R.id.USD);
        Double dollarAmountDouble = Double.parseDouble(dollarAmountString.getText().toString());
        Double poundAmount=dollarAmountDouble*0.71;
        //class name
        Toast.makeText(CurrencyConverter.this, poundAmount.toString(), Toast.LENGTH_SHORT).show();
        Log.i("amount",dollarAmountString.getText().toString());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);
    }
}
