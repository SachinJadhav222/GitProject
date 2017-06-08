package utility;

/**
 * Created by SOHAM on 08/06/2017.
 */
public class WebUtility extends BaseMain{
    public static void sleepTime(long sleepTiming){
        try {
            Thread.sleep(sleepTiming);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
