import java.io.UnsupportedEncodingException;

public class Program {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Logger logger = null;
        try {
             logger = new Logger("C:\\JavaProjects\\done\\Java\\SchoolMaven\\src\\main\\java\\easyConfig.txt");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Student student = new Student(100,"holymosh" , "great" , 19,new int[]{1,2});
        student.giveCash(-2);
    }
}
