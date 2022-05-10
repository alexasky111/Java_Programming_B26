package day05_05_09_2022;

public class Dog extends Animal{
    String breed;
    int humanYears;

    public Dog(String name, int age,String breed){
        super(name,age);
        this.breed=breed;
        getAgeInHumanYears();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", humanYears=" + humanYears +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int getAgeInHumanYears(){
       if(age<=2){
           humanYears=age*11;
       }else{
           humanYears=22+((age-2)*5);
       }
       return humanYears;
    }

    public boolean equals(Dog dog){
        return this.age == dog.age && this.breed.equals(dog.breed) && this.name.equals(dog.name);
    }
}
