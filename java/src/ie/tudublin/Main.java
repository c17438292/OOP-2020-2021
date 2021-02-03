package ie.tudublin;

public class Main {

    public void helloProcessing1() {
        String[] a = { "MAIN" };
        processing.core.PApplet.runSketch(a, new HelloProcessing1());
    }

    public void helloProcessing2() {
        String[] a = { "MAIN" };
        processing.core.PApplet.runSketch(a, new HelloProcessing2());
    }

    public void bugZap() {
        String[] a = { "MAIN" };
        processing.core.PApplet.runSketch(a, new BugZap());
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.bugZap();
    }
}