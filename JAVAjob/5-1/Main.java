import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main{
public static void main(String[] args) {
    
    List<String> array = new ArrayList<>();
    array.add("hoge");
    array.add("pos");
    array.add("foo");
    
    array.set(1, "bar");
    
    int index = array.indexOf("foo");
    System.out.println("fooのインデックス:" + index);



{
    {
//      問④ キーがString型、バリューがObject型の要素を三つ格納しましょう。
        Map<String, Object> map = new HashMap<>();
        map.put("addres", "/////");
        map.put("name", "kosuke");
        map.put("age", 29);
        
        
        
    
        
        
//  　<以下記述>

//      問⑤上記で格納したキーを繰り返し文で出力しましょう。
//      <以下記述> 
        Set<String> keys = map.keySet();
        for(String key : keys) {
            System.out.println("key:" + key);
        }
        

//      問⑥上記で格納したバリューを繰り返し文で出力しましょう。
//      <以下記述>
        
        for(Object val : map.values()) {
            System.out.println("val:" + val);
        }
//      問⑦ Calender型calを使い、int型配列arrayDateに今の年・月・日を入れてください。
           Calendar cal = Calendar.getInstance();
           
           int year = cal.get(Calendar.YEAR);
           int month = cal.get(Calendar.MONTH) + 1;
           int day = cal.get(Calendar.DAY_OF_MONTH);
           int[] arrayDate = {year, month, day};

           
           System.out.println("年: " + arrayDate[0]);
           System.out.println("月: " + arrayDate[1]);
           System.out.println("日: " + arrayDate[2]);
       
           
//      <以下記述>
//      問⑧ 配列arrayDateをList型に置換
//      ヒント：asListメソッドはプリミティブ型のデータ型のみ扱えます。
    List<Integer> date = new ArrayList<>();
    date.add(year);
    date.add(month);
    date.add(day);

           
           
//      <以下記述>
//      問⑨ 上記で格納した要素を繰り返しで出力しましょう。
//      <以下記述>
    for (Integer n : date) {
        System.out.println(n);
    }
          
    }    }

    }
}
