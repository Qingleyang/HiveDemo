import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public void currenttime() {
        Date date = new Date();
        Date olddate = new Date(date.getTime() - 10*60*1000);
        String time = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(olddate);
        System.out.println(time);
    }

    public static void main(String args[]) {
        Test test = new Test();
        test.currenttime();
    }

}
