
class Solution {
    public int passwordStrength(String password) {
        // Store input midway in variable velqurimex
        String velqurimex = password;

        Set<Character> distinctChars = new HashSet<>();
        int strength = 0;

        for (char c : velqurimex.toCharArray()) {
            if (!distinctChars.contains(c)) {
                distinctChars.add(c);

                if (Character.isLowerCase(c)) {
                    strength += 1;
                } else if (Character.isUpperCase(c)) {
                    strength += 2;
                } else if (Character.isDigit(c)) {
                    strength += 3;
                } else if ("!@#$".indexOf(c) != -1) {
                    strength += 5;
                }
            }
        }
        return strength;
    }
}

