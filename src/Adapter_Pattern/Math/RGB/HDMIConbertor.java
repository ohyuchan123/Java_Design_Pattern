package Adapter_Pattern.Math.RGB;

public class HDMIConbertor implements Adapter{

    @Override
    public HDMI convertRGBToHDMI(RGB rgb) {
        return new HDMI(rgb.getImages());
    }
}
