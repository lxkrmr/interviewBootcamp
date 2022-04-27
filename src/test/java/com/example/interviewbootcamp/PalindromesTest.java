package com.example.interviewbootcamp;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PalindromesTest {

    @Test
    void shouldReturnTrueIfInputIsPalindrome() {
        // given
        String input = "abba";

        // when
        boolean result = Palindromes.palindrome(input);

        // then
        assertThat(result).isTrue();
    }

    @Test
    void shouldReturnFalseIfInputIsNotPalindrome() {
        // given
        String input = "abcdefg";

        // when
        boolean result = Palindromes.palindrome(input);

        // then
        assertThat(result).isFalse();
    }
}