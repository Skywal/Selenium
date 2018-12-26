import FileWork.ReadFromFile;
import Final.Strings;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class BotForDictionary {

    public static void main(String[] args){


        try {
            Document doc = Jsoup.connect(Strings.URL_BASE_DICTIONARY + "cant").get();
            String title = doc.title();
            System.out.println(title);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
