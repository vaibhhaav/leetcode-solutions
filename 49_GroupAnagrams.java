class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedKey = new String(chars);

            anagramMap.putIfAbsent(sortedKey, new ArrayList<>());
            anagramMap.get(sortedKey).add(s);
        }

        return new ArrayList<>(anagramMap.values());
    }
}