import java.util.Scanner;
class Cube{
public static void main(String[] args)
{
System.out.println("Enter the limit :");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=1;i<=num;i++){
System.out.println(i+"\t:"+i*i*i);
}
}
}

