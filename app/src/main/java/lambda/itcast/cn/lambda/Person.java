package lambda.itcast.cn.lambda;

import android.util.Log;

import java.time.LocalDate;

/**
 * male 男   female 女
 */
public class Person {
    public static final String TAG = "lambda";

    public enum Sex {
        MALE, FEMALE
    }

    private int age;
    public Person(){}

    public Person(int age) {
        this.age = age;
    }

    public Person(int age, String name, Sex gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    LocalDate birthday;
    Sex gender;

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    String emailAddress;

    //打印Person的信息
    public void printPerson() {
        Log.e(TAG, "姓名_____" + name + "   年龄________" + age + "   sex____" + gender.name());
    }
}
