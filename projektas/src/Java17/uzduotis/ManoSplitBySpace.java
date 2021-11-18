package Java17.uzduotis;

import java.util.ArrayList;
import java.util.List;

public class ManoSplitBySpace {
    public static void main(String[] args) {
        String tekstas = "labas vakaras ";
        System.out.println(splitBySpace(tekstas));



    }

    // "Labas vakaras"
    static List<String> splitBySpace(String text) {

        List<String> newTextList = new ArrayList<>();
        char[] symbols = text.toCharArray();
        String word = "";

        for(char x:symbols){

            if(x != ' '){
                word +=x;

            }else{
                newTextList.add(word);
                word = "";
            }

        }if(word != ""){
            newTextList.add(word);
        }


        return newTextList;
    }
}
