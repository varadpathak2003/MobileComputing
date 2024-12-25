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
        EditText number1=findViewById(R.id.number1);
        EditText number2=findViewById(R.id.number2);
        Button addButton=findViewById(R.id.addButton);
        Button subtractButton=findViewById(R.id.subtractButton);
        Button divideButton=findViewById(R.id.divideButton);
        Button multiplyButton=findViewById(R.id.multiplyButton);
        Button equalButton=findViewById(R.id.Submit);
        Button clearButton=findViewById(R.id.clearButton);
        TextView result=findViewById(R.id.result);
        final double[] answer = {1};
        addButton.setOnClickListener(v->{
            String input1= number1.getText().toString();
            double n1=Double.parseDouble(input1);
            String input2=number2.getText().toString();
            double n2=Double.parseDouble(input2);
            answer[0] =n1+n2;
        });
        subtractButton.setOnClickListener(v->{
            String input1= number1.getText().toString();
            double n1=Double.parseDouble(input1);
            String input2=number2.getText().toString();
            double n2=Double.parseDouble(input2);
            answer[0] = n1 - n2;
        });
        divideButton.setOnClickListener(v->{
            String input1= number1.getText().toString();
            double n1=Double.parseDouble(input1);
            String input2=number2.getText().toString();
            double n2=Double.parseDouble(input2);
            answer[0] = n1 /n2;
        });
        multiplyButton.setOnClickListener(v->{
            String input1= number1.getText().toString();
            double n1=Double.parseDouble(input1);
            String input2=number2.getText().toString();
            double n2=Double.parseDouble(input2);
            answer[0] = n1 * n2;
        });
        equalButton.setOnClickListener(v->{
            result.setText("Result : "+ answer[0]);
        });
        clearButton.setOnClickListener(v->{
            number1.setText("");
            number2.setText("");
        });
    }
}
/*
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp">
    <!-- EditText -->
    <EditText
        android:id ="@+id/number1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:hint="Enter number 1"
        android:inputType="numberDecimal"   />
    <EditText
        android:id ="@+id/number2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:hint="Enter number 2"
        android:inputType="numberDecimal"/>
    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">
    <Button
        android:id="@+id/addButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="+"
        />
    <Button
        android:id="@+id/subtractButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="-"
        />
    <Button
        android:id="@+id/divideButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="/"
        />
    <Button
        android:id="@+id/multiplyButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="*"
        />
    </LinearLayout>
    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">
    <Button
        android:id="@+id/Submit"
        android:layout_marginLeft="80sp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="="
        />
        <Button
            android:id="@+id/clearButton"
            android:layout_marginLeft="20sp"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Clear"
            />
    </LinearLayout>
    <TextView
        android:id="@+id/result"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>
</LinearLayout>
*/
