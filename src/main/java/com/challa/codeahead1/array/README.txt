1) Contigues subarray 
2) Max profit in one trnasaction , max profit in any number of transaction , max profit in K transactions(Dynamic programing)
3) Rotate Aarry ()
4) Arrange array with zigzag order ex: 1< 3 >2 
5) Given a String convert into a keypad numeric sequence() 
    abc : 1
    def : 2   
    ade : 1-2-22 
  
5.1) Given a number convert keypad possible permutation 
6) SubArray 
    6.1) SubArray With Sum Zero or SubArray with sum K
          Use HashMap check if curr-sum ==k return 0 to i 
            if( hMap.contains(curr_sum-k) return value to i
            else hmap.put(curr_sum, i)
     6.2) Longest Consecutive Sequence(use hashset) use +1 and -1 logic
     6.3) Maximum sum contiguous sub array, 
     6.4) Increasing sub sequence,  
     6.5) check if any two numbers are equal to given sum.
 7) Max area in histogram 
 8) Search an element in bitonic array. find bitonic point and do ascending or decending search.
 9) Power Set Power set P(S) of a set S is the set of all subsets of S. 
 For example S = {a, b, c} then P(s) = {{}, {a}, {b}, {c}, {a,b}, {a, c}, {b, c}, {a, b, c}}.

 10) Restore IP Addresses :
 11) Next Greater element in an array, navie solution with O(n)
 

 
 
Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
For example, given [100, 4, 200, 1, 3, 2], the longest consecutive element sequence is [1, 2, 3, 4]. Return its length: 4.
Your algorithm should run in O(n) complexity.
100-200
1-2-3-4
 
 100
 
 
 
 