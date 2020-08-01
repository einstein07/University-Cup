
package university.cup;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/**
 *
 * @author Sindiso
 */
public class UniversityCup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        createShapes();
    }
    
    public static void createShapes(){
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
        
        try (FileReader reader = new FileReader("shapes_file.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray array = new JSONArray();
            array.add(obj);
            System.out.println(array);
            
            
             
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    
    private static void parseShapesObject(JSONObject shape) 
    {
        
    }
        
    }
    

