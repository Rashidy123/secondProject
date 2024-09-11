import org.w3c.dom.ls.LSOutput;

public interface AnimalBehavior {
    void eat();
    void sleep();
    void makeSound();
    public static abstract class Animal implements AnimalBehavior {
        protected String name;
        protected int age;

        public Animal(String name,int age){
            this.name=name;
            this.age=age;
        }
        public void sleep(){
            System.out.println("The Animal is sleeping");
        }
        public abstract void displayInformation();
    }
    public abstract class Mammal extends Animal{
        public Mammal(String name,int age){
            super(name,age);
        }
       public abstract void eat();


       public abstract void makeSound();

       }
       public class Lion extends Mammal{
        public Lion(String name,int age){
            super(name,age);
        }
           public void eat(){
               System.out.println("The loin is eating meat");
           }
           public void makeSound(){
               System.out.println("The lion is roars.");
           }
           public void displayInformation(){
               System.out.println("Lion name: "+name+", age: "+age);
           }

       }
       public class Elephant extends Mammal{
        public Elephant(String name,int age){
            super(name,age);
        }
           public void eat(){
               System.out.println("The elephant eat planet");
           }
           public void makeSound(){
               System.out.println("trumpets");
           }
           public void displayInformation(){
               System.out.println("Elephant name: "+name+", age: "+age);
           }

       }

    public abstract class Bird extends Animal{
        public Bird(String name,int age){
            super(name,age);
        }
        public abstract void eat();

        public abstract void makeSound();
    }

        public class Parrot extends Bird{
        public Parrot(String name,int age){
            super(name,age);
        }
        public void eat(){
            System.out.println("The parrot eat seeds.");
        }
        public void makeSound(){
            System.out.println("squawks.");
        }
        public void displayInformation(){
            System.out.println("Parrot name: "+name+", age: "+age);
        }

        }
        public class Eagle extends Bird{
        public Eagle(String name,int age){
            super(name,age);
        }
        public void eat(){
            System.out.println("The eagle is eating fish.");
        }
        public void makeSound(){
            System.out.println("screeches.");
        }
        public void displayInformation(){
            System.out.println("Eagle name: "+ name+", age: "+age);
        }

        }

    public static void main(String[] args) {
        Lion lion=new Lion("Lion",5);
        lion.eat();
        lion.makeSound();
        lion.displayInformation();
        lion.sleep();
        System.out.println("***********");
        Elephant elephant=new Elephant("Elephant",10);
        elephant.eat();
        elephant.makeSound();
        elephant.displayInformation();
        elephant.sleep();
        System.out.println("********");
        Parrot parrot=new Parrot("parrot",2);
        parrot.eat();
        parrot.makeSound();
        parrot.displayInformation();
        parrot.sleep();
        System.out.println("*********");
        Eagle eagle=new Eagle("Eagle",3);
        eagle.eat();
        eagle.makeSound();
        eagle.displayInformation();
        eagle.sleep();




    }

    }

