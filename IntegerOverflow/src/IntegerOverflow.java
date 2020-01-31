
public class IntegerOverflow {

    public static void main(String[] args) {
        int x = 2147483644;
        
        System.out.println(x);
        x++;
        System.out.println(x);
        x++;
        System.out.println(x);
        x++;
        System.out.println(x);
        x++;
        System.out.println(x);
        x++;
        System.out.println(x);
        x++;
        System.out.println(x);
        
        System.out.println("-----------");
        
        System.out.println(Integer.MAX_VALUE);
        
        System.out.println("-----------");
        
        System.out.println(Math.sqrt(16));

    }

}
