package study.note04.objectOriented04;/*
 *@Auther: wzy
 *@Date:2021/12/30 -12-30
 *@Descreption: study.note04
 *@Version: 1.0
 */

public class person {
    protected String name;
    protected int age;

    public person() {
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public  void drink(){
        System.out.println("person drink");
    }
}
