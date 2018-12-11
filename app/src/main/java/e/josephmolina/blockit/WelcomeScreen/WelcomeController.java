package e.josephmolina.blockit.WelcomeScreen;

import android.content.Intent;
import android.util.Log;

import e.josephmolina.blockit.SignUpScreen.SignUpActivity;

public class WelcomeController implements WelcomeLayout.WelcomeLayoutListener {

    private WelcomeLayout welcomeLayout;
    private WelcomeActivity welcomeActivity;

    public WelcomeController(WelcomeActivity welcomeActivity) {
        welcomeLayout = new WelcomeLayout(welcomeActivity, this);
        this.welcomeActivity = welcomeActivity;
    }

    @Override
    public void onSignUpClicked() {
        Log.d("layout", "inside interface emthod");
        Intent goToSignUpActivity = new Intent(welcomeActivity, SignUpActivity.class);
        welcomeActivity.startActivity(goToSignUpActivity);
    }
}
