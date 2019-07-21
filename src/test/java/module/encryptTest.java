package module;

import org.junit.Test;

import static org.junit.Assert.*;

public class encryptTest {
    @Test
    public void instantiates_correct(){
        encrypt testEncrypt = new encrypt("jere",5);
        assertTrue(testEncrypt instanceof encrypt);
    }

    @Test
    public void getWord_String(){
        encrypt testEncrypt= new encrypt("jere",5);

        assertEquals("jere",testEncrypt.getWord());
    }

    @Test
    public void getKey_int(){
        encrypt testEncrypt= new encrypt("jere",5);

        assertEquals(5,testEncrypt.getKey());
    }


    @Test
    public void getWord() {
    }

    @Test
    public void getKey() {
    }
}