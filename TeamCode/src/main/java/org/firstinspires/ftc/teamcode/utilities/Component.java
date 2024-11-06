package org.firstinspires.ftc.teamcode.utilities;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public abstract class Component {
    protected HardwareMap hardwareMap;
    protected Telemetry telemetry;

    private IMessageBroadcaster messageBroadcaster;

    public void addDependencies(HardwareMap hardwareMap, Telemetry telemetry, IMessageBroadcaster messageBroadcaster) {
        this.hardwareMap = hardwareMap;
        this.telemetry = telemetry;
        this.messageBroadcaster = messageBroadcaster;
    }

    public abstract void init();
    public abstract void loop();

    protected void broadcastMessage(String message) {
        if (!message.isEmpty()) {
            messageBroadcaster.broadcastMessage(message);
        }
    }
}
