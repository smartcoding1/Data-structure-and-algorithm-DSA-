class Solution {
    public String frequencySort(String s) 
    {
      char[] arr= s.toCharArray();
      HashMap<Character,Integer> map= new HashMap<>();
        for(char ele:arr)
            map.put(ele,map.getOrDefault(ele,0)+1);
        List<Character> list = new ArrayList<Character>(map.keySet());
        Collections.sort(list,(a,b)->{
            int freq1 = map.get(a);
            int freq2 = map.get(b);
            if(freq1==freq2)
                return a-b;
            else
                return freq2-freq1;
        });
        StringBuilder str = new StringBuilder();
        for(char ch : list){
            for(int i=0;i<map.get(ch);i++){
                str.append(ch);
            }
        }
        return str.toString();
    }
}
