import models.threePhased.ThreePhasedScheme;
import realSchemes.serversRoom.*;
import view.ElementView;

public class Main {
    public static void main(String[] args) {
        ThreePhasedScheme scheme = ServersRoom.consumer();
        ElementView.printInfo(scheme);
        ElementView.show(scheme);
    }

}
