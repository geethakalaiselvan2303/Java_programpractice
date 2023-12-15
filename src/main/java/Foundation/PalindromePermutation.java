package Foundation;

public class PalindromePermutation {

    public static void main(String[] args) {
        String inputStr = "aabb";
        int result = 0;
		try {
			result = solution(inputStr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Output: " + result);
    }

    public static int solution(String inputStr) {
        // Initialize an array to count the occurrences of each character in the input string
        int[] charCount = new int[26];
        for (char c : inputStr.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Count the number of characters with odd occurrences
        int oddCount = 0;
        for (int count : charCount) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }
        // If there is at most one character with odd occurrences, it can be placed in the middle of the palindrome
        // Otherwise, it's not possible to form a palindrome
        if (oddCount <= 1) {
            return 1 + 26; // 1 for adding zero letters, 26 for adding any one of the 26 letters of the English alphabet
        } else {
            return 0;
        }
    }
}




