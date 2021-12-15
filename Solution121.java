public class MyClass {
    public  static int letter(String input)
    {
        int[] arr= new int[26];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<26;i++)
        {
          arr[i]=fav(i);  
        }
        int sum=0;
        for(int j=0;j<input.length();j++)
        {
            int tem=(int)(input.charAt(j)-'A');
            sum+=arr[tem];
        }
        return sum;
        
    }
     static int  fav(int num)
    {   
        if(num<=1)
         return num;
        return fav(num-1)+fav(num-2);
    }
    public static void main(String[] arg)
    {
        int ans=letter("MAN");
        System.out.print(ans);
    }
}
