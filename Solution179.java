class Solution {
    public String reformatDate(String date) 
    { 
      StringBuilder sb= new StringBuilder();
      String[] s=date.split(" ");
      HashMap<String,String> map=new HashMap<>();
         map.put("Jan","01"); 
         map.put("Feb","02"); 
         map.put("Mar","03"); 
         map.put("Apr","04"); 
         map.put("May","05"); 
         map.put("Jun","06"); 
         map.put("Jul","07"); 
         map.put("Aug","08"); 
         map.put("Sep","09"); 
         map.put("Oct","10"); 
         map.put("Nov","11"); 
         map.put("Dec","12");
        sb.append(s[2]);
        sb.append("-");
        sb.append(map.get(s[1]));
        sb.append("-");
        char[] arr=s[0].toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(Character.isDigit(arr[i])&&Character.isDigit(arr[i+1])){
                sb.append(arr[i]);
                sb.append(arr[i+1]);
            }
            else if(Character.isDigit(arr[i])&& !Character.isDigit(arr[i+1])){
                sb.append('0');
                sb.append(arr[i]);
            }
            break;
        }
      return sb.toString();  
    }
}
