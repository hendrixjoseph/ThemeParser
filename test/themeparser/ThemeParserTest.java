package themeparser;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Joe Hendrix
 */
public class ThemeParserTest
{
    private static ThemeParser themeParser;
    
    private static List<String> stringResult;
    
    @BeforeClass
    public static void beforeClass()
    {        
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
        
        ThemeParserTest.stringResult = Arrays.asList(stringResult);
        
        themeParser = new ThemeParser();
    }
    
    @AfterClass
    public static void afterClass()
    {
        System.out.println("The themes are:");
        
        themeParser.outputThemes();
    }
    
    @Before
    public void setUp()
    {
        
    }
    
    @After
    public void tearDown()
    {
        System.out.println();
    }

    /**
     * Test of getThemes method, of class ThemeParser.
     */
    @Test
    public void testGetThemes()
    {
        System.out.println("getThemes");
        List<String> result = themeParser.getThemes();
        
        for(String string : stringResult)
        {
            assert(result.contains(string));
        }
        
        System.out.println("\tResult contained all strings.");
        
        assertEquals(stringResult, result);
        
        System.out.println("\tResult equals the string.");
    }

    /**
     * Test of outputThemes method, of class ThemeParser.
     */
    @Test
    public void testOutputThemes()
    {
        System.out.println("outputThemes");
        
        ByteArrayOutputStream stringOutput = new ByteArrayOutputStream();

        PrintStream out = new PrintStream(stringOutput);
        themeParser.outputThemes(out);
        
        for(String string : stringResult)
        {
            assert(stringOutput.toString().contains(string));
        }
        
        System.out.println("\tAll themes were outputted.");
    }    
}
