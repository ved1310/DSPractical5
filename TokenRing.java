import java.util.*;
class TokenRing
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter No. of node you want in the Ring");
int n=sc.nextInt();
System.out.println("Ring is formed as below");
for(int i=0;i<n;i++)
{
System.out.print(i+"");
}
System.out.println("0");
int choice=0;
do{
System.out.println("Enter Sender :");
int sender=sc.nextInt();
System.out.println("Enter reciever :");
int reciever=sc.nextInt();
System.out.println("Enter Data to send :");
int data=sc.nextInt();

int token=0;
System.out.println("Token is Passing");

for(int i=token;i<sender;i++){
System.out.println(" "+i+"->");
}
System.out.println(" "+sender+" "+"sending data"+data);
for(int i=sender;i!=reciever;i=(i+1)%n){
System.out.println("data: "+data+"Forwarded By "+i);
}
System.out.println("Receiver:  "+reciever+"recievered the data "+data);
token=sender;
System.out.println("Do you wabt to send data Again? if yes enter 1,if no enter 0 ");
choice=sc.nextInt();
}while(choice==1);


}
}