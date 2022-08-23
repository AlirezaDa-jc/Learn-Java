package method;

/**
 * Created By Alireza Dolatabadi
 * Date: 8/1/2022
 * Time: 9:06 PM
 */
class Person {
    //data
    //method
    String name;
    int age;

    int ageIncrement() {
        age++;
        return age;
    }

    void speak(String sentence){
        System.out.println(sentence);
    }

    void speakSentences(String sentence, int  count){
        while (count != 0) {
            System.out.println(sentence);
            count--;
        }
    }

}

public class MethodTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Alireza";
        person.age = 21;
        int i = person.ageIncrement();
        System.out.println("Happy Birthday ! Your new Age is " + i);
        String sentence = "I am a Person";
//        person.speak(sentence);
        person.speakSentences(sentence , 3);
    }
}
