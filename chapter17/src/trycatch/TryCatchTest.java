package trycatch;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * ClassName:TryCatchTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/10/12 21:02
 * @Version 1.0
 */
public class TryCatchTest {
    @Test
    public void test1() {
        InputStreamReader isr = new InputStreamReader(System.in);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        try (isr; osw) {
            // isr、osw是final的，不可再被赋值



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
