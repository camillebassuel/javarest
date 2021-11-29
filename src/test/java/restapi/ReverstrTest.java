package restapi;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ReverstrTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void basicTest()
    {

        var rez = ReverstrLogic.ReverseString("test").equals("tset");
        System.out.println(rez);
        assertTrue( rez );
    }
}
