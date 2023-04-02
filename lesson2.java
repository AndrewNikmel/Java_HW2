/**
 * lesson2
 */
// public class lesson2 {

//     public static void main(String[] args) {
//         String str = "asd";
//         StringBuilder stringBuilder = new StringBuilder("asdasd"); // new StringBuilder() - конструктор
//         // stringbuilder - очень жадный формат.быстр, не создает новых объектов
//         // в отличие от простого стринга создает один объект и работает с ним,
//         // в то время как стринг каждое новое изменение выводит и расценивает как
//         // отдельный объект

//         StringBuffer stringBuffer = new StringBuffer();
//         // безопаснее стрингбилдера, особенно в случаях, когда с объектом (кодом)
//         // работает несколько пользователей, он медленнее стрингБилдера
        
//     }
// }
import java.util.Scanner;

public class lesson2 {

    public static void main(String[] args) {
        // l2FirstTask l2FirstTask = new l2FirstTask();
        // l2FirstTask.getResult();

        // l2SecondTask l2SecondTask = new l2SecondTask();
        // System.out.println(l2SecondTask.getUniqueSequence());

        // StringBuilder stringBuilder = new StringBuilder("abcdefg");
        // System.out.println(stringBuilder);
        // System.out.println(stringBuilder.reverse());
        l2ThirdTask l2ThirdTask = new l2ThirdTask();
        Scanner in = new Scanner(System.in);
        String string = in.next();
        in.close();
        l2ThirdTask.getResult(string);
        System.out.println(isPalyndromeAnottherMethod(string));
    }

    public static Boolean isPalyndromeAnottherMethod(String string){
        return string.equals((new StringBuilder(string)).reverse().toString());
    }
}