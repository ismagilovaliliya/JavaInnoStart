package builder.pattern;

public class Human {
    private int age;
    private String firstname;
    private String lastName;
    private boolean isFinishedCourse;
    public Human() {
    }
    public Human(int age, String firstname, String lastName, boolean isFinishedCourse) {
        this.age = age;
        this.firstname = firstname;
        this.lastName = lastName;
        this.isFinishedCourse = isFinishedCourse;

        /*this(age, firstname,lastName,isFinishedCourse);*/
    }

    public Human age(int age) {
        this.age = age;
        return this;
    }
    public Human firstname(String firstname) {
        this.firstname = firstname;
        return this;
    }
    public Human lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    public Human isFinishedCourse(boolean isFinishedCourse) {
        this.isFinishedCourse = isFinishedCourse;
        return this;
    }

    public int getAge(){
        return age;
    }

    public String getFirstName(){
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean getIsFinishedCourse() {
        return isFinishedCourse;
    }


    /*public String getHuman(Human human) {
        String text = System.out.println("First name: " + human.getFirstName() + ",last name: " + human.getLastName() + ",age: " + human.getAge() + ", isFinishedCourse: " + human.getIsFinishedCourse());

        return System.out.println("First name: " + human.getFirstName() + ",last name: " + human.getLastName() + ",age: " + human.getAge() + ", isFinishedCourse: " + human.getIsFinishedCourse());
    }*/

}
