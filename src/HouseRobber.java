import java.util.Scanner;

public class HouseRobber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
        }
        System.out.println(findMaxAmount(array,size));
    }
    public static int findMaxAmount(int array[],int size)
    {
        int sum=0;
        int alter_sum=0;
        for(int i=0;i<size;i++)
        {
            if(i%2==0)
            {
                sum += array[i];
            }
            else
            {
                alter_sum+=array[i];
            }
        }
        if(sum>alter_sum)
        {
            return sum;
        }
        else
        {
            return alter_sum;
        }
    }
}
