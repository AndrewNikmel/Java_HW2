// // Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// // Данные для фильтрации приведены ниже в виде json-строки.
// // Если значение null, то параметр не должен попадать в запрос.

// // Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

// import java.util.HashMap;
// import java.util.Map;

// public class homework2 {

// /* 
// Формируем WHERE
// */
//     public static void main(String[] args) {
//         Map<String, String> params1 = new HashMap<String,String>();
//         params1.put("name","Ivanov");
//         params1.put("country","Russia");
//         params1.put("city","Moscow");
//         params1.put("age",null);
//         System.out.println(getQuery(params1));
//     }
//     public static String getQuery(Map<String, String> params)
//     {
//         StringBuilder s = new StringBuilder();
//         for (Map.Entry<String,String> pair : params.entrySet())
//         {
//             if (pair.getValue() != null)
//             {
//                 s.append(pair.getKey() +" = '" + pair.getValue()+"' and ");
//             }
//         }
//         s.delete(s.toString().length()-5,s.toString().length());
//         return s.toString();
//     }

// }


import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class homework2 {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        Logger logger = Logger.getLogger("BubbleSortLog");
        FileHandler fh;

        try {
            // Указываем путь и имя файла для лога
            fh = new FileHandler("bubble_sort.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            logger.info("Начинаем наш массив: " + Arrays.toString(arr));

            int n = arr.length;

            // Проходим по массиву несколько раз
            for (int i = 0; i < n; i++) {
                // Флаг, указывающий, была ли произведена перестановка на текущей итерации
                boolean swapped = false;

                // Проходим по массиву от начала до конца, меняя местами соседние элементы, если нужно
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }

                // Если на текущей итерации не было перестановок, массив уже отсортирован
                if (!swapped) {
                    break;
                }

                logger.info("Итерация " + (i + 1) + ": " + Arrays.toString(arr));
            }

            logger.info("Массив после сортировки: " + Arrays.toString(arr));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}