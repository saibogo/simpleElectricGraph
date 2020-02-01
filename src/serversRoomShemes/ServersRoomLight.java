package serversRoomShemes;

import commutation.onePhasedCommutation.JunctionBox;
import commutation.onePhasedCommutation.LightSwitch;
import consumers.onePhasedConsumers.Lamp;
import consumers.onePhasedConsumers.OnePhasedScheme;
import lines.onePhasedLines.VVGng3x1_5;

public class ServersRoomLight {
    public static OnePhasedScheme consumer() {
        Lamp lamp1 = new Lamp("дальний светильник серверная",
                "LED 36W", 36d);

        VVGng3x1_5 vvg1 = new VVGng3x1_5("Перемычка между светильниками",
                "ВВГнг 3*1,5", 1.2d, 15d);

        vvg1.addChild(lamp1);

        Lamp lamp2 = new Lamp("дальний светильник серверная",
                "LED 36W", 36d);

        JunctionBox jBox1 = new JunctionBox("коробка распределительная", "80*80", 15d);
        jBox1.addChild(vvg1);
        jBox1.addChild(lamp2);

        VVGng3x1_5 vvg2 = new VVGng3x1_5("Питание освещения серверной",
                "ВВГнг 3*1,5",
                2d,
                15d);

        vvg2.addChild(jBox1);

        JunctionBox jBox2 = new JunctionBox("коробка распределительная на освещение",
                "80*80", 15d);

        jBox2.addChild(vvg2);

        LightSwitch lSwitch1 = new LightSwitch("Свет в серверной",
                "Legrand 1 клав.", 10d);

        VVGng3x1_5 vvg3 = new VVGng3x1_5("На выключатель", "ВВГнг 3*1,5",
                2d, 15d);

        vvg3.addChild(lSwitch1);

        jBox2.addChild(vvg3);

        VVGng3x1_5 vvg4 = new VVGng3x1_5("Освещение серверной", "ВВГнг 3*1,5",
                3d, 15d);

        vvg4.addChild(jBox2);

        OnePhasedScheme scheme1 = new OnePhasedScheme("Освещение серверной", "Освещение серверной");
        scheme1.addChild(vvg4);

        return scheme1;
    }
}
