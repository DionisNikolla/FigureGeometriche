
public class Rettangolo extends Forma {

    private double lunghezza;
    private double altezza;

    public Rettangolo(double lunghezza, double altezza) {

        this.lunghezza = lunghezza;
        this.altezza = altezza;
    }

    public double area() {
        return lunghezza * altezza;
    }

    public double perimetro() {
        return (lunghezza + altezza) * 2;
    }
}

public class Cerchio extends Forma {

    private double raggio;

    public Cerchio(double raggio) {

        this.raggio = raggio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(raggio, 2);
    }

    @Override
    public double perimetro() {
        return calcolaPerimetro();
    }

    private double calcolaPerimetro() {
        return 2 * Math.PI * raggio;
    }
}