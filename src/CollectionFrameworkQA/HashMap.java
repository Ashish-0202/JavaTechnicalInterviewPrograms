package CollectionFrameworkQA;

import java.util.Map;

public class HashMap extends Thread{
    static java.util.HashMap<String,Integer> map = new java.util.HashMap<>();

    public void run(){
        try{
            Thread.sleep(1000);
            map.put("D",103);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        map.put("A",100);
        map.put("B",101);
        map.put("C",102);
        HashMap map1 = new HashMap();
        map1.start();

        for(Object o : map.entrySet()){
            Object s=o;
            System.out.println(s);
            Thread.sleep(1000);
        }
    }

}
