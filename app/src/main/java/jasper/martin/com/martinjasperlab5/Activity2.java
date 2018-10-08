package jasper.martin.com.martinjasperlab5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class Activity2 extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        Log.d("4IT-H", "onCreate() has executed...");
        Intent i = new Intent(this, BackgroundService.class);
        startService(i);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4IT-H", "onStart() has executed...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4IT-H", "onResume() has executed...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4IT-H", "onStop() has executed...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4IT-H","onDestroy() has executed...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4IT-H", "onRestart() has executed...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4IT-H", "onPause() has executed...");
    }


    public void process(View v){
        Intent i=null, chooser=null;
        if(v.getId()==R.id.btnActivity1){
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        } else if(v.getId()==R.id.btnMap2){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo: 14.6152782, 120.986796"));
            chooser = Intent.createChooser(i, "Select map app");
            startActivity(chooser);
        }
    }
}
