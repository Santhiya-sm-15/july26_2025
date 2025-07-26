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