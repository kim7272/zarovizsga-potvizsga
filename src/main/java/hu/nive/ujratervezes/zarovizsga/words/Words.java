package hu.nive.ujratervezes.zarovizsga.words;

public class Words {

    public boolean hasMoreDigits(String s) {
        int total = s.length();
        int number = 0;
        for (char c: s.toCharArray()) {
            if (Character.isDigit(c)){
                number = number + 1;
            }
        }
        if (number > total - number){
            return true;
        }
        else {
            return false;
        }
    }
}
