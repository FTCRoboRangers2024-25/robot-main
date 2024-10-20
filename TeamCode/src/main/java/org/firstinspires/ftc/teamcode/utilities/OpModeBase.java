package org.firstinspires.ftc.teamcode.utilities;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.HashSet;

public abstract class OpModeBase extends LinearOpMode {
    private final HashSet<Component> components = new HashSet<>();

    private final IMessageBroadcaster messageBroadcaster = new StandardMessageBroadcaster();

    public abstract void startup();

    private void initializeComponents() {
        for (Component component : components) {
            component.init();
        }
    }

    @Override
    public void runOpMode() {
        startup();

        initializeComponents();

        waitForStart();

        if (opModeIsActive()) {
            while (opModeIsActive()) {
                for (Component component : components) {
                    component.loop();
                }

                telemetry.update();
            }
        }
    }

    protected <T> void addComponent(Class<T> clazz) {
        try {
            //TODO: clean this stuff up, somehow automatically supply the constructor arguments for more flexibility
            Constructor<?> constructor = clazz.getConstructor(HardwareMap.class, Telemetry.class, IMessageBroadcaster.class);
            Object createdComponent = constructor.newInstance(hardwareMap, telemetry, messageBroadcaster);

            Component castedComponent = (Component)createdComponent;
            components.add(castedComponent);
        } catch (Exception e) {
            //TODO: more feedback for drivers so in case something happens during a match, they can spot it very quickly
            telemetry.addLine("Something went wrong when instantiating " + clazz.getName());
            telemetry.update();
        }
    }
}
