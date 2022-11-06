import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   Person person1=new Person();
    person1.setName("Aigul");
    person1.setSurname("Kurmanova");
    person1.setAge(18);

    Person person2=new Person();
    person2.setName("Aibek");
    person2.setSurname("Nurbekov");
    person2.setAge(25);

    Person person3=new Person();
    person3.setName("Gulzina");
    person3.setSurname("Zhumalieva");
    person3.setAge(18);



    String [] names=new String[]{person1.getName(),person2.getName(),person3.getName()};
    String [] surnames=new String[]{person1.getSurname(),person2.getSurname(),person3.getSurname()};
    int [] ages=new int[]{person1.getAge(),person2.getAge(),person3.getAge()};
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(surnames));
        System.out.println(Arrays.toString(ages));

        Car car1=new Car();
        car1.setModel("BMW");
        car1.setColour("black");
        Car car2=new Car();
        car2.setModel("Tesla");
        car2.setColour("white");
        Car car3=new Car();
        car3.setModel("Ford");
        car3.setColour("red");
        String[] models=new String[] {car1.getModel(), car2.getModel(), car3.getModel()};
        String[] colours=new String[] {car1.getColour(), car2.getColour(), car3.getColour()};
        System.out.println(Arrays.toString(models));
        System.out.println(Arrays.toString(colours));


        School school1=new School();
        school1.setName("Sapat");
        school1.setRegion("Osh");
        School school2=new School();
        school2.setName("A.Moldokeev");
        school2.setRegion("Naryn");
        School school3=new School();
        school3.setName("61");
        school3.setRegion("Bishkek");
        String[] namesofschools=new String[]{school1.getName(), school2.getName(), school3.getName()};
        String[] regions=new String[]{school1.getRegion(), school2.getRegion(), school3.getRegion()};
        System.out.println(Arrays.toString(namesofschools));
        System.out.println(Arrays.toString(regions));


        University university1=new University();
        university1.setName("AUCA");
        university1.setRegion("Bishkek");
        University university2=new University();
        university2.setName("Manas");
        university2.setRegion("Chui");
        University university3=new University();
        university3.setName("Arabaeva");
        university3.setRegion("Bishkek");
        String[] namesofuniversities=new String[]{university1.getName(), university2.getName(), university3.getName()};
        String[] regionofuniversities=new String[]{university1.getRegion(), university2.getRegion(), university3.getRegion()};
        System.out.println(Arrays.toString(namesofuniversities));
        System.out.println(Arrays.toString(regionofuniversities));
    }
}






































