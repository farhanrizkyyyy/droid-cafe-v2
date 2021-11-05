package uts.ppam.droidcafe2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Login");

        Button loginButton = findViewById(R.id.button_login);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }

    public void login() {
        EditText username = findViewById(R.id.editText_username);
        EditText password = findViewById(R.id.editText_password);

        if ((username.getText().toString().equals("farhanrizky")) && password.getText().toString().equals("farhanrizky123")) {
            Intent intent = new Intent(getApplicationContext(), ListOfMenuActivity.class);
            startActivity(intent);
            finish();
        } else {
            Toast toast = Toast.makeText(MainActivity.this, R.string.login_failed_message, Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}