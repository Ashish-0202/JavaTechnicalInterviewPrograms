package CollectionFrameworkQA;

public class ConcurrentHashMap extends Thread{

    static java.util.concurrent.ConcurrentHashMap<Integer,String> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<>();

    public void run(){
        try {
            Thread.sleep(1000);
            concurrentHashMap.put(103,"D");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        concurrentHashMap.put(100,"A");
        concurrentHashMap.put(101,"B");
        concurrentHashMap.put(102,"C");

        ConcurrentHashMap map = new ConcurrentHashMap();

        map.start();

        for(Object o: concurrentHashMap.entrySet()){
            Object s=o;
            System.out.println(s);
            Thread.sleep(1000);
        }
    }
}
