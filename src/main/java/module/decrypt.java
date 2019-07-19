package module;

public class decrypt {
    private String word;
    private int key;

    public decrypt(String word,int key){
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

