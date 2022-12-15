package uuu;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;


public class DataBase {
   static Vector<String>mobile=new Vector<String>();
   static Vector<String>payment =new Vector<String>();
   static Vector<String>landline =new Vector<String>();
   static Vector<String>donation= new Vector<String>();

   Map<String,String> users=new HashMap();
   boolean check(String UsrName){
      boolean flag=true;
      for (Map.Entry<String,String> me:users.entrySet()){
         if(me.getKey()==UsrName){
            flag=false;
            break;
         }

      }
      return flag;
   }


}
