package tzo.skylake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    static int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //close all connections bla bla
    }

    public void ChangeText(View view) {
        count++;
        Button playButton;
        playButton = (Button) findViewById(R.id.MyButton);
        playButton.setText("kaki"+  count);
    }

    public void moveToAct2(View view) {
        Intent myIntent = new Intent(MainActivity.this, Main2Activity.class);
        myIntent.putExtra("curKaki", count); //Optional parameters
        MainActivity.this.startActivity(myIntent);
    }
}
