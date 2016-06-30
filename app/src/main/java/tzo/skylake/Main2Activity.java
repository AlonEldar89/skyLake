package tzo.skylake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        int value = intent.getIntExtra("curKaki", 42); //if it's a string you stored.

        TextView kakVal = (TextView) findViewById(R.id.kakVal);
        kakVal.setText(String.valueOf(value));

    }
}
