import java.util.ArrayList;

public class Arrays {
    public static void main(String[]agrs){
        int[] arr=new int[7];
        arr[0]=12;
        arr[1]=21;
        arr[2]=22;
        arr[3]=23;
        arr[4]=32;
        arr[5]=24;
        arr[6]=42;
        int [] arr1={1,2,3,4,5,6,7};
        //using for looping
        for(int i=4;i<arr.length;i++){

            System.out.println(arr[i]);
        }


for(int i=4;i<arr1.length;i++)
{
    System.out.println(arr1[i]);

}
      String[] name={"shiva","Raj","Gonepalli"};
for(int i=0;i<name.length;i++)
{
    System.out.println(name[i]);

}
//Enhancer for loop syntax
        for(String g:name)
        {
            System.out.println(g);

        }

for(int i=0;i<arr1.length;i++){

    if(arr1[i] %2==0){

        System.out.println(arr1[i]);
       // break;
    }
else
    System.out.println(arr1[i]+"is not multiple of 2");

}
        ArrayList<String> s=new ArrayList<String>();
s.add("Shiva");
s.add("Raj");
s.add("Gonepalli");
s.remove("Shiva");
System.out.println(s.get(1));
    }
    s.add("Shiva");
    s.add("Raj");
    s.add("Gonepalli");
    s.remove("Shiva");
    System.out.println(s.get(1));
}
