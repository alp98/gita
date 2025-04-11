import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[]args){
        int sum = 0;
        float average=0f;
        int [] score ={100,88, 100, 100,90};
        for (int i=0; i<score.length; i++) {
            sum += score[i];
        }
            average = sum/(float) score.length;
            System.out.println("총점:"+ sum);
            System.out.println("평균:"+average);

        Scanner scanner=new Scanner(System.in);
        int N =scanner.nextInt();
        int [] arr= new int[N];
        int maxValue=Integer.MIN_VALUE;
        for (int i=0; i<N; i++){
            arr[i]= scanner.nextInt();
            if (arr[i]> maxValue){
                    maxValue=arr[i];

        }

        }
        System.out.println(maxValue);

        scanner.close();
    }
}
