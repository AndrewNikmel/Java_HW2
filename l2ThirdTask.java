import java.util.Scanner;

public class l2ThirdTask {
    String string;

    l2ThirdTask(){
        Scanner in = new Scanner(System.in);
        string = in.next();
        in.close();
    }

    public String reverse(String string){
        String reversedString = "";
        for (int i = string.length()-1; i >= 0; --i) {
            reversedString += string.charAt(i);
        }
        return reversedString;
    }

    public boolean isPalyndrome(String string) {
        return string.equals(reverse(string));
        // if (string.equals(reverse(string))){
        //     System.out.println("Is a Palyndrom");
        // } else {
        //     System.out.println("Is not a Palyndrom");
        // }
    }

    public void getResult(String string){
        if (isPalyndrome(string)) {
            System.out.println("Is a Palyndrom");
        } else {
            System.out.println("Is not a Palyndrom");
    }

}




// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает
// boolean значение).