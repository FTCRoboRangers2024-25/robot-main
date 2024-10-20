package org.firstinspires.ftc.teamcode.samples.opmodes;

import org.firstinspires.ftc.teamcode.samples.components.SampleComponent;
import org.firstinspires.ftc.teamcode.utilities.OpModeBase;
import org.firstinspires.ftc.teamcode.utilities.StandardMessageBroadcaster;

public class SampleOpMode extends OpModeBase {
    @Override
    public void startup() {
        addComponent(SampleComponent.class);
    }
}
