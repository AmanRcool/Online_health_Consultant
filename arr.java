import java.util.*;
import java.util.scanner;
class arr{
public static void main(String args []){
Scanner sc=new scanner(System.in);
int[][] num= new int[3][3];
System.out.println(num.length);
System.out.println("enter element of an array");
for(int a=0;a<num.length;a++){
for(int b=0;b<num.length;b++){
num[a][b]=sc.nextInt();

}

}

System.out.println("output");
for(int a=0;a<num.length;a++){
for(int b=0;b<num.length;b++){
System.out.print(num[a][b]+" ");


}
System.out.println();
}

}


}
