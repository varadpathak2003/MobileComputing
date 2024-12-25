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
        EditText taskToAdd=findViewById(R.id.taskToAdd);
        Button addTaskButton= findViewById(R.id.addTaskButton);
        ListView listView=findViewById(R.id.listView);
        List <String> list=new ArrayList<>();
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);
        addTaskButton.setOnClickListener(v->{
            String task=taskToAdd.getText().toString();
            list.add(task);
            adapter.notifyDataSetChanged();
            taskToAdd.setText("");
        });
        listView.setOnItemClickListener((parent, view, position, id) -> {
            list.remove(position);
            adapter.notifyDataSetChanged();
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
    <EditText
        android:id="@+id/taskToAdd"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:hint="Enter the task to add"/>
    <Button
        android:id="@+id/addTaskButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Add Task"/>
    <ListView
        android:id="@+id/listView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>
</LinearLayout>
*/
