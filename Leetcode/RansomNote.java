// LeetCode 383 - Ransom Note
//
// Given two strings ransomNote and magazine,
// return true if ransomNote can be constructed
// using the characters from magazine.
//
// Each character in magazine can only be used once.
//
// Approach:
// 1. Create a frequency array of size 26.
// 2. Count the occurrences of each character
//    in magazine.
// 3. Traverse ransomNote and check whether
//    the required character is available.
// 4. If frequency becomes 0 before usage,
//    return false.
// 5. Otherwise, decrease the frequency.
// 6. If all characters are available,
//    return true.
//
// Example:
// ransomNote = "aa"
// magazine = "aab"
//
// Frequency Count:
// a = 2
// b = 1
//
// Use first 'a' -> a = 1
// Use second 'a' -> a = 0
//
// Successfully constructed -> true
//
// Time Complexity: O(n + m)
// Space Complexity: O(1)

class Main {
    
    public static boolean Ransom(String ransomNote, String magazine){
        int freq[] = new int[26];
        for(char ch: magazine.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch: ransomNote.toCharArray()){
            freq[ch-'a']--;
            if(freq[ch-'a']<0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        String ransomNote = "aabsyha";
        String magazine = "aabssykhsh";
        boolean result = Ransom(ransomNote,magazine);
        System.out.println(result);
    }
}