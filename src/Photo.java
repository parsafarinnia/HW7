import java.io.File;

/**
 * Created by parsa on 5/30/17.
 */
public class Photo {
    private File file;
    //private String imagePath;


    public Photo(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
