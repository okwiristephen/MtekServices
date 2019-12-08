package ke.ac.mtek2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginMethod extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_method);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }

    public void launchHomeActivity(View view) {
        Intent HomeActivity = new Intent(LoginMethod.this, HomeActivity.class);
        startActivity(HomeActivity);
    }
}
