package com.emirrah.app;

import android.app.Activity;
import android.widget.EditText;
import android.widget.Toast;
import org.androidannotations.annotations.*;

@EActivity(R.layout.main)
public class MainActivity extends Activity {

    @ViewById
    EditText first_color;

    @ViewById
    EditText second_color;

    @ViewById
    EditText third_color;

    @Click(R.id.submit_colors)
    public void submitColors() {
        String first = first_color.getText().toString();
        String second = second_color.getText().toString();
        String third = third_color.getText().toString();

        String[] colors = { first, second, third };

        for (int i = 0; i < colors.length; i += 1) {
            Toast toast = Toast.makeText(this, colors[i], Toast.LENGTH_LONG);
            toast.show();
        }
    }
}
