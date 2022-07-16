class Geek {
    int num;
    String name;
int id;
 
    // this would be invoked while an object
    // of that class is created.
   public Geek() { System.out.println("Constructor called"); }
 protected Geek(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
}

 
class GFG {
    public static void main(String[] args)
    {
        // this would invoke default constructor.
        Geek geek1= new Geek();
 
        // Default constructor provides the default
        // values to the object like 0, null
        System.out.println(geek1.name);
        System.out.println(geek1.num);
 Geek geek2= new Geek("pintu",34);
 
 
        System.out.println("GeekName :" + geek2.name
                           + " and GeekId :" + geek2.id);
    }
}