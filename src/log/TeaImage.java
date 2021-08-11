package log;



import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author unitech
 */
public class TeaImage {
    
    
    public static InputStream getImageInputStream(String path) throws FileNotFoundException {
        if(path != null) {
            InputStream is = new FileInputStream(path);
            return is;
        }
        return null;
    }
    
    public static ImageIcon getImageIcon(String path) {
        if(path != null){
            return new ImageIcon(path);
        }
        return null;
    }
    
    public static Image getScaledImage(Image srcImg, int w){
    
        int ow = srcImg.getWidth(null);
        int oh = srcImg.getHeight(null);
        double ratio =  (double) ow/oh;
        int hh =  (int) Math.round(w / ratio);
        BufferedImage resizedImg = new BufferedImage(w, hh, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = resizedImg.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, w, hh, null);
        g2.dispose();
        return resizedImg;
    }
    
    public static Image getScaledImage(Image srcImg, int w, int h){
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = resizedImg.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, w, h, null);
        g2.dispose();
        return resizedImg;
    }
    
    public static Image getScaledImage2(Image srcImg, int h) {
        int ow = srcImg.getWidth(null);
        int oh = srcImg.getHeight(null);
        double ratio = (double) oh/ow;
        int ww = (int) Math.round(h/ratio);
        BufferedImage resizedImg = new BufferedImage(ww, h, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = resizedImg.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, ww, h, null);
        g2.dispose();
        return resizedImg;
    }
}
