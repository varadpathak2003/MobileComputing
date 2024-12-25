package com.example.myapplication;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView result = findViewById(R.id.result);
        Button submitButton=findViewById(R.id.submitButton);
        RadioGroup question1Options = findViewById(R.id.Q1Options);
        RadioGroup question2Options = findViewById(R.id.Q2Options);
        submitButton.setOnClickListener(v->{
            int c = 0;
            int id = question1Options.getCheckedRadioButtonId();
            RadioButton answerQuestion1 = findViewById(id);
            String answer = answerQuestion1.getText().toString();
            if (answer.equals("2024")) c++;
            int id2 = question2Options.getCheckedRadioButtonId();
            RadioButton answerQuestion2 = findViewById(id2);
            String answer2 = answerQuestion2.getText().toString();
            if (answer2.equals("New Delhi")) c++;
            float percentage=c/2*100;
            result.setText("Quiz Result : "+percentage+"%");
        });
    }
}
/*
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp">
    <TextView
        android:id="@+id/Q1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Which Year is this ?"/>

    <RadioGroup
        android:id="@+id/Q1Options"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">

        <RadioButton
            android:id="@+id/Q1O1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="2024" />

        <RadioButton
            android:id="@+id/Q1O2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="2025" />
    </RadioGroup>

    <TextView
        android:id="@+id/Q2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Capital of India ?"/>

    <RadioGroup
        android:id="@+id/Q2Options"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">

        <RadioButton
            android:id="@+id/Q2O1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Delhi" />

        <RadioButton
            android:id="@+id/Q2O2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="New Delhi" />
    </RadioGroup>

    <Button
        android:id="@+id/submitButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Submit Quiz"/>

    <TextView
        android:id="@+id/result"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        />
</LinearLayout>
*/
