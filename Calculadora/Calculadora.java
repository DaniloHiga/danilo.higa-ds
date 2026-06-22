public class Calculadora {
    public double soma(double a, double b) {
        return a + b;
    }
    public double sub(double a, double b) {
        return a - b;
    }
    public double mult(double a, double b) {
        return a * b;
    }
    public double div(double a, double b) {
        if (b == 0) {
            System.out.println("Divisão por zero");
            return 0;
        }
        return a / b;
    }
}