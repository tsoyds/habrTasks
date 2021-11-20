package Task4;
// Напишите метод для поиска самой длинной строки в массиве. searchLongString
//Метод проверяющий полиндром - слово, которое будет таким же если его написать наоборот stringPolindrom
//Напишите метод, заменяющий в тексте все вхождения слова Навальный «бяка» на «[вырезано
//цензурой]». censoredString
public class Task_4_2 {
    public static void main(String[] args) {
        String message = "Hello, mr.Valencia, i know that you are STUPID asshole, so fuck you";
        System.out.println(censoredString(message, "fuck"));
        System.out.println(censoredString(message, "STUPID"));
        System.out.println(censoredString(message, "eeee"));

    }

    public static int searchLongString(String[] strings){
        int temp = 0;
        for (int i=0; i<strings.length-1; i++){
            temp=i;
           if (strings[i].length() < strings[i+1].length()){
               temp=i+1;
           }
        }

        return temp;
    }

    public static boolean stringPolindrom (String string){
        boolean statement = true;
        string.toCharArray();
        for (int i=0; i<string.length()/2; i++)
        {   if (string.toCharArray()[i]!=string.toCharArray()[string.length()-1-i]) {
            statement = false;
        }
        }
        return statement;
    }

    public static String censoredString (String stringMain, String string){
        String change = "CENSORED";
        if (stringMain.contains(string) == true) { //Определяем входит ли строка string в stringMain
           stringMain = stringMain.replace(string, change); // меняем вхождение строки string на CENSORED
        }
        return stringMain;
    }
}
