package OnlineWork;

import Final.Strings;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Parser {
    //region fields
    /**
     * downloaded web-page to work with
     */
    Document webPage;
    //endregion

    //region public
    public void parseWebPage(){
        try {
            Document doc = Jsoup.connect(Strings.URL_BASE_DICTIONARY + "cant").get();
            String title = doc.title();
            System.out.println(title);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    //endregion
}
