package ru.mine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordTest {
    String password;
    public PasswordTest(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {
        //PasswordTest pass = new PasswordTest("F032_Password");
        //String password = pass.getPassword();
        String p1 = "F032_Password";
        String p2 = "TrySpy_1";
        String p3 = "A007";
        String p4 = "smart_pass";


        String regexLength = ".{8,}";
        String regexUp = "\\w*[A-Z]+\\w*";
        String regexLower = "\\w*[a-z]+\\w*";
        String regexD = "[0-9]+";



       // String res = "(?=^.{8,}$) ((?=.*\\d)|(?=.*\\W+)) (?![.\n]) (?=.*[A-Z]) (?=.*[a-z]).*";

        String regex = "(?=^.{8,}$)^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\\s).*$";
        //Look-behind — «смотрит» назад, соответственно ставится в начале регулярного выражения.
//Look-ahead — в конце, и «смотрит» вперед.
        //?=^.{8,}$) - в данном утверждении мы смотрим на начало строкии "заглядываем вперед" и проверям что
        //существует любые 8+ символов в строке
        //(?=.*\d) - в данном утверждении мы проверям что в начале строки существуют 0 или больше символов, которые
        // оканчиваются на цифровой символ
        //(?=.*[a-z]) - данное утверждение проверят что в начале строки существеют 0 или больше символов, которые
        // заканчиваются на символы из диапозона a-z
        //(?=.*[A-Z]) - данное утверждение проверят что в начале строки существеют 0 или больше символов, которые
        // заканчиваются на символы из диапозона A-Z
        //(?!.*\s) - данное утверждение проверят что в начале строки существеют 0 или больше символов, которые
        // НЕ заканчиваются на пробел
        //.*$ - означает, что уже не важной какой символ будет после прохождения УТВЕРЖДЕНИЙ выше


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(p1);
        System.out.println(matcher.matches());
        matcher = pattern.matcher(p2);
        System.out.println(matcher.matches());
        matcher = pattern.matcher(p3);
        System.out.println(matcher.matches());
        matcher = pattern.matcher(p4);
        System.out.println(matcher.matches());


    }
}
