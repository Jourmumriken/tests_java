public class Bakslang {
    String bakslang(String s) {
        String temp = "";
        StringBuilder sb = new StringBuilder();
        boolean justSwitched = false;
        int lastVowel = -1; // trust me
        for(int i = 0; i < s.length(); i++) {
            if(isVowel(s.charAt(i))) {
                if(justSwitched) {
                    temp = s.substring(lastVowel+1,i+1);
                    lastVowel = i;
                    justSwitched = false;
                } else {
                    sb.append(s.substring(lastVowel+1,i+1));
                    sb.append(temp);
                    justSwitched = true;
                    lastVowel = i;
                }
            }
        }
        if (!justSwitched) {
            sb.append(temp);
        }
        return sb.toString();
    }

    private boolean isVowel(char c) {
        String vowels = "aouåeiyäö";
        return -1 < vowels.indexOf(c);
    }
}
