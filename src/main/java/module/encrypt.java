package module;

public class encrypt {
    private String word;
    private int key;

    public String getWord(){
        return word;
    }
    public int getKey(){
        return key;
    }

    public encrypt(String word,int key){
        this.word = word;
        this.key = key;
    }

    public String encrypter(){
        StringBuilder encryptedText = new StringBuilder();

        for(int i = 0; i < getWord().length(); i++ ){
            char wordChar = getWord().charAt(i);
            char encrypted =  (char) (wordChar + getKey());
            encryptedText.append(encrypted);
        }
        return encryptedText.toString();

    }

}
