import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class BotForDictionary {


    public static void main(String[] args){
        try {
            Document doc = Jsoup.connect("https://dictionary.cambridge.org/dictionary/english/ship").get();
            String title = doc.title();
            System.out.println(title);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
