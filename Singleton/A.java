package Singleton;

public class A {
    public static A a= null;// new A();
    private A(){

    }
    public static A getInstance()
    {
        if(a==null)
        {
            synchronized (A.class)
            {
                if(a==null)
                {
                    a= new A();
                }
            }
        }
        return a;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
