package Interview_Questions;

public class RealInterviewExample {
    public static void main(String[] args) {
        String name = "Oleksandra";
        int countVowels = 0;
        int countConsonants = 0;
        name = name.toLowerCase();

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                countVowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                countConsonants++;
            }
        }


    }
}
