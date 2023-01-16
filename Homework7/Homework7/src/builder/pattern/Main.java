package builder.pattern;

public class Main {

    public static void main(String[] args) {

        Human human = new Human();
        human.firstname("Liliya").lastName("Ismagilova").age(27).isFinishedCourse(false);
        System.out.println("First name: " + human.getFirstName() + ",last name: " + human.getLastName() + ",age: " + human.getAge() + ", isFinishedCourse: " + human.getIsFinishedCourse());

        Human human2 = new Human();
        human2.firstname("Ildar").age(22).isFinishedCourse(true);
        System.out.println("First name: " + human2.getFirstName() + ",last name: " + human2.getLastName() + ",age: " + human2.getAge() + ", isFinishedCourse: " + human2.getIsFinishedCourse());



        Example example = new Example();
        example.append("hi").append("hoe are you");
        System.out.println(example.getText());
    }
}
