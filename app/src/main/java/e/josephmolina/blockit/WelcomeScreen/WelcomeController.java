package e.josephmolina.blockit.WelcomeScreen;

import android.content.Intent;

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
        Intent goToSignUpActivity = new Intent(welcomeActivity, SignUpActivity.class);
        welcomeActivity.startActivity(goToSignUpActivity);
    }
}
