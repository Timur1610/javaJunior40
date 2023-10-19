//package lesson7;
//
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class StringUtils {
//
//    //метод который принимает входящим параметром email
//    //делает проверку на валидацию
//    //и пишет на консоль корректный это email или нет
//
//    public static void checkValidMail(String email){
//
//        /** timur428455@gmail.com
//         *
//         * 1) Проверяем содержание собачки. Если ее нет - не валидный
//         * 2) Собачка только одна. Если их несколько - не валидный
//         * 3) Собачка должна стоять не в начале и не в конце. Если нет - не валидный
//         * 4) Должна быть хотя бы одна точка после собачки
//         * 5) Точка после собачки не может быть в начале или в конце
//         * 6)
//         * 7)
//         * добавить разные проверки
//         */
//
//        if (!email.contains("@")){
//            System.out.println("Email не содержит собачку");
//            return;
//        }
//
//        String[] partOfEmail = email.split("@");
//        if (partOfEmail.length > 2){
//            System.out.println("Собачек больше одной");
//            return;
//        }
//
//        if (email.startsWith("@") || email.endsWith("@")){
//            System.out.println("Email не может начинаться или заканчиваться собачкой");
//            return;
//        }
//
//        String lastPart = partOfEmail[1];
//        if (!lastPart.contains(".")){
//            System.out.println("email не содержит точку после собачки");
//            return;
//        }
//
////        Pattern patlatletter = Pattern.compile("[a-zA-Z]{1}");
////        if (!Pattern.compile("[a-zA-Z]{1}")){
//
//
//        }
////
////        System.out.println("email верный");
//    }
//
//}
