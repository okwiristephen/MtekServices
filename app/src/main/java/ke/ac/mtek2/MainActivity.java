package ke.ac.mtek2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import ke.ac.mtek2.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
    public void launchLoginMethod(View v){
        Intent loginMethod = new Intent(MainActivity.this, LoginMethod.class);
        startActivity(loginMethod);
    }
}
