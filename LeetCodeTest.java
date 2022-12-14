package com.example.helloworld;
import java.util.HashMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LeetCodeTest {
    //HashMap<Integer, Boolean> set = new HashMap<>(){{put(121,true);put(-121,false);put(10,false);}};
    @Test
    void isFasterPalindrome() throws Exception {
        assertEquals(true,LeetCode.isFasterPalindrome(121));
        assertEquals(false,LeetCode.isFasterPalindrome(-121));
        assertEquals(false,LeetCode.isFasterPalindrome(10));
        assertEquals(true,LeetCode.isFasterPalindrome(6996));
        assertEquals(false,LeetCode.isFasterPalindrome(6969));
        assertEquals(false,LeetCode.isFasterPalindrome(21120));
    }

    @Test
    void longestCommonPrefix() throws Exception {
        assertEquals("fl",LeetCode.longestCommonPrefix(new String[] {"flower","flow","flight"}));
        assertEquals("", LeetCode.longestCommonPrefix(new String[] {"dog","racecar","car"}));
        assertEquals("my", LeetCode.longestCommonPrefix(new String[] {"myself","myspace","mythical"}));
        assertEquals("chem", LeetCode.longestCommonPrefix(new String[] {"chemist","chemistry","chem"}));
    }
    @Test
    void isValid() throws Exception {
        assertEquals(true, LeetCode.isValid("()"));
        System.out.println("here");
        assertEquals(true, LeetCode.isValid("()[]{}"));
        System.out.println("there");
        assertEquals(false, LeetCode.isValid("(]"));
        assertEquals(true, LeetCode.isValid("{[]}"));
        System.out.println("aki");
        assertEquals(false, LeetCode.isValid("(){}}{"));
        System.out.println("aya");
        assertEquals(false, LeetCode.isValid("}]"));
    }
    @Test
    void mergeTwoLists() throws Exception {
        assertEquals(new LeetCode.ListNode() ,LeetCode.mergeTwoLists(new LeetCode.ListNode(), new LeetCode.ListNode()));
        assertEquals(new LeetCode.ListNode(0) ,LeetCode.mergeTwoLists(new LeetCode.ListNode(), new LeetCode.ListNode(0)));
        assertEquals(new LeetCode.ListNode(1, new LeetCode.ListNode(1, new LeetCode.ListNode( 2, new LeetCode.ListNode(3, new LeetCode.ListNode(4, new LeetCode.ListNode(4)))))) ,LeetCode.mergeTwoLists(new LeetCode.ListNode(1, new LeetCode.ListNode(2, new LeetCode.ListNode(4))), new LeetCode.ListNode(1, new LeetCode.ListNode(3, new LeetCode.ListNode(4)))));
    }
}