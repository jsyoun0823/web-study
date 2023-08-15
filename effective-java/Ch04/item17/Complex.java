package item17;

public class Complex {
    private final double re;
    private final double im;

    // 사실상 final
    private Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }
    // 정적 팩터리 (private 생성자와 함께 사용)
    public static Complex valueOf(double re, double im) {
        return new Complex(re, im);
    }

    // 내부에서의 확장이 가능하다. (상속)
    private static class MyComplex extends Complex {
        private MyComplex(double re, double im) {
            super(re, im);
        }
    }

    public double realPart() { return re; }
    public double imaginaryPart() { return im; }

    public Complex plus(Complex c) {
        return new Complex(re + c.re, im + c.im);
    }

    public Complex minus(Complex c) {
        return new Complex(re - c.re, im - c.im);
    }

    public Complex times(Complex c) {
        return new Complex(re * c.re - im * c.im,
                            re * c.im + im * c.im);
    }

    public Complex diviedBy(Complex c) {
        double tmp = c.re * c.re + c.im * c.im;
        return new Complex((re * c.re + im * c.im) / tmp,
                (im * c.re - re * c.im) / tmp);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Complex)) return false;

        Complex c = (Complex) o;
        return Double.compare(c.re, re) == 0
                && Double.compare(c.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return 31 * Double.hashCode(re) + Double.hashCode(im);
    }

    @Override
    public String toString() {
        return "(" + re + " + " + im + "i)";
    }
}