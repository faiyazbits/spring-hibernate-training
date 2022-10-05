package encapsulation;

import java.util.ArrayList;

public class ViewHistory {

    private ArrayList<ViewType> views = new ArrayList<>();

    public void pushView(ViewType viewType) {
        int lastIndex = this.views.size() - 1;
        ViewType lastView = this.views.get(lastIndex);

        if (lastView != viewType) {
            this.views.add(viewType);
        }
    }

    public ViewType popView() {
        int lastIndex = this.views.size() - 1;
        ViewType lastView = this.views.get(lastIndex);
        this.views.remove(lastIndex);
        return lastView;
    }

    public ViewType peekTopMostView() {
        int lastIndex = this.views.size() - 1;
        ViewType lastView = this.views.get(lastIndex);
        return lastView;
    }

    public void clear() {
        this.views.clear();
    }
}
