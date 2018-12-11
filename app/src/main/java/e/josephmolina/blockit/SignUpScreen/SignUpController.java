package e.josephmolina.blockit.SignUpScreen;

import android.support.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUpController implements SignUpLayout.SignUpScreenListener {
    private SignUpLayout signUpLayout;
    private SignUpActivity signUpActivity;
    private FirebaseAuth firebaseAuth;

    public SignUpController(SignUpActivity signUpActivity) {
        signUpLayout = new SignUpLayout(signUpActivity, this);
        this.signUpActivity = signUpActivity;
        firebaseAuth = FirebaseAuth.getInstance();
    }

    @Override
    public void onSubmitButtonClicked() {
        String email = signUpLayout.email_EditText.getText().toString();
        String password = signUpLayout.password_editText.getText().toString();

        if (email.isEmpty() || password.isEmpty()) {
            signUpLayout.displayToastMessage("You must enter both an email and password");

        } else {
            firebaseAuth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(signUpActivity, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                //TODO: Send user to list activity
                            } else {
                                signUpLayout.displayToastMessage("Authentication failed");
                            }
                        }
                    });
        }
    }
}
