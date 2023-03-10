package Adapter_Pattern.Math.RGB.test;

import Adapter_Pattern.Math.RGB.HDMI;
import Adapter_Pattern.Math.RGB.HDMIConbertor;
import Adapter_Pattern.Math.RGB.RGB;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

public class HDMIConverterTest {

    @Test
    void converterTest(){

        //given
        byte[] imageBytes  = "변환할 이미지 정보의 스트림".getBytes(StandardCharsets.UTF_8);

        RGB rgb = new RGB();
        rgb.setImages(imageBytes);

        //when
        HDMIConbertor hdmiConbertor = new HDMIConbertor();
        HDMI hdmi = hdmiConbertor.convertRGBToHDMI(rgb);

        //then
        Assertions.assertEquals(hdmi.getImages(),imageBytes);

    }
}
