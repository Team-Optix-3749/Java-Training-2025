public class Main {
    public static void main(String[]args) {
        
      Pokemon p1 = new Pokemon("Eevee", 25);
      System.out.println(p1.level);
      p1.attack();

      Me p1Me = new Me("Perry", 16);
      System.out.println(p1Me.age);
      p1Me.attack();
    

    }
}

