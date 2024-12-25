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
/*<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp">
    <!-- EditText -->
    <EditText
        android:id ="@+id/tempInput"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:hint="Enter Temperature"
        android:inputType="numberDecimal"   />
    <RadioGroup
        android:id="@+id/tempType"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical">

        <RadioButton
            android:id="@+id/celsius"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Celsius" />

        <RadioButton
            android:id="@+id/fahrenheit"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Fahrenheit" />

    </RadioGroup>
    <Button
        android:id="@+id/submitButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Convert"
        />
    <TextView
        android:id="@+id/result"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>
</LinearLayout>
*/
