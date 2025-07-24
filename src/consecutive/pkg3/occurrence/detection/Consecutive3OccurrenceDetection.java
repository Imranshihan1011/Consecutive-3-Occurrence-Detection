package consecutive.pkg3.occurrence.detection;
import java.util.Scanner;
/**
 *
 * @author Imran Shihan
 */
public class Consecutive3OccurrenceDetection {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("Enter the sizeL ");
        int n = input.nextInt();
        int[]arr = new int[n];
        System.out.println("Enter numbers: ");
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("output: ");
        for(int i = 0; i < n-2; i++){
            if(arr[i] == arr[i + 1] && arr[i] == arr[i + 2]){
                System.out.print(arr[i]+" ");
                i+= 2;// Skil next two to avoid duplicate grouping
            }
        }
    }
    
}
