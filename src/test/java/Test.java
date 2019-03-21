import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

    public static void main(String[] args) {

//        Long current = 1553136778270L;
        System.out.println(dateFormat().format(new Date(Long.valueOf("1553136778270"))));
    }

    private static SimpleDateFormat dateFormat(){
        return new SimpleDateFormat ("HH:mm:ss");
    }

}
