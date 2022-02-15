class Solution {
    public String generateTheString(int n) 
    {     
          int num=n;
          StringBuilder sb= new StringBuilder();
          int a,b=0;
          if(n%2==0)
          {
              a=(num/2);
              if(a%2==0)
                  a=a+1;
              b=n-a;
              for(int i=0;i<a;i++)
                  sb.append('t');
              for(int j=0;j<b;j++)
                  sb.append('y');
          }
        else
        {
            for(int i=0;i<n;i++)
                sb.append('a');
        }
        return sb.toString();
    }
}
