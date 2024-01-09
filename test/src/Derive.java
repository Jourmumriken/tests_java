/*second to newest exam question 3*/
public class Derive {
    public String derive(String s) {
        s.toLowerCase(); // no fuckery
        String[] components = s.split(" "); 
        for (int i = 0; i < components.length; i++) {
            String component = components[i];
            if (!(component.equals("+") || component.equals("-"))) {
                if (isLiteral(component)) {
                    components[i] = "";
                    if( i > 0) {
                        components[i-1] = "";
                    }
                } else {
                    components[i] = simpleDerive(component);
                }
            }
        }
        return componentsToString(components);
    }

    private boolean isLiteral(String s) {
        return !s.contains("x^") || s.contains("x^0");
    }

    private String simpleDerive(String s) {
        StringBuilder sb = new StringBuilder();
        int factor = getFactor(s);
        int exponent = getExponent(s);
        factor *= exponent;
        exponent--;
        sb.append(factor);
        sb.append("x^");
        sb.append(exponent);
        return sb.toString();
    }

    private int getFactor(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'x' || s.charAt(i) == '^') {
                return Integer.parseInt(s.substring(0, i));
            }
        }
        return 0;
    }

    private int getExponent(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '^') {
                return Integer.parseInt(s.substring(i + 1));
            }
        }
        return -1;
    }

    private String componentsToString(String[] components) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < components.length; i++) {
            sb.append(components[i]);
        }
        if (sb.isEmpty()) {
            sb.append("\"\"");
        }
        return sb.toString();
    }

}
