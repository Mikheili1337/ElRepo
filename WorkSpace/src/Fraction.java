public class Fraction {

    private int numerator;
    private int denominator;

    Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator(){return numerator;}

    public int getDenominator(){return denominator;}

    public void gangnamstyle(int n){
        if(n == 0){
            return;
        }

        this.numerator *=n;
        this.denominator *=n;
    }


//    შეეკვეცა
    public int simplify(int numerator,int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        System.out.println("Fraction original: "+ numerator+"/"+denominator);

        int devisor = 0;
        for (int i = numerator; i >= 1; i--) {
            if (numerator % i == 0 && denominator % i == 0) {
                devisor = i;
                break;
            }
        }
        if (devisor != 0) {
            numerator /= devisor;
            denominator /= devisor;

        }

        System.out.println("Fraction simplified: " + numerator + "/" + denominator);

        return devisor;
    }



    @Override
    public String toString() {
        return numerator+"/"+denominator;
    }

    public void printFraction(){
        System.out.println(this.numerator+"/"+this.denominator);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Fraction){
            Fraction f2 = (Fraction) obj;

            if(numerator* f2.denominator == denominator * f2.numerator){
                return true;
            }
        }
        return false;
    }




}
