package encapsulation;

import java.util.ArrayList;

public class NavigationService {

    private ViewHistory viewHistory = new ViewHistory();
    public void activateRouteView() {
        ViewType viewType = this.viewHistory.peekTopMostView();
        this.notifyViewChange(viewType);
        this.viewHistory.pushView(ViewType.ROUTE);
    }

    public void activateJourneyView() {
        ViewType viewType = this.viewHistory.peekTopMostView();
        this.notifyViewChange(viewType);
        this.viewHistory.pushView(ViewType.JOURNEY);
    }

    public void activateStopView() {
        ViewType viewType = this.viewHistory.peekTopMostView();
        this.notifyViewChange(viewType);
        this.viewHistory.pushView(ViewType.STOP);
    }

    public void notifyViewChange(ViewType viewType) {
        System.out.println("viewType = " + viewType);
    }

}
