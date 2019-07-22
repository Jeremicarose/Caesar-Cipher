package module;

public class decrypt {
    private String word;
    private int key;

    public String getWord(){
        return word;
    }


    public int getKey(){
        return key;
    }

    public decrypt(String word,int key){
        this.word = word;
        this.key = key;
    }

    public String decrypter(){
        String decryptedText = "";
        for (int i = 0; i < getWord().length(); i++){
            char wordChar = getWord().charAt(i);
            char decrypted = (char) (wordChar - getKey());
            decryptedText += decrypted;
        }
        return decryptedText;
    }

}


