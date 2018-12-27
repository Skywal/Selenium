package Content;

import java.util.ArrayList;

public class WebContentParser {
    //region fields
    /**
     * full list of words from the web-dictionary
     */
    ArrayList<DictionaryItem> wordsList; //full list of words from the web-dictionary
    //endregion

    //region get/set
    public ArrayList<DictionaryItem> getWordsList() {
        return wordsList;
    }
    //endregion

    //region construct
    public WebContentParser(){
        initialize();
    }

    private void initialize(){
        wordsList = new ArrayList<DictionaryItem>();
    }
    //endregion

    //region public
    public void addNewWord(String word, String transcriptionEn, String transcriptionUs, String example){
        wordsList.add(new DictionaryItem(
                word,
                transcriptionEn,
                transcriptionUs,
                example
        ));
    }
    //endregion
}
