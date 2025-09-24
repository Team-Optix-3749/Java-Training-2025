public class Me {

  String name;
  int age;

  Me() {
    age = 16;
  }

  Me(String name, int age){
    this.name = name;
    this.age = age;
  }

  void attack() {
    System.out.println(name + " is attacking!");
  }
  
  public static
    void main(String[] args) {
    
    Me p1Me = new Me();

  }
}
