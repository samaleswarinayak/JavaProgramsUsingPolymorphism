class Animal {
   public void move() {
      System.out.println("Animals can move");
   }
}
class Dog extends Animal {
   public void move() {
      System.out.println("Dogs can walk and run");
   }
}
class Puppy extends Dog {
   public void move() {
      System.out.println("Puppy can move.");
   }
}
class TesterPolyMultiLevel {
   public static void main(String args[]) {
      Animal a; // Animal reference and object
      a = new Puppy(); // Animal reference but Puppy object
      a.move(); // runs the method in Animal class
	  a = new Animal();
      a.move(); // runs the method in Puppy class
	  a = new Dog();
	  a.move();
   }
}