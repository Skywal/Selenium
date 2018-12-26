package Content;

import java.util.ArrayList;

public class WebContentParser {
    ArrayList<DictionaryItem> wordsList;

    public WebContentParser(){
        wordsList = new ArrayList<DictionaryItem>();
    }

    public void addNewWord(String word, String trnascriptionEn){
        wordsList.add(new DictionaryItem());
    }
}
