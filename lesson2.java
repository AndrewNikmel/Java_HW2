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

public class lesson2 {

    public static void main(String[] args) {
        l2FirstTask l2FirstTask = new l2FirstTask();
        l2FirstTask.getResult();
    }
}