import java.io.*;
import java.nio.file.Path;


public class Logger {

    private State state;
    private File configFile ;
    public static String defaultPath = "C:\\JavaProjects\\done\\Java\\SchoolMaven\\src\\main\\java\\easyConfig.txt";
    private File logFile = new File("C:\\JavaProjects\\done\\Java\\SchoolMaven\\src\\main\\java\\log.txt");

    public Logger(String configPath) throws UnsupportedEncodingException {
        createLogFile();
        this.configFile = new File(configPath);
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
            case "0":
                state = State.Debug;
                break;
            case "1":
                state = State.Info;
                break;
            case "2":
                state = State.Warn;
                break;
            case "3":
                state = State.Error;
                break;
                default: throw new UnsupportedEncodingException("wrong config");
        }

    }

    public State getState() {
        return state;
    }

    private void createLogFile(){
        File file = new File("C:\\JavaProjects\\done\\Java\\SchoolMaven\\src\\main\\java\\log.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
                System.out.println("Created");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void  write(String text){
        if (!text.isEmpty()){
            try (OutputStream outputStream = new FileOutputStream(logFile , true)){
                outputStream.write(text.getBytes());
                outputStream.write("\n".getBytes());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

 enum State{
    Debug , Info , Warn , Error
}
