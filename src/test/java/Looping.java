public class Looping {
    public static void main (String[]args)
    {
        int k=1;
        for (int i=0;i<4;i++){
            for (int j=0;j<i-1;j++){
System.out.print(k);
System.out.print("\t");
System.out.print("");
k++;
            }
        }
    }
}
