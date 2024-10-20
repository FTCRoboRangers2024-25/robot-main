package org.firstinspires.ftc.teamcode.samples.components;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.utilities.Component;
import org.firstinspires.ftc.teamcode.utilities.IMessageBroadcaster;

public class SampleComponent extends Component {
    public SampleComponent(HardwareMap hardwareMap, Telemetry telemetry, IMessageBroadcaster messageBroadcaster) {
        super(hardwareMap, telemetry, messageBroadcaster);
    }

    @Override
    public void init() {
    }

    @Override
    public void loop() {
        telemetry.addLine("Running");
    }
}
