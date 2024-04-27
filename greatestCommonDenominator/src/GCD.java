public class GCD {
    public static int forLoop(int x, int y){
        int smaller;
        x = Math.abs(x);
        y = Math.abs(y);
        if(x < y){
            smaller = x;
        }
        else{
            smaller = y;
        }
        int gcd = 1;
        for(int i = 2; i < smaller+1; ++i){
            if(x % i == 0 && y%i == 0){
                gcd = i;
            }
        }
        return gcd;
    }

    public static int whileLoop(int x, int y){
        while(true){
            if(x < y){
                y = y - x;
            }
            else if (y < x){
                x = x -y;
            }
            else{
                return x;
            }
        }
    }

    public static int recursion(int x, int y){
        if(y == 0){
            return x;
        }
        else{
            return recursion(y, x %y);
        }

    }
}
