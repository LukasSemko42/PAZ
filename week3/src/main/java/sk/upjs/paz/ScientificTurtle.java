package sk.upjs.paz;

import sk.upjs.jpaz2.Turtle;

public class ScientificTurtle extends Turtle {
    public double min(double cislo1, double cislo2){
        if(cislo1<cislo2){
            return cislo1;
        } else {
            return cislo2;
        }
    }
    public long power(int n, int k){
        return n^k;
    }
    public long factorial(int n){
        long vysledok=1;
        while (n!=0){
            vysledok*=n;
            n-=1;
        }
        return vysledok;
    }
    public int countDivisors(int n){
        int count=0;
        for (int i = 1; i <= n; i++) {
            if (n%i==0){
                count++;
            }
        }
        return count;
    }
    public int countDigits(int n){
        if (n==0){
            return 1;
        }
        Math.abs(n);

        int count=0;
        while (n>0){
            n/=10;
            count++;
        }
        return count;
    }
    public boolean isPrime(int n){
        if (n<=0){
            return false;
        }

        int count=0;
        for (int i = 1; i <= n; i++) {
            if (n%i==0){
                count++;
            }
        }
        if (count==2){
            return true;
        } else return false;
    }
    public boolean containsDigit(byte c, int n){
        n = Math.abs(n);
        if (n == 0 && c == 0) {
            return true;
        }
        while (n > 0) {
            if (n % 10 == c) {
                return true;
            }
            n /= 10;
        }
        return false;
    }
    public boolean hasNonincreasingDigits(int n){
        n=Math.abs(n);
        int a = n%10;
        n/=10;
        while (n>0){
            int b = n%10;
            n/=10;
            if (b<a){
                return false;
            }
            a=b;
        }
        return true;
    }
//    public int gcd(int a, int b)
//    public int lcm(int a, int b)

}
