//TODO:I've tried to process input.json file and store it as an items but couldn't achieve it.

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;

public class ReadJSONInput {

    public static void main(String[] args) {

        try {
            Object obj = new JSONParser().parse(new FileReader("/Users/yasinmogultay/Desktop/VendingMachine/src/main/java/input.json"));

            // A JSON object. Key value pairs are unordered. JSONObject supports java.util.Map interface.
            JSONObject jsonObject = (JSONObject) obj;

            // A JSON array. JSONObject supports java.util.List interface.
            JSONArray itemList = (JSONArray) jsonObject.get("items");
            ArrayList<Object> listdata = new ArrayList<Object>();
            if (itemList != null) {
                for (int i = 0; i < itemList.size(); i++) {
                    listdata.add(itemList.get(i));
                }
            }


            for (int i = 0; i < listdata.size(); i++) {
                //Printing each element of ArrayList
                System.out.println(listdata.get(i));
            }

//            // An iterator over a collection. Iterator takes the place of Enumeration in the Java Collections Framework.
//            // Iterators differ from enumerations in two ways:
//            // 1. Iterators allow the caller to remove elements from the underlying collection during the iteration with well-defined semantics.
//            // 2. Method names have been improved.
//            Iterator<JSONObject> iterator = itemList.iterator();
//            while (iterator.hasNext()) {
//                System.out.println(iterator.next());
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
