class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }


        int[] charFreq = new int[27];
        char ch1, ch2;
        for(int i = 0; i < s.length(); i++) {
            ch1 = s.charAt(i);
            ch2 = t.charAt(i);

            charFreq[((int) ch1) - 96]++;
            charFreq[((int) ch2) - 96]--;
        }

        for(int i = 1; i < 27; i++) {
            if(charFreq[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
