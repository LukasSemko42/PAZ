package sk.upjs.paz;

import sk.upjs.jpaz2.Turtle;

public class ExamTurtle extends Turtle {
    public int sumOfSmallerDigits(int n, int maxDigit){
        int result=0;
        while (n>=1){
            if (n%10 < maxDigit){
                result += n%10;
            }
            n=n/10;
        }
        return result;
    }
//    PISOMKA 3:
//    public boolean isPerfectNumber(int n){
//        int sucet=0;
//        for (int i = 1; i <= n; i++) {
//            if (n%i==0){
//                sucet+=i;
//            }
//        }
//        if (sucet==(2*n)){
//            return true;
//        } else return false;
//    }
}
