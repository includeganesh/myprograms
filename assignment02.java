import java.util.Scanner;
public class assignment02{
	public static void main(String args[]){
	System.out.println();
	System.out.println("Question 01 a");
	program01a p1=new program01a();	
	p1.pattern();
	System.out.println();
	System.out.println("Question 01 b");
	program01b p1b=new program01b();	
	p1b.pattern();
	System.out.println();
	System.out.println("Question 02");
	program02 p2=new program02();	
	p2.bubbleSort();
	System.out.println();
	System.out.println("Question 03");
	program03 p3=new program03();	
	p3.insertionSort();
	System.out.println();
	// System.out.println("Question 04");
	// program04 p4=new program04();	
	// p4.selectionSort();
	// System.out.println();
	// System.out.println("Question 05");
	// program05 p5=new program05();
	// p5.intervalPrime();
	// System.out.println();
	// System.out.println("Question 06");
	// program06 p6=new program06();	
	// p6.evenodd();
	// System.out.println();
	// System.out.println("Question 07");
	// program07 p7=new program07();	
	// p7.fibonacci();

}
}
class program01a{
	public static void  pattern(){
	System.out.println("Enter number of lines in pattern ");
	Scanner sc= new Scanner(System.in);
	int num=sc.nextInt();
	int i=0;int j=0;
	for(i=1;i<=num;i++){
		for(j=0;j<i;j++){
			System.out.print("* ");		
		}
		System.out.println();
	}
	for(i=(num-1);i>0;i--){
		for(j=0;j<i;j++){
			System.out.print("* ");		
		}
		System.out.println();
	}
	}
}
class program01b{
	public static void  pattern(){
	System.out.println("Enter number of lines in pattern ");
	Scanner sc= new Scanner(System.in);
	int num=sc.nextInt();
	int i=0;int j=0;
	for(i=1;i<=num;i++){
		for(j=0;j<(num-i);j++){
			System.out.print(" ");		
		}
		for(j=0;j<i;j++){
			System.out.print("* ");		
		}
		System.out.println();
	}
	

	}
}

class program02{
	public static void  bubbleSort(){
	System.out.println("Enter number of elements in array ");
	Scanner sc= new Scanner(System.in);
	int num=sc.nextInt();
	int arr[];
	arr=new int[num];
	int i=0; int j=0;
	System.out.println("Enter elements in array ");
	for(i=0;i<num;i++){
		arr[i]=sc.nextInt();
	}
	for(i=0;i<num;i++){
		for(j=1;j<(num-i);j++){
			if(arr[j-1]>arr[j]){
				arr[j-1]=arr[j]+arr[j-1];
				arr[j]=arr[j-1]-arr[j];
				arr[j-1]=arr[j-1]-arr[j];			
			}	
		}
	}
	System.out.println("Sorted array after bubbleSort is: ");
	for(i=0;i<num;i++){
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	}
}

class program03{
	public static void  insertionSort(){
	System.out.println("Enter number of elements in array ");
	Scanner sc= new Scanner(System.in);
	int num=sc.nextInt();
	int arr[];
	arr=new int[num];
	int i=0; int j=0;
	System.out.println("Enter elements in array ");
	for(i=0;i<num;i++){
		arr[i]=sc.nextInt();
	}
	for(i=0;i<(num-1);i++){
		int key=arr[i+1];
		j=i;
		while(j>=0 && arr[j]>key){
		arr[j+1]=arr[j];
		j--;		
		}
		arr[++j]=key;		
		
	}
	System.out.println("Sorted array after insertionSort is: ");
	for(i=0;i<num;i++){
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	}
}

class program04{
	public static void  selectionSort(){
	System.out.println("Enter number of elements in array ");
	Scanner sc= new Scanner(System.in);
	int num=sc.nextInt();
	int arr[];
	arr=new int[num];
	int i=0; int j=0;
	System.out.println("Enter elements in array ");
	for(i=0;i<num;i++){
		arr[i]=sc.nextInt();
	}
	for(i=0;i<(num-1);i++){
		int min=i;
		for(j=i+1;j<num;j++){
			if(arr[min]>arr[j]){
				min=j;
			}
		}
		if(min!=i){
			arr[min]=arr[min]+arr[i];
			arr[i]=arr[min]-arr[i];
			arr[min]=arr[min]-arr[i];
		}				
	}
	System.out.println("Sorted array is after selectionSort is : ");
	for(i=0;i<num;i++){
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	}
}


class program05{
	public static void  intervalPrime(){
	System.out.println("Enter a two numbers to give interval for prime numbers : ");
	Scanner sc= new Scanner(System.in);
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	if(num1>num2){
	num1=num1+num2;
	num2=num1-num2;
	num1=num1-num2;
	}
	if(num1<2){
	num1=2;
	}
	int i=0;int j=0;
	for(i=num1;i<=num2;i++){
		int cntfactor=0;
		for(j=2;j<i && cntfactor<1;j++){
		if(i%j==0)cntfactor++;
		}
		if(cntfactor==0){
		System.out.print(i+" ");
		}
	}
	System.out.println();
	}
}

class program06{
	public static void  evenodd(){
	System.out.println("Enter a number to check if odd : ");
	Scanner sc= new Scanner(System.in);
	int num=sc.nextInt();
	int i=0;int j=0;
	if(num%2==0){
		System.out.println(num+" is an Even number.");
	}
	else{
		System.out.println(num+" is an Odd number.");
	}

	}
}

class program07{
	public static void  fibonacci(){
	System.out.println("Enter number of terms in Fibonacci series: ");
	Scanner sc= new Scanner(System.in);
	int num=sc.nextInt();
	int a=0;int b=1;
	
	if(num==1){
		System.out.println("0 ");
	}
	else{
		System.out.print("0 1 ");
		for(int i=2;i<num;i++){
		System.out.print((a+b)+" ");
		int c=a+b;
		a=b;
		b=c;
		}
	}
	System.out.println();
}
}
