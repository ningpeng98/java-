class Outter{
    private String outName;
    private int outAge;

    class Inner{
        private int InnerAge;
        public Inner(){
            Outter.this.outName = "I am Outter class";
            Outter.this.outAge = 20;
        }
        public void display(){
            System.out.println(outName);
            System.out.println(outAge);

        }
    }
}

public  class Test{
    public static void main(String[] args){
        Outter.Inner inner = new Outter().new Inner();
        inner.display();
    }
}