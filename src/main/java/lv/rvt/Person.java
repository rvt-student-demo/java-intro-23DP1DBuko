package lv.rvt; 
 
public class Person { 
    private String name; 
    private int age; 
    private int weight; 
    private int height; 
    
    // All args constructor
    public Person(String name, int age, int weight, int height) { 
        this.name = name; 
        this.age = age; 
        this.weight = weight; 
        this.height = height; 
    } 
    
    // Second constructor with only one parameter
    public Person(String name) {
        // this(name, 0, 0, 0);
        this.name = name;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
    }

    public Person(String name, String age, String weight, String height){
        this.name = name;
    }

    public void growOlder() {
        this.age = this.age + 1;
    }
    
    public void growOlder(int years) {
        this.age = this.age + years;
    }
 
    public int returnAge() { 
        return this.age; 
    } 
 
    public boolean isOfLegalAge() { 
        return this.age <= 18; 
    } 
 
    public String getName() { 
        return this.name; 
    } 
 
    @Override 
    public String toString() { 
        return this.name + ", age " + this.age + " years"; 
    } 
     
    public void printPerson() { 
        System.out.println(this.name + ", age " + this.age + " years"); 
    } 
 
    public void setHeight(int newHeight) { 
        this.height = newHeight; 
    } 
 
    public void setWeight(int newWeight) { 
        this.weight = newWeight; 
    } 
 
    public double bodyMassIndex() { 
        double heigthPerHundred = this.height / 100.0; 
        return this.weight / (heigthPerHundred * heigthPerHundred); 
    } 
     
}