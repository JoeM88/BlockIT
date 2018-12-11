package e.josephmolina.blockit.SignUpScreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import e.josephmolina.blockit.R;

public class SignUpActivity extends AppCompatActivity {

    SignUpController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        controller = new SignUpController(this);
    }
}
