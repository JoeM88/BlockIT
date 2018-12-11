package e.josephmolina.blockit.ListScreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import e.josephmolina.blockit.R;

public class ListActivity extends AppCompatActivity {

    ListController controller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        controller = new ListController(this);
    }
}
