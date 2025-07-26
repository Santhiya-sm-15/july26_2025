# july26_2025
The problem that i solved today in leetcode

You are given an array of integer arr[] where each number represents a vote to a candidate. Return the candidates that have votes greater than one-third of the total votes, If there's not a majority vote, return an empty array. 

Note: The answer should be returned in an increasing format.

Code:
class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        ArrayList<Integer> res=new ArrayList<>();
        int n=arr.length;
        Map<Integer,Integer> m=new HashMap<>();
        for(int x:arr)
            m.put(x,m.getOrDefault(x,0)+1);
        for(Map.Entry<Integer,Integer> x:m.entrySet())
        {
            if(x.getValue()>n/3)
                res.add(x.getKey());
        }
        Collections.sort(res);
        return res;
    }
}
