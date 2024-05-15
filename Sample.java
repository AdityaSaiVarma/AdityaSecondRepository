public class Sample
{
     int a=10;
    static int b=20;
    private int c=30;
    public static void main(String[] args){
        Sample s = new Sample();
        System.out.println(s.a);
        System.out.println(b);
        System.out.println("Arg val is:"+args);
    }
}
