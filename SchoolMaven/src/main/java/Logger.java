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
        String value = null;
        byte[] next = new byte[1];
        try (InputStream inputStream = new FileInputStream(file)) {
            inputStream.read(next);
            value = new String(next);
            System.out.print(value);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        switch (value){
            
        }
    }
}

 enum State{
    Debug , Info , warn , error
}
