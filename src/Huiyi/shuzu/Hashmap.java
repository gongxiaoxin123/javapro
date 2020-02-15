package Huiyi.shuzu;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    /*
    * hashmap key的值不可以重复，
    * key重复后写的覆盖前面的
    * value可以重复
    * */
    public static void main(String[] args) {
        Map<String,String> map=new HashMap(  );
        map.put( "001","sad" );
        map.put( "002","wwww" );
        map.put("003","wwwa" );
        Set<String> keys=map.keySet();
        for(String st:keys){
            System.out.println(map.get( st ));

        }
        System.out.println(map.keySet());
        System.out.println(map.get( "001" ));
    }
}
