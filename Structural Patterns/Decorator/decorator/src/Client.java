import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class Client {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerClassInputStream(new BufferedInputStream(new FileInputStream("src/test.txt")));

            while((c = in.read()) >0){
                System.out.print((char) c);
            }

            in.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
