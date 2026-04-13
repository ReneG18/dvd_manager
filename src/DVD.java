
import java.awt.Image;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.io.IOException;


public class DVD{
    //variables
    private String title;
    private String rating;
    private int runTime;
    private Image picture;    

    //constructor
    public DVD (String t, String r, int rt, String imageFile){
        this.title = t;
        this.rating = r;
        this.runTime = rt;
        this.picture = loadImage(imageFile);
    }

    private Image loadImage(String fileName) {
        try {
            InputStream is = getClass().getResourceAsStream("/images/" + fileName);
            if (is == null) {
                System.err.println("Could not find file: " + fileName);
                return null;
            }
            return ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Image getPicture() {
        return picture;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String t){
        this.title = t;
    }

    public String getRating(){
        return rating;
    }
    public void setRating(String r){
        this.rating = r;
    }

    public int getrunTime(){
        return runTime;
    }
    public void setrunTime(int rt){
        this.runTime = rt;
    }

}
 