import java.util.*;
public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String input = sc.nextLine().trim();

        String[] array = input.split(" ");
        int[] ints = new int[array.length];
        for(int i=0; i < array.length; i++){
            ints[i] = Integer.parseInt(array[i]);
        }
        String hfs = "";


        for(int i=1; i<=ints[0];i++){
            if(ints[0]%i==0){
                hfs  = hfs + i + " ";
            }
        }

        String[] hfs2 = hfs.split(" ");

        System.out.println(hfs2[ints[1]]);


    }
}
