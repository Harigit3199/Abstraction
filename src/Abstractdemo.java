abstract class Camera
{
    public abstract void lens(int price, String model);// abstract method
}
class Canon extends Camera
{
    public void lens(int price,String model)
    {

        System.out.println("Canon Camera model : "+model);
        System.out.println("Canon camera price  : "+price+" RS");
        System.out.println( );
    }
}
class Sony extends Camera
{
    public void lens(int price,String model)
    {

        System.out.println("Sony camera model :  "+model);
        System.out.println("Sony camera price :  "+price+" RS");
    }
}
public class Abstractdemo
{
    public static void main(String[] args)
    {
        Camera photo= new Canon();
        Camera image= new Sony();

        photo.lens(270000,"A7SIII");
        image.lens(70000,"80D");

    }
}
