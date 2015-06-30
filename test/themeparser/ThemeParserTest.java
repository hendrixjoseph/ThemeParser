package themeparser;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Joe Hendrix
 */
public class ThemeParserTest
{
    ThemeParser themeParser;
    
    @Before
    public void setUp()
    {
        themeParser = new ThemeParser();
    }

    /**
     * Test of getThemes method, of class ThemeParser.
     */
    @Test
    public void testGetThemes()
    {
        System.out.println("getThemes");
        String stringResult[] = {
            "afterdark",
            "afternoon",
            "afterwork",
            "black-tie",
            "blitzer",
            "bluesky",
            "bootstrap",
            "casablanca",
            "cruze",
            "cupertino",
            "dark-hive",
            "delta",
            "dot-luv",
            "eggplant",
            "excite-bike",
            "flick",
            "glass-x",
            "hot-sneaks",
            "humanity",
            "le-frog",
            "midnight",
            "mint-choc",
            "overcast",
            "pepper-grinder",
            "redmond",
            "rocket",
            "sam",
            "smoothness",
            "south-street",
            "start",
            "sunny",
            "swanky-purse",
            "trontastic",
            "ui-darkness",
            "ui-lightness",
            "vader",
            "home"
        };
        List<String> expResult = Arrays.asList(stringResult);
        List<String> result = themeParser.getThemes();
        assertEquals(expResult, result);
    }

    /**
     * Test of outputThemes method, of class ThemeParser.
     */
    @Ignore
    @Test
    public void testOutputThemes()
    {
        System.out.println("outputThemes");
        String expResult =  
                "afterdark\n" +
                "afternoon\n" +
                "afterwork\n" +
                "black-tie\n" +
                "blitzer\n" +
                "bluesky\n" +
                "bootstrap\n" +
                "casablanca\n" +
                "cruze\n" +
                "cupertino\n" +
                "dark-hive\n" +
                "delta\n" +
                "dot-luv\n" +
                "eggplant\n" +
                "excite-bike\n" +
                "flick\n" +
                "glass-x\n" +
                "hot-sneaks\n" +
                "humanity\n" +
                "le-frog\n" +
                "midnight\n" +
                "mint-choc\n" +
                "overcast\n" +
                "pepper-grinder\n" +
                "redmond\n" +
                "rocket\n" +
                "sam\n" +
                "smoothness\n" +
                "south-street\n" +
                "start\n" +
                "sunny\n" +
                "swanky-purse\n" +
                "trontastic\n" +
                "ui-darkness\n" +
                "ui-lightness\n" +
                "vader\n" +
                "home\n";
        ByteArrayOutputStream string = new ByteArrayOutputStream();

        PrintStream out = new PrintStream(string);
        themeParser.outputThemes(out);
        
        System.out.println(expResult);
        System.out.println(expResult.equals(string.toString()));
            
        assertEquals(expResult, string.toString());
    }    
}
