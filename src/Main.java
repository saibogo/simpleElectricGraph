import baseConcept.AbstractElement;
import baseConcept.onePhased.OnePhasedCircuitBreaker;
import baseConcept.onePhased.OnePhasedScheme;
import models.circuitBreakers.ABB_S200_16;
import realSchemes.serversRoom.ServersRoomLigth;
import view.ElementView;

public class Main {
    public static void main(String[] args) {

        OnePhasedScheme scheme1 = ServersRoomLigth.consumer();

        OnePhasedCircuitBreaker breaker1 = new ABB_S200_16("Освещение гр1");
        breaker1.addChildren(scheme1);

        ElementView.printInfo(breaker1);
        System.out.println(ElementView.listOfTreeToString(breaker1, 0) + "\n");

        AbstractElement cable2 = scheme1.getChildren().get(0);

        System.out.println(ElementView.listOfTreeToString(cable2, 0) + "\n");
    }

}
