package hse.course.backgroundchangingapp;

import androidx.constraintlayout.widget.ConstraintLayout;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

public class BackgroundChangingActivity extends Activity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.background_changing);

        Intent intent = getIntent();
        String colour = intent.getStringExtra("colour");

        ConstraintLayout constraintLayout = findViewById(R.id.layout);
        constraintLayout.setBackgroundColor(Color.parseColor(colour));
    }
}