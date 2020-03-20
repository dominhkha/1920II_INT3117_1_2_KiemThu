import org.junit.Assert;
import org.junit.Test;
public class CoachTest {



    @Test(expected = Exception.class)
    public void TestCaculationExceptionv2() throws Exception {
        Coach.fareCacultion(-1,-1);
    }

    @Test
    public void TestCaculationv2() throws Exception {
        Assert.assertEquals(8000, Coach.fareCacultion(100,1));
        Assert.assertEquals(16000, Coach.fareCacultion(100,2));
        Assert.assertEquals(600000,Coach.fareCacultion(100,100));
        Assert.assertEquals(594000, Coach.fareCacultion(100,99));
        Assert.assertEquals(300000, Coach.fareCacultion(100, (float) 50.5));
        Assert.assertEquals(0, Coach.fareCacultion(1, (float) 50.5));
        Assert.assertEquals(0, Coach.fareCacultion(2, (float) 50.5));
        Assert.assertEquals(300000, Coach.fareCacultion(200, (float) 50.5));
        Assert.assertEquals(300000, Coach.fareCacultion(199, (float) 50.5));
    }

}
