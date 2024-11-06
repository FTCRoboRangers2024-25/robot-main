package org.firstinspires.ftc.teamcode.samples.opmodes;

import org.firstinspires.ftc.teamcode.samples.components.SampleComponent;
import org.firstinspires.ftc.teamcode.samples.components.SampleComponent2;
import org.firstinspires.ftc.teamcode.utilities.OpModeBase;

public class SampleOpMode extends OpModeBase {
    @Override
    public void startup() {
        addComponent(SampleComponent.class);
        addComponent(SampleComponent2.class);
    }
}
