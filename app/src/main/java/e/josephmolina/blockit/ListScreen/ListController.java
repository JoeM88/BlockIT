package e.josephmolina.blockit.ListScreen;

public class ListController implements ListLayout.ListScreenListener {
    private ListActivity listActivity;
    private ListLayout listLayout;

    public ListController(ListActivity listActivity) {
        listLayout = new ListLayout(listActivity,this);
        this.listActivity = listActivity;
    }
}
