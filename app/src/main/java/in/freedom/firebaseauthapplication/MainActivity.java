package in.freedom.firebaseauthapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void EmailPassClick(View view) {
        Intent intent=new Intent(MainActivity.this,EmailPasswordAuthActivity.class);
        startActivity(intent);
    }

    public void PhoneClick(View view) {
        Intent intent=new Intent(MainActivity.this,PhoneAuthActivity.class);
        startActivity(intent);
    }
}
