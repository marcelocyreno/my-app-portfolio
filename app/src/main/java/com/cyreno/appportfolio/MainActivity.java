package com.cyreno.appportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    private Button spotifyStreamerButton, scoresAppButton, libraryAppButton, buildItBiggerButton, xyzReaderButton, capstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spotifyStreamerButton = (Button) findViewById(R.id.spotifyStreamerButton);
        spotifyStreamerButton.setOnClickListener(onClickListener);

        scoresAppButton = (Button) findViewById(R.id.scoresAppButton);
        scoresAppButton.setOnClickListener(onClickListener);

        libraryAppButton = (Button) findViewById(R.id.libraryAppButton);
        libraryAppButton.setOnClickListener(onClickListener);

        buildItBiggerButton = (Button) findViewById(R.id.buildItBiggerButton);
        buildItBiggerButton.setOnClickListener(onClickListener);

        xyzReaderButton = (Button) findViewById(R.id.xyzReaderButton);
        xyzReaderButton.setOnClickListener(onClickListener);

        capstoneButton = (Button) findViewById(R.id.capstoneButton);
        capstoneButton.setOnClickListener(onClickListener);

    }


    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            String appName = null;

            switch (v.getId()) {
                case R.id.spotifyStreamerButton:
                    appName = "Spotify Streamer App";
                    break;
                case R.id.scoresAppButton:
                    appName = "Scores App";
                    break;
                case R.id.libraryAppButton:
                    appName = "Library App";
                    break;
                case R.id.buildItBiggerButton:
                    appName = "Build It Bigger App";
                    break;
                case R.id.xyzReaderButton:
                    appName = "XYZ Reader App";
                    break;
                case R.id.capstoneButton:
                    appName = "Capstone App";
                    break;

            }

            if (!TextUtils.isEmpty(appName)) {
                Toast.makeText(MainActivity.this, "This button will launch my " + appName + " !", Toast.LENGTH_SHORT).show();
            }


        }
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
