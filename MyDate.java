public class MyDate {
    private int day;
    private int month;
    private int year;
    public MyDate(int d, int m, int y){
        this.day=d;
        this.month=m;
        this.year=y;
    }
    public void printDay(){
        System.out.println("Day "+this.day);
    }
    public void printMonth(){
        System.out.println("Month "+this.month);
    }
    public void printYear(){
        System.out.println("Nam "+this.day+" - " +this.month+" - "+this.year);
    }
    public class Main{
        public static void main(String[] args) {
            int d;
            MyDate md = new MyDate(25,2,2029);
            md.printDay();
            md.printMonth();
            md.printYear();
        }



    }

}

