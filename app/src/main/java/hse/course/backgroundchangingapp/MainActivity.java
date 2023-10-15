package hse.course.backgroundchangingapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.main_activity);
    }

    public void changeBackground(View view) {
        EditText colourInputField = findViewById(R.id.colour_text);
        String inputColour = colourInputField.getText().toString();

        try {
            Color.parseColor(inputColour);
        } catch (IllegalArgumentException exception) {
            TextView errorMessage = findViewById(R.id.error_message);
            errorMessage.setVisibility(View.VISIBLE);
            return;
        }

        Intent intent = new Intent(this, BackgroundChangingActivity.class);
        intent.putExtra("colour", inputColour);
        startActivity(intent);
    }
}
