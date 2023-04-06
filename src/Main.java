import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Map<String, String> person = new HashMap<String,String>();
        person.put("name","Ivanov");
        person.put("country","Russia");
        person.put("city","Moscow");
        person.put("age",null);
        System.out.println(getQuery(person));
    }
    public static String getQuery(Map<String, String> params)
    {
        StringBuilder s = new StringBuilder();
        for (Map.Entry<String,String> pair : params.entrySet())
        {
            if (pair.getValue() != null)
            {
                s.append(pair.getKey() +" = '" + pair.getValue()+"' and ");
            }
        }
        s.delete(s.toString().length()-5,s.toString().length());
        return s.toString();
    }

}