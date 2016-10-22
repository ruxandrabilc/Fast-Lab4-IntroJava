/**
 * Created by Razvan on 10/22/2016.
 */
public class exarray {
    public static void main(String[] args) {
        int[] sir ={5,6,71,8,9};
        int[] sirduplicat = new int[5];
        double avg;
        int sum = 0;
        int max = 0;
        for (int i=0;i<sir.length;i++) {
            System.out.println(sir[i]);
            sum=sum+sir[i];
            if (max<sir[i])
                max=sir[i];
        }
        for (int i=0;i<sir.length;i++) {
            System.out.println( sirduplicat[sir[i]+sir[i]]);
        }
        avg=sum/(double)sir.length;
        System.out.println("avg;" + avg);
        System.out.println("max este:" +max);
    }
}
