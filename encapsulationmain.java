public class encapsulationmain{
    public static void  main(String[] args)
    {
        A a=new A();
        System.out.println("Value in var:" + a.getVar());
        a.setVar(100);
        System.out.println("Value in var:" + a.getVar());
        a.setVar(900);
        System.out.println("Value in var:" + a.getVar());
    }
}
