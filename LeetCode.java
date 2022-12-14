package com.example.helloworld;
import java.lang.module.FindException;
import java.util.ArrayList;
import java.lang.Math;
import java.util.LinkedList;
import java.util.Stack;

public class LeetCode {

    public static boolean isFasterPalindrome(int x) {
        //faster solution = comparing second half to the first half
        if (x % 10 == 0) {
            return x == 0;
        }
        int half_x = 0;
        for (; x > 0;) {
            int p = x;
            int lastDigit = x % 10;
            half_x = (half_x * 10) + lastDigit;
            x/=10;
            if (half_x == x) {
                return true;
            }
            if (half_x > x) {
                if (half_x == p) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static String longestCommonPrefix(String[] strs) {
        String end = "";
        String first_word = strs[0];
        for(int x = 0; x<first_word.length();x ++) {
            char target = first_word.toCharArray()[x];
            if (isMatch(strs,0,x,target)) {
                end += target;
            }
            else {
                return end;
            }
        }
        return end;
    }
    public static boolean isMatch(String [] strs, int wordIndex, int letterIndex, char target) {
        char [] thisWord = strs[wordIndex].toCharArray();
        if(thisWord.length < letterIndex+1 ){
            return false;
        }
        if (thisWord[letterIndex] == target) {
            if (strs.length ==  wordIndex + 1) {
                //no more words in strs
                return true;
            }
            return isMatch(strs, wordIndex + 1, letterIndex, target);
        }
        return false;
    }

    public static boolean isValid(String s) {
       char [] symbols = s.toCharArray();
       Stack<String> tracker = new Stack<>();
       for(char i : symbols) {
           String sym = String.valueOf(i);
           if (sym.equals("(") || sym.equals("{") || sym.equals("[")) {
               tracker.push(sym);
               continue;
           }

           if (!tracker.isEmpty()) {
               String prevSym = tracker.lastElement();
               System.out.println("past");
               if (sym.equals(")") && prevSym.equals("(")) {
                   tracker.pop();
                   continue;
               }
               if (sym.equals("}") && prevSym.equals("{")) {
                   tracker.pop();
                   continue;
               }
               if (sym.equals("]") && prevSym.equals("[")) {
                   tracker.pop();
                   continue;
               }
               return false;
           }
           return false;
       }
       return tracker.size() == 0;
    }
    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merge = new ListNode();
        if (list1 == null ) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val < list2.val) {
            merge.val = list1.val;
            merge.next = mergeTwoLists(list1.next, list2);
        }
        if (list1.val > list2.val) {
            merge.val = list2.val;
            merge.next = mergeTwoLists(list1,list2.next);
        }
        if (list1.val == list2.val) {
            merge.val = list1.val;
            merge.next = new ListNode(list2.val, mergeTwoLists(list1.next,list2.next));
        }
        return merge;
    }
}

