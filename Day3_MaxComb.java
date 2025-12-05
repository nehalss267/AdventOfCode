import java.util.*;
//yet to complete
public class Day3_MaxComb{
List<Integer>list=new ArrayList<>();
public static void maxComb(String data){
 int len=data.length();
 int max=Math.MIN_VALUE;
 String l=" ",r=" ";
 for(int i=0;i<=len;i++){
  for(int j=0;j<=i;j++){
    l=data.substring(i,j);
    int lInt=Integer.parseInt(l);
    if(lInt>max){
      max=lInt;
    }
  }
}
 list.add(lInt);
}
public static void main(String args[]){
maxComb(String data);
int sum=0;
System.out.println(list);
for(int elem: list){
  sum+=elem;
}
}
}