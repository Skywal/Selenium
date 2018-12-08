package FileWork;

import java.io.*;

public class ReadFromFile {
    //region fields
    /**
     * read file into bytes
     */
    FileInputStream fileInputStream; //read file into bytes
    /**
     * read bytes and converts them to characters
     */
    InputStreamReader inputStreamReader; //read bytes and converts them to characters
    /**
     * buffer
     */
    BufferedReader bufferedReader; //buffer

    StringBuilder contentBuilder;
    /**
     * path to file
     */
    String filePath; //path to file
    /**
     * string would read from file line by line
     */
    String line; //string would read from file line by line
    //endregion

    //region construct
    public ReadFromFile(String filePath) {
        initialize();
        defaultValue(filePath);
    }

    private void initialize(){
        contentBuilder = new StringBuilder();
    }

    private void defaultValue(String filePath){
        this.filePath = filePath;
    }
    //endregion

    //region external

    /**
     * Read file and return a string like in file
     * @return
     */
    public String readLineByLineCommonPattern(){
        try{
            if(isStringExists(filePath)) {
                initFileInpStream(filePath);
                initInpStreamReader(fileInputStream);
                initBufferedReader(inputStreamReader);
            }
//            fileInputStream = new FileInputStream(filePath);
//            inputStreamReader = new InputStreamReader(fileInputStream);
//            bufferedReader = new BufferedReader(inputStreamReader);

            while ((line = bufferedReader.readLine()) != null)
                contentBuilder.append(line).append("\n");

        }
        catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        catch (IOException ioex){
            System.out.println(ioex.getMessage());
        }
        finally {
            closeFileInpStream();
            closeInpStreamReader();
            closeBufferedReader();
        }

        return contentBuilder.toString();
    }
    //endregion

    //region boolean
    private boolean isStringExists(String str){
        return str != null;
    }
    //endregion

    //region internal

    /**
     * Init file input stream obj with file path
     * @param filePath path to file you want to read from
     */
    private void initFileInpStream(String filePath){
        try{
            fileInputStream = new FileInputStream(filePath);
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }

    /**
     * Init input stream reader exemplar with FileInputStream obj
     * @param fileInputStream initialized obj
     */
    private void initInpStreamReader(FileInputStream fileInputStream){
        inputStreamReader = new InputStreamReader(fileInputStream);
    }

    /**
     * Init BufferedReader exemplar
     * @param inputStreamReader
     */
    private void initBufferedReader(InputStreamReader inputStreamReader){
        bufferedReader = new BufferedReader(inputStreamReader);
    }

    /**
     * Close file input stream
     */
    private void closeFileInpStream(){
        try {
            fileInputStream.close();
        }catch (IOException ioex){
            System.out.println("Problem while closing fileInputStream: " + ioex.getMessage());
        }
    }

    /**
     * close input stream reader
     */
    private void closeInpStreamReader(){
        try {
            inputStreamReader.close();
        }catch (IOException ioex){
            System.out.println("Problem while closing inputStreamReader: " + ioex.getMessage());
        }
    }

    /**
     * close buffered reader
     */
    private void closeBufferedReader(){
        try {
            bufferedReader.close();
        }catch (IOException ioex){
            System.out.println("Problem while closing bufferedReader: " + ioex.getMessage());
        }
    }
    //endregion

}
