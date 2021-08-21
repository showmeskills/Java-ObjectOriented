package sixstar.demo04;

public class Test {
    public static void main(String...args){
        Body.Heart heart = new Body().new Heart();
        heart.beat();
        Body body = new Body();
        body.methodBody();
    }
}
