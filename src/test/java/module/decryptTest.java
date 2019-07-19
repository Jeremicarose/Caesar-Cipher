package module;

import org.junit.Test;

import static org.junit.Assert.*;

public class decryptTest {
    @Test
    public void instantiates_correct(){
        decrypt testDecrypt = new decrypt("jere",5);
        assertTrue(testDecrypt instanceof decrypt);
    }

    @Test
    public void getWord_String(){
        decrypt testDecrypt= new decrypt("jere",5);

        assertEquals("jere",testDecrypt.getWord());
    }

    @Test
    public void getKey_int(){
        decrypt testDecrypt= new decrypt("jere",5);

        assertEquals(5,testDecrypt.getKey());
    }


}