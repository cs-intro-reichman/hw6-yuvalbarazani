import java.awt.Color;
/**
 * Demostarates the morphing operation and the grayscaled operation
 */
public class Editor4 {

public static void main(String args[]){
    String file="xmen.ppm";
    int n = 50;

    Color[][] image = Runigram.read(file);
    Runigram.setCanvas(image);
    Runigram.morph(image, Runigram.grayScaled(image), n);

}
    
}
