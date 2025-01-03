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
        EditText editText = findViewById(R.id.sampleinput);
        Button buttonSubmit = findViewById(R.id.submitButton);
        buttonSubmit.setOnClickListener(v -> {
            String name = editText.getText().toString();
            Toast.makeText(this, "Hello, " + name, Toast.LENGTH_SHORT).show();
        });
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton selected = findViewById(checkedId);
            Toast.makeText(this, "Selected: " + selected.getText(), Toast.LENGTH_SHORT).show();
        });
        CheckBox checkBox = findViewById(R.id.checkBox);
        checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            Toast.makeText(this, "Check Box is selected", Toast.LENGTH_SHORT).show();
        });
        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        String[] countries = {"India", "USA", "Canada", "Australia", "UK"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, countries);
        autoCompleteTextView.setAdapter(adapter);
        ImageButton imageButton = findViewById(R.id.imageButton);
        imageButton.setOnClickListener(v -> Toast.makeText(this, "Image Button Clicked", Toast.LENGTH_SHORT).show());
        ToggleButton toggleButton = findViewById(R.id.toggleButton);
        toggleButton.setOnCheckedChangeListener((buttonView, isChecked) -> {
            Toast.makeText(this, "Toggle is " + (isChecked ? "ON" : "OFF"), Toast.LENGTH_SHORT).show();
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
        android:id ="@+id/sampleinput"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />
    <RadioGroup
        android:id="@+id/radioGroup"
        android:layout_height="wrap_content"
        android:layout_width="wrap_content">

        <RadioButton
            android:id="@+id/radioMale"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Male"
         />

        <RadioButton
            android:id="@+id/radioFemale"
            android:layout_width="wrap_content"
            android:text="Female"
             android:layout_height="wrap_content"/>
    </RadioGroup>
    <Button
        android:id="@+id/submitButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="SUBMIT"
        />
    <AutoCompleteTextView
        android:id="@+id/autoCompleteTextView"
        android:text="autoCompleteTextView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>
        <ImageButton
            android:id="@+id/imageButton"
            android:src="@android:drawable/ic_menu_camera"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:contentDescription="ImageButton"
            />
    <ToggleButton
        android:id="@+id/toggleButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textOff="OFF"
        android:textOn="ON"
        />
    <CheckBox
        android:id="@+id/checkBox"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>
</LinearLayout>*/
