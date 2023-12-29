public class Bakslang {
    String bakslang(String s) {
        String temp = "";
        StringBuilder sb = new StringBuilder();
        boolean justSwitched = true; // vi börjar alltid med att spara
        // stavelsen till temp alltså samma sak som om vi just bytt två
        // stavelser
        int lastVowel = -1; // håller koll på vart den senaste vokalen var
        // loopa genom hela strängen
        for(int i = 0; i < s.length(); i++) {
            // om vi hittar en vokal eller kommer till slutet utan att se en
            // vokal så gör något
            if(isVowel(s.charAt(i)) || i == s.length() -1) {
                // om vi just bytt två stavelser spara bara följande stavelse
                // i temp och uppdatera relevanta värden
                if(justSwitched) {
                    temp = s.substring(lastVowel+1,i+1); // [lastVowel +1, i+1)
                    justSwitched = false; // vi bytte inget
                    lastVowel = i; // vi hittade en vokal här
                } else {
                    // append händer i "bakvänd" ordning så att stavelserna
                    // byter plats i resultatet
                    sb.append(s.substring(lastVowel+1,i+1));
                    sb.append(temp);
                    justSwitched = true; // vi bytte just
                    lastVowel = i; // vi hittade en vokal här
                }
            }
        }
        // I slutet appendar vi temp om vi inte redan gjort det
        if (!justSwitched) {
            sb.append(temp);
        }
        // returnerar strängrepresentationen av stringBuilder objektet
        return sb.toString();
    }

    // hjälpfunktion som vi får anta fins i uppgiften, inte relevant till
    // tentasvaret egentligen förutom att den fins
    private boolean isVowel(char c) {
        return -1 < "aouåeiyäöAOUÅEIYÄÖ".indexOf(c);
    }
}
