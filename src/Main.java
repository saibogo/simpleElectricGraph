import baseConcept.AbstractElement;
import baseConcept.onePhased.OnePhasedCircuitBreaker;
import baseConcept.onePhased.OnePhasedScheme;
import baseConcept.threePhased.ThreePhasedAppliance;
import baseConcept.threePhased.ThreePhasedCircuitBreaker;
import controllers.Phases;
import controllers.TreeController;
import models.airConditioning.MS_GF60VA;
import models.airConditioning.MS_GF60VA_external_unit;
import models.appliance.Energomera_CE306_R33_145_JAZ;
import models.cables.VVGng3x2_5;
import models.circuitBreakers.*;
import pairs.Triple;
import realSchemes.serversRoom.*;
import view.ElementView;

public class Main {
    public static void main(String[] args) {

        OnePhasedScheme scheme1 = ServersRoomLigth.consumer();
        OnePhasedScheme scheme2 = LeftServers.consumer();
        OnePhasedScheme scheme3 = RightServers.consumer();
        OnePhasedScheme scheme4 = SocketsAdmin.consumer();
        OnePhasedScheme scheme5 = SocketsPowerEngineer.consumer();
        OnePhasedScheme scheme6 = SocketsRest.consumer();

        ThreePhasedAppliance pu = new Energomera_CE306_R33_145_JAZ("Серверная учет э/э");

        OnePhasedCircuitBreaker breaker1 = new ABB_S201_C32("Малая стойка");
        breaker1.addChildren(scheme3);
        pu.addChildrenA(breaker1);

        OnePhasedCircuitBreaker breaker2 = new ABB_S201_C16("Розетки угол");
        breaker2.addChildren(scheme6);
        pu.addChildrenA(breaker2);

        OnePhasedCircuitBreaker breaker3 = new ABB_S201_C32("Главная стойка");
        breaker3.addChildren(scheme2);
        pu.addChildrenB(breaker3);

        OnePhasedCircuitBreaker breaker4 = new ABB_S201_C16("Розетки Андрей");
        breaker4.addChildren(scheme5);
        pu.addChildrenB(breaker4);

        OnePhasedCircuitBreaker breaker5 = new ABB_S201_C25("Кондиционер серверная");
        pu.addChildrenC(breaker5);

        VVGng3x2_5 cable1 = new VVGng3x2_5("Питание кондиционера", 3d);
        MS_GF60VA conditional = new MS_GF60VA("Внутренний блок");
        VVGng3x2_5 cable2 = new VVGng3x2_5("Питание внешнего блока", 15d);
        MS_GF60VA_external_unit external_unit = new MS_GF60VA_external_unit("Блок у вентиляции БургерКинг");
        cable2.addChildren(external_unit);
        cable1.addChildren(conditional);
        cable1.addChildren(cable2);
        breaker5.addChildren(cable1);

        OnePhasedCircuitBreaker breaker6 = new ABB_S201_C16("Розетки Лев");
        breaker6.addChildren(scheme4);
        pu.addChildrenC(breaker6);

        OnePhasedCircuitBreaker breaker7 = new ABB_S201_C6("Освещение серверная");
        breaker7.addChildren(scheme1);
        pu.addChildrenC(breaker7);

        ThreePhasedCircuitBreaker breaker8 = new ABB_S203_C32("Ввод серверная");
        breaker8.addChildrenABC(pu);

        ElementView.printInfo(breaker8);

        ElementView.show(breaker8);


    }

}
