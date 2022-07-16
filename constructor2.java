class Geek {
    int num;
    String name;
int id;
 
    // this would be invoked while an object
    // of that class is created.
    Geek() { System.out.println("Constructor called"); }
  Geek(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
}

 
class GFG {
    public static void main(String[] args)
    {
        // this would invoke default constructor.
        Geek geek= new Geek();
 
        // Default constructor provides the default
        // values to the object like 0, null
        System.out.println(geek.name);
        System.out.println(geek.num);
 
        System.out.println("GeekName :" + geek.name
                           + " and GeekId :" + geek.id);
    }
}