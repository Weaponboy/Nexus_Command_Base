package dev.weaponboy.nexus_command_base.Hardware;

import com.qualcomm.robotcore.hardware.AnalogInput;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class AxonEncoder {

    AnalogInput encoder;

    public void setOffset(double offset) {
        this.offset = offset;
    }

    double offset = 0;

    public void init(HardwareMap hardwareMap, String deviceName){
        encoder = hardwareMap.get(AnalogInput.class, deviceName);
    }

    public double getPosition(){
        return (encoder.getVoltage() / 3.3 * 360) + offset;
    }



}
