package com.example.myapplication;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup radioGroup=findViewById(R.id.tempType);
        EditText tempInput=findViewById(R.id.tempInput);
        TextView result=findViewById(R.id.result);
        Button submitButton=findViewById(R.id.submitButton);
        submitButton.setOnClickListener(v->{
            String t=tempInput.getText().toString();
            double temperature=Double.parseDouble(t);
            int id=radioGroup.getCheckedRadioButtonId();
                RadioButton radioButton=findViewById(id);
                String type=radioButton.getText().toString();
                if (type=="celsius") {
                    double fah= temperature*(9/5)+32;
                    result.setText("Fahrenheit : "+ fah);
                }
                else {
                    double cel = (temperature - 32) * 5 / 9;
                    result.setText("Fahrenheit : " + cel);
                }
        });
    }
}
