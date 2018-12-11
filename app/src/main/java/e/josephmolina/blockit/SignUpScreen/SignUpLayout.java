package e.josephmolina.blockit.SignUpScreen;


import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import e.josephmolina.blockit.R;

public class SignUpLayout {
    private SignUpActivity signUpActivity;
    private SignUpScreenListener signUpScreenListener;

    @BindView(R.id.email_signup_textview)
    EditText email_EditText;

    @BindView(R.id.password_signup_textview)
    EditText password_editText;

    @BindView(R.id.signup_submit_button)
    Button signup_submit_button;

    public SignUpLayout(SignUpActivity signUpActivity, SignUpScreenListener signUpScreenListener) {
        signUpActivity.setContentView(R.layout.activity_sign_up);
        this.signUpActivity = signUpActivity;
        this.signUpScreenListener = signUpScreenListener;
        ButterKnife.bind(this, signUpActivity);
    }

    @OnClick(R.id.signup_submit_button)
    public void onSubmitButton() {
        signUpScreenListener.onSubmitButtonClicked();
    }

    public void displayToastMessage(String message) {
        Toast.makeText(signUpActivity, message, Toast.LENGTH_LONG).show();
    }

    interface SignUpScreenListener {
        void onSubmitButtonClicked();
    }
}
