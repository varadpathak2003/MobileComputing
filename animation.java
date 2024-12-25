package com.example.myapplication;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView animatedText = findViewById(R.id.animatedText);
        ObjectAnimator animator = ObjectAnimator.ofFloat(animatedText, "translationX", 0f, 300f);
        animator.setDuration(1000);
        animator.setRepeatCount(ObjectAnimator.INFINITE);
        animator.setRepeatMode(ObjectAnimator.REVERSE);
        animator.start();
    }
}
/*<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center">

    <TextView
        android:id="@+id/animatedText"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello, Animation!"
        android:textSize="24sp" />
</LinearLayout>
*/
