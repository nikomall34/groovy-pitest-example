
import org.example.PalindromeChecker;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PalindromeCheckerTest {

    @Test
    public void testPalindrome() {
        String palindrome1 = "A man, a plan, a canal, Panama!";
        String palindrome2 = "Racecar";
        PalindromeChecker checker = new PalindromeChecker();
        assertThat(checker.isPalindrome(palindrome1)).isTrue();
        assertThat(checker.isPalindrome(palindrome2)).isTrue();

    }

    @Test
    public void testNotPalindrome() {
        String notPalindrome1 = "Hello, World!";
        String notPalindrome2 = "Java";
        PalindromeChecker checker = new PalindromeChecker();
        assertThat(checker.isPalindrome(notPalindrome1)).isFalse();
        assertThat(checker.isPalindrome(notPalindrome2)).isFalse();

    }
}
