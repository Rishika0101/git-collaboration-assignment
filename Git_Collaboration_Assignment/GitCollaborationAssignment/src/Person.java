public class Person {
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    String name;
    /*original attribute.
     Integer age; */

    //typo mistake
    Integer person_age;



    //This function will return the result,whether a person is adult or not.
    public boolean isAdult(Integer age) {
        if (age >= 18) return true;
        else return false;
    }
}
