package lesson7;


public class VowesUtils {


    public static int numberOfVowelss (String text){
        String bukva = "аеёиоуэюяы";
        int bukvaa = 0;
        for (int i = 0; i < text.length(); i++){
            if (bukva.contains(text.charAt(i) + "")){
                bukvaa++;
            }
        }
        return bukvaa;
    }
    public static int numberOfVowels(String text) {
        char[] glasnBukva = {'а', 'е', 'ё', 'и', 'о', 'у', 'э', 'ю', 'я', 'ы'};
        char[] char_str = text.toCharArray();
        int bukva = 0;
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < glasnBukva.length; j++) {
                if (char_str[i] == glasnBukva[j])
                    bukva++;
            }
        }
        return bukva;
    }

    public static void reverseText (String text){
        String reversed = new StringBuilder(new String(text)).reverse().toString();
        System.out.println(reversed);
    }

    public static void signsPunctuation (String text){
        char[] punctuation = {'!', ',', '.', '?', ';', ':', '-', '"' }; //'.', '?', ';', ':', '-', '"'
        char[] arrPunctuation = text.toCharArray();
        int howManyPunctuationMarks = 0;
        for (int i = 0; i < arrPunctuation.length; i++){
            for (int j = 0; j < punctuation.length; j++){
                if (arrPunctuation[i] == punctuation[i])
                    howManyPunctuationMarks++;
            }
        }
        System.out.println(howManyPunctuationMarks);
    }




}