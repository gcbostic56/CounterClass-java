

public class App {
    
    public static void main(String[] args) throws Exception {
    Counter newCounter = new Counter(5);
    System.out.println(newCounter.toString());
    Counter otherCount = new Counter();
    System.out.println(otherCount.toString());
    System.out.println(newCounter.value());
    newCounter.increase();
    otherCount.decrease();
    System.out.println(newCounter.toString());
    System.out.println(otherCount.toString());
    newCounter.increaseBy(5);
    otherCount.decreaseBy(10);
    System.out.println(newCounter.toString());
    System.out.println(otherCount.toString());    
    }
   
}
