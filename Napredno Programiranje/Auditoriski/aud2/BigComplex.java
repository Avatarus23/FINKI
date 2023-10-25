package aud2;

//implementacija na metodi za + - * / so koristenje na objekti od klasata BigDecimal
import java.math.BigDecimal;

public class BigComplex {
    private BigDecimal realPart;
    private BigDecimal imaginaryPart;

    public BigComplex() {
    }

    public BigComplex(BigDecimal realPart, BigDecimal imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public BigComplex add(BigComplex complex){
        return new BigComplex(this.realPart.add(complex.realPart),
                this.imaginaryPart.add(complex.imaginaryPart));
    }
    public BigComplex subtract(BigComplex complex){
        return new BigComplex(this.realPart.subtract(complex.realPart),
                this.imaginaryPart.subtract(complex.imaginaryPart));
    }
    public BigComplex multiply(BigComplex complex){
        return new BigComplex(this.realPart.multiply(complex.realPart),
                this.imaginaryPart.multiply(complex.imaginaryPart));
    }
    public BigComplex divide(BigComplex complex){
        return new BigComplex(this.realPart.divide(complex.realPart),
                this.imaginaryPart.divide(complex.imaginaryPart));
    }

}
