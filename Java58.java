 public class Animal{
  void eat()
  {
   System.out.println("eating..");
   }
   
  public class Dog extends Animals{
    void eat(){
     System.out.println("eating bread..");}
    void bark(){
     System.out.println("barking..");
    void work(){
       super.eat();
       bark();
       eat();}
  
       
 }
class Java58{
 public static void main(String args[]){
   Dog d = new Dog();
   d.work();
  }
}
 
