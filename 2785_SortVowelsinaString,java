class Solution {
    public String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        char[] chars = s.toCharArray();

        for (char c : chars) {
            if(isVowel(c)) {
                vowels.add(c);
            }
        }

        Collections.sort(vowels);

        int idx = 0;
        for (int i = 0; i < chars.length; i++) {
            if (isVowel(chars[i])) {
                chars[i] = vowels.get(idx++);
            }
        }

        return new String(chars);
    }

    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}