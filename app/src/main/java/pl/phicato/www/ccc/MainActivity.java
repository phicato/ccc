package pl.phicato.www.ccc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void loginFunction(View view){

        EditText username = (EditText) findViewById(R.id.usernameID);
        String usernameConverted = username.getText().toString();
        Log.i("username", usernameConverted);

        EditText password = (EditText) findViewById(R.id.passwordID);
        String passwordConverted = password.getText().toString();
        Log.i("password", passwordConverted);

        EditText name = (EditText) findViewById(R.id.nameID);
        String nameConverted = name.getText().toString();

        Toast.makeText(MainActivity.this, "Hello " + nameConverted, Toast.LENGTH_SHORT).show();
    }
}
