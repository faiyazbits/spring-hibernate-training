package abstraction;

import java.util.ArrayList;

public class NavigationService {

    private ArrayList<ViewType> views = new ArrayList<>();


    public void activateRouteView() {
        ViewType viewType = this.peekTopMostView();
        this.notifyViewChange(viewType);
        this.pushView(ViewType.ROUTE);
    }

    public void activateJourneyView() {
        ViewType viewType = this.peekTopMostView();
        this.notifyViewChange(viewType);
        this.pushView(ViewType.JOURNEY);
    }

    private void pushView(ViewType viewType) {
        int lastIndex = this.views.size() - 1;
        ViewType lastView = this.views.get(lastIndex);

        if (lastView != viewType) {
            this.views.add(viewType);
        }
    }

    private ViewType popView() {
        int lastIndex = this.views.size() - 1;
        ViewType lastView = this.views.get(lastIndex);
        this.views.remove(lastIndex);
        return lastView;
    }

    private ViewType peekTopMostView() {
        int lastIndex = this.views.size() - 1;
        ViewType lastView = this.views.get(lastIndex);
        return lastView;
    }

    private void clear() {
        this.views.clear();
    }


    public void notifyViewChange(ViewType viewType) {
        System.out.println("viewType = " + viewType);
    }

}
