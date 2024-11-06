package org.firstinspires.ftc.teamcode.samples.components;

import org.firstinspires.ftc.teamcode.utilities.Component;
import org.firstinspires.ftc.teamcode.utilities.ReceiveMessage;

public class SampleComponent2 extends Component {
    private int a = 0;

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        telemetry.addData("a", a);
    }

    @ReceiveMessage(message = "incrementA")
    public void incrementA() {
        a += 1;
    }
}
