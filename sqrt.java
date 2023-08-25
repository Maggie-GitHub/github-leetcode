public class sqrt {
   public int mySqrt(int x) {
        long i = 0;
        while(x >= i * i){
            i++;
        }
        return (int)i-1;
   }
}
