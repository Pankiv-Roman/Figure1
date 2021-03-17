public class Main {
    public static void main(String[] args) {

        Giometry triangle = new Giometry(new Triangle());
        Giometry circle = new Giometry(new Circle());
        Giometry romb = new Giometry(new Romb());

        triangle.PlayFigure();
        circle.PlayFigure();
        romb.PlayFigure();
    }
}
