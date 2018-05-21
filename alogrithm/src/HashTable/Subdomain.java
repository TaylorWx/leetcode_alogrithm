package HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wangxin on 2018/4/24.
 */
public class Subdomain {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String,Integer> map=new HashMap<>();
       for(String string:cpdomains){
           String[] str=string.split(" ");
           int count=Integer.valueOf(str[0]);
           String[] ss=str[1].split("\\.");
           String temp="";
           for(int i=ss.length-1;i>=0;i--){
               temp=ss[i] + (temp.equals("")?temp:".")+temp;
               if(!map.containsKey(temp)){
                   map.put(temp,count);
               }else{
                   map.put(temp,map.get(temp)+count);
               }
           }
       }
       List<String> list=new ArrayList<>();
        for(String key:map.keySet()){
            list.add(map.get(key)+" "+key);
        }
       return list;

    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();
        String str="goole.mail.com";
    }
}
