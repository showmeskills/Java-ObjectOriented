package sixstar.demo03;

public class OutClass {
    private String outClassName;
    public String outClassName1;
    protected String getOutClassName2;
    public void method(){
        new InnerClass().method();
    }
    public class InnerClass{
        private String outClassName;
        public InnerClass(){
            OutClass.this.outClassName = "Terry";
            OutClass.this.outClassName1 = "Terrance";
            OutClass.this.getOutClassName2 = "Terrance" + "Terry";
            this.outClassName = "Terry001";
        };
        public void method(){
            System.out.println("outClassName====>"+OutClass.this.outClassName);
            System.out.println("innerClassName====>"+this.outClassName);
        }
    }
}
