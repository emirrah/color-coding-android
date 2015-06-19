package com.emirrah.app;

import android.app.Activity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import org.androidannotations.annotations.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@EActivity(R.layout.main)
public class MainActivity extends Activity {

    @ViewById(R.id.chosen_color)
    TextView chosen_color_view;

    List<String> colors = new ArrayList<String>();

    @Click(R.id.submit_colors)
    public void submitColors() {
        if(colors.size() > 0) {
            String color = randomize();
            chosen_color_view.setText(color);
        }
        else {
            chosen_color_view.setText("");
            Toast toast = Toast.makeText(this, "Choose color(s)", Toast.LENGTH_SHORT);
            toast.setDuration(500);
            toast.show();
        }
    }

    private String randomize() {
        Random range = new Random();
        int index = range.nextInt(colors.size());
        return colors.get(index);
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case R.id.red:
                if (checked) { colors.add("Red"); }
                else { colors.remove("Red"); }
                break;
            case R.id.orange:
                if (checked) { colors.add("Orange"); }
                else { colors.remove("Orange"); }
                break;
            case R.id.yellow:
                if (checked) { colors.add("Yellow"); }
                else { colors.remove("Yellow"); }
                break;
            case R.id.green:
                if (checked) { colors.add("Green"); }
                else { colors.remove("Green"); }
                break;
            case R.id.blue:
                if (checked) { colors.add("Blue"); }
                else { colors.remove("Blue"); }
                break;
            case R.id.violet:
                if (checked) { colors.add("Violet"); }
                else { colors.remove("Violet"); }
                break;
            case R.id.black:
                if (checked) { colors.add("Black"); }
                else { colors.remove("Black"); }
                break;
            case R.id.white:
                if (checked) { colors.add("White"); }
                else { colors.remove("White"); }
                break;
            case R.id.brown:
                if (checked) { colors.add("Brown"); }
                else { colors.remove("Brown"); }
                break;
            case R.id.pink:
                if (checked) { colors.add("Pink"); }
                else { colors.remove("Pink"); }
                break;
            case R.id.silver:
                if (checked) { colors.add("Silver"); }
                else { colors.remove("Silver"); }
                break;
            case R.id.gold:
                if (checked) { colors.add("Gold"); }
                else { colors.remove("Gold"); }
                break;
            case R.id.gray:
                if (checked) { colors.add("Gray"); }
                else { colors.remove("Gray"); }
                break;
        }
    }
}
