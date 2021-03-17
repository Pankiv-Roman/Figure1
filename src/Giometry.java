public class Giometry {
    private Figure figure;

    public Giometry(Figure figure){
        this.figure = figure;
    }

    void PlayFigure(){
        figure.color();
        figure.draw();
    }
}
