import java.util.Scanner;

public class dynamicArray {
    private int arr[];
    private int c;
    private int size;
    public dynamicArray()
    {
        arr = new int[1];
        c=0;
        size=1;
    }
    public void addElement(int a)
    {
        if(c==size)
            grow();
        arr[c]=a;
        c++;
    }
    public void grow()
    {
        int temp[] = null;
        if(c == size)
        {
            temp = new int[size*2];
            for (int i = 0;i<size;i++)
                temp[i]= arr[i];
        }
        arr= temp;
        size=size*2;   
    }
    public void addElementat(int q,int a)//q is the index and a is the element to be added in the array.
    {
        if(c == size)
            grow();
        for(int i = c-1;i>=q;i--)
            arr[i+1]=arr[i];
        arr[q]=a;
        c++;
    }
    public static void main(String[] args) {
        dynamicArray da = new dynamicArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<n;i++)
            da.addElement(sc.nextInt());
        System.out.println("The array is : ");
        for(int i=0;i<da.size;i++)
            System.out.print(da.arr[i]+" ");
        System.out.println();
        System.out.println("The size of array is : "+da.size);
        System.out.println("The count of array is : "+da.c);
        System.out.println("Enter the index and the number to be inputted in the array in 'q,a' style :");
        da.addElementat(sc.nextInt(), sc.nextInt());
        System.out.println("New array: ");
        for(int i=0;i<da.size;i++)
            System.out.print(da.arr[i]+" ");
        System.out.println();
    }
}
