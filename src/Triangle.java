public class Triangle implements Figure {
    @Override
    public void color() {
        System.out.println("Blue");
    }

    @Override
    public void draw(){
        System.out.println("Triangle");
    }
}
