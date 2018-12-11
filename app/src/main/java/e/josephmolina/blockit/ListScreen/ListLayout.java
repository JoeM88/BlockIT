package e.josephmolina.blockit.ListScreen;

import butterknife.ButterKnife;
import e.josephmolina.blockit.R;

public class ListLayout {

    private ListActivity listActivity;
    private ListScreenListener listListener;

    public ListLayout(ListActivity listActivity, ListScreenListener listListener) {
        listActivity.setContentView(R.layout.activity_list);
        this.listActivity = listActivity;
        this.listListener = listListener;
        ButterKnife.bind(this, listActivity);
    }

    interface ListScreenListener {

    }
}
