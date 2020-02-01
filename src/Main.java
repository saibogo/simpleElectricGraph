import baseConcept.AbstractElement;
import baseConcept.onePhased.AbstractOnePhasedElement;
import baseConcept.onePhased.OnePhasedConsumer;
import models.cables.VVGng3x1_5;
import models.lamps.LED_Navigator36;
import view.ElementView;

public class Main {
    public static void main(String[] args) {
        AbstractElement element = new AbstractElement.Builder()
                .setName("Alpha")
                .setDescription("Betha")
                .build();

        AbstractElement element1 = new AbstractOnePhasedElement.Builder()
                .setName("Alpha1")
                .setDescription("Betha1")
                .build();

        AbstractElement element2 = new OnePhasedConsumer.Builder()
                .setName("Consumer")
                .setDescription("MegaConsumer")
                .setPower(1000d)
                .build();

        AbstractElement lamp1 = new LED_Navigator36("Дальний светильник серверная");
        AbstractElement cable1 = new VVGng3x1_5("Перемычка между светильниками", 1.5d);
        cable1.addChildren(lamp1);

        ElementView.printInfo(element);
        ElementView.printInfo(element1);
        ElementView.printInfo(element2);
        ElementView.printInfo(lamp1);
        ElementView.printInfo(cable1);
    }
}
