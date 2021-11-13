package Java5.uzduotys;

public class PenktaUzduotis {
    public static void main(String[] args) {

        String text = "labas";

        System.out.println(textMiddleLetter(text));
        System.out.println(textMiddleLetter("KaipSekasi"));

    }

    //testas
    //'t','e','s','t' ,'a' ,'s'
    static char textMiddleLetter(String word){
      char[] symbols =  word.toCharArray();
      int middleSymbolIndex =(int) Math.ceil(1.0*symbols.length / 2);
      return symbols[middleSymbolIndex-1];

    }
}
