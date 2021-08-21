package sixstar.demo04;

public class Body {
    private String name;

    public void methodBody(){
        new Heart().beat();
    }

    public class Heart{

        private int num;
        public void beat(){
            this.setNum(10);
            System.out.println("heart num is"+ this.num);
        }
        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }
    }
}
