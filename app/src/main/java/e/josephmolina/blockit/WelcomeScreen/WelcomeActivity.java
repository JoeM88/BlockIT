package e.josephmolina.blockit.WelcomeScreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import e.josephmolina.blockit.R;

public class WelcomeActivity extends AppCompatActivity {

    private WelcomeController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        controller = new WelcomeController(this);
    }
}
