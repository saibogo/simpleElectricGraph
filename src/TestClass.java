import baseConcepts.AbstractOnePhasedElements;
import consumers.onePhasedConsumers.OnePhasedScheme;
import lines.onePhasedLines.AbstractOnePhasedLine;
import serversRoomShemes.ServerRackOne;
import serversRoomShemes.ServerRackTwo;
import serversRoomShemes.ServersRoomLight;


public class TestClass {
    public static void main(String[] args) {

        OnePhasedScheme light = ServersRoomLight.consumer();
        OnePhasedScheme rackOne = ServerRackOne.consumer();
        OnePhasedScheme rackTwo = ServerRackTwo.consumer();

        printInfo(rackOne);
        printInfo(rackTwo);
    }

    public static void printInfo(AbstractOnePhasedElements elements) {
        System.out.println("Name is: " + elements.getName());
        System.out.println("Description: " + elements.getDescription());
        System.out.println("Current amperage: " + elements.getAmperage());
        System.out.println("Have children?: " + elements.haveChildren());
        System.out.println("Children: " + elements.getChildren());
        if (elements instanceof AbstractOnePhasedLine) {
            System.out.println("Тепловые потери = " + ((AbstractOnePhasedLine) elements).getDeltaPower() + "W.");
        }
        System.out.println();
    }
}
