package Java5.uzduotys;

public class Devinta {
    public static void main(String[] args) {
        String[] words = {"abc", "labas", "zalgiris", "laimes"};
        String longestWord = longestWord(words);
        System.out.println("Ilgiausias zodis " + longestWord);
    }


static String longestWord(String[] words) {
    String longestWord = "";

    for( int i = 0; i < words.length ; i++) {
        if(words[i].length() > longestWord.length() ) {
            longestWord = words[i];
        }
    }
    return longestWord;
}

}
