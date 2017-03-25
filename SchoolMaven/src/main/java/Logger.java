import java.io.*;

/**
 * Created by дшшр on 24.03.2017.
 */
public class Logger {

    State state;
    String configPath;

    public Logger(String configPath) {
        this.configPath = configPath;
        File file = new File(configPath);
        int next;
        try (InputStream inputStream = new FileInputStream(file)) {
            next  = inputStream.read();
            System.out.print(next);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

 enum State{
    Debug , Info , warn , error
}
