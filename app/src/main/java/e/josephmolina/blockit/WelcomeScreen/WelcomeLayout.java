package e.josephmolina.blockit.WelcomeScreen;

import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import e.josephmolina.blockit.R;

public class WelcomeLayout {
    private WelcomeLayoutListener welcomeLayoutListener;
    private WelcomeActivity welcomeActivity;

    @BindView(R.id.signup_button)
    Button signupButton;

    public WelcomeLayout(WelcomeActivity welcomeActivity, WelcomeLayoutListener welcomeLayoutListener) {
        welcomeActivity.setContentView(R.layout.activity_welcome);
        this.welcomeActivity = welcomeActivity;
        this.welcomeLayoutListener = welcomeLayoutListener;
        ButterKnife.bind(this, welcomeActivity);

    }

    @OnClick(R.id.signup_button)
    public void onSignUpButtonClicked() {
        welcomeLayoutListener.onSignUpClicked();
    }

    interface WelcomeLayoutListener {
        void onSignUpClicked();
    }
}
