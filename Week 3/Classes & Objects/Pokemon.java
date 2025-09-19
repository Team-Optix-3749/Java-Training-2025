public class Pokemon {

  String name;
  int level;

  Pokemon() {
    level = 1;
  }

  Pokemon(String name, int level){
    this.name = name;
    this.level = level;
  }

  void attack() {
    System.out.println(name + " is attacking!");
  }
  public static
    void main(String[] args) {
    
    Pokemon p1 = new Pokemon();

  }
}
