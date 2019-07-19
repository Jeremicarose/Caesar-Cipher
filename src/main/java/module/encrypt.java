package module;

public class encrypt {
    private String word;
    private int key;

    public encrypt(String word,int key){
        this.word = word;
        this.key = key;
    }
    public String getWord(){
        return word;
    }
    public int getKey(){
        return key;
    }
}
