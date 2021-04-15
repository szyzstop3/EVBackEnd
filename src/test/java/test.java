import DAO.impl.Userimpl;
import com.alibaba.fastjson.JSONObject;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.junit.jupiter.api.Test;
import vo.User;

import javax.json.Json;
import javax.json.JsonObject;
import java.util.Random;


public class test {

    public static void main(String[] args) {
//            int[] a = new int[]{2,1,5,6,2,3};
//
//        System.out.println(rectangle(a));
//        System.out.println(getRandomString(20));


        JSONObject j1 = new JSONObject();
        j1.put("a","b");

        JSONObject jsonObject = JSONObject.parseObject(j1.toString());
        System.out.println(jsonObject.getString("a"));

    }


    public static String getRandomString(int length){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }


    //暴力求解柱状图最大矩形
    public static int rectangle(int[] arries) {
        int max = 0;

        //i是步长
        for (int i = 0; i < arries.length; i++) {
           for(int left = 0;left<arries.length;left++){
               int right = left+i;
               if(right>=arries.length){
                   continue;
               }

               int n = 0;
               int[] a = new int[right-left+1];
               for(int m=left; m<=right;m++){
                   a[n] = arries[m];
                   n++;
               }

               int min = minn(a);
               if(max< min*(i+1)){
                   max = min*(i+1);
               }

           }

        }
        return max;
    }

    public static int minn(int[] a){

        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if(min > a[i]){
                min = a[i];
            }
        }
        return min;
    }


}
