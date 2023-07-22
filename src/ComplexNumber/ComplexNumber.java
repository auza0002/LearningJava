package ComplexNumber;

public class ComplexNumber {
     private double real;
     private double imaginary;

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void add(double real, double imaginary){
        double realResult = this.real + real;
        double imaginaryResult = this.imaginary + imaginary;
        this.real = realResult;
        this.imaginary = imaginaryResult;
    }
    public void add(ComplexNumber number){
        double addingRealPart = number.getReal() + this.real;
        double addingImaginaryPart = number.getImaginary() + this.imaginary;
        this.real = addingRealPart;
        this.imaginary = addingImaginaryPart;
    };
    public void subtract (double real, double imaginary){
        double realResult = -real +  this.real;
        double imaginaryResult = -imaginary + this.imaginary ;
        this.real = realResult;
        this.imaginary = imaginaryResult;
    }
    public void subtract(ComplexNumber number){
        double addingRealPart = this.real -  number.getReal() ;
        double addingImaginaryPart = this.imaginary - number.getImaginary() ;
        this.real = addingRealPart;
        this.imaginary = addingImaginaryPart;
    };
}
