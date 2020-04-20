import java.util.*;
interface Library{
  void BookDetails();
  void logout();
  void AddBooks();
  void viewOrder();


}
interface StudentDomain{
  void AddStudentDetails();
  void returnBook();
  void issueBook();

}

class Student extends Admin  implements StudentDomain
{
Student()
{
System.out.println("press 1 for issue \n press 2 for return\n press 3 for Book Details \n press 4 for add student details \n press any key for exit");
   int n=scan.nextInt();
switch(n){
  case 1:
             System.out.println(" Welcome to the issue panel");
             issueBook();
           break;

case 2:

         System.out.println(" welcome to the return panel");
         returnBook();
         break;

case 3:
       System.out.println(" welcome to the Book Details panel");
       BookDetails();
      break;
case 4:
      System.out.println("welcome to the add student details panel");
      AddStudentDetails();
      break;

default:
         System.exit(0);
         break;
}

}
public void issueBook()
 {
  System.out.println("enter your registration no");
  String reg=scan.nextLine();
  scan.nextLine();
  
   System.out.println("how many book you want to issue");
   n=scan.nextInt();
   for(int k=0;k<n;k++){
   System.out.println("enter the book name ");
   scan.nextLine();
   String orderbook=scan.nextLine();
   System.out.println("enter the author name ");
   String orderauthor=scan.nextLine();
    if( bookarr.contains(orderbook+"\t"+orderauthor)){
 
  studentrecords.add(reg+"\t"+orderbook+"\t"+orderauthor);
System.out.println(studentrecords.get(i));
}
else
{
System.out.println("book is not available");
}
  
}
   
 }
 public void returnBook()
{
System.out.println("returning is successful");
}
public void BookDetails()
{
  if(studentrecords.size()==0)
  {
   System.out.println("this field is empty");
  }
  else
  {


for(i=0;i<bookarr.size();i++)
{
System.out.println(bookarr.get(i));
}
  }
}

public void AddStudentDetails()
{
  String name,reg,course;
  ArrayList arr =new ArrayList();
  reg="110";
  name="suruchi";
  course="btech cse";
  arr.add(reg+"\t"+name+"\t"+course);
  reg="112";
  name="suru";
  course="btech cse";
  arr.add(reg+"\t"+name+"\t"+course);
  System.out.println("enter the registration no");
  scan.nextLine();
  reg=scan.nextLine();
  
  System.out.println("enter the name");
  name=scan.nextLine();
  System.out.println("enter the course");
  course=scan.nextLine();
  arr.add(reg+"\t"+name+"\t"+course);
  
  for(i=0;i<arr.size();i++)
System.out.println(arr.get(i));

}

}
class Admin implements Library{
static  Scanner scan=new Scanner(System.in);
ArrayList<String> bookarr=new ArrayList<>();
ArrayList<String> studentrecords=new ArrayList<>();

String bookname,author;
int i,n;
  void Admin()
  {
    System.out.println("\n press 1 for BookDetails \n press 2 for AddBooks \n press 3 for view order \n press 4 for logout \n press 5 for book search ");
    int n=scan.nextInt();
    switch(n)
    {
      case 1:
      BookDetails();
      break;
      case 2:
      AddBooks();
      break;
      case 3:
      viewOrder();
      break;
      case 4:
      logout();
      break;
      case 5:
        booksearch();
    }

  }
  public void BookDetails()
  {
bookname="The Three Musketeers";
author="Alexandr Dumas";
bookarr.add(bookname+"\t"+author);
bookname="Development as freedom";
author="Amartya sen";
bookarr.add(bookname+"\t"+author);
bookname="Death of city";
author="Amrita Pritam";
bookarr.add(bookname+"\t"+author);
for(i=0;i<3;i++){
  System.out.println(bookarr.get(i));
}
return;
  }
  public void logout(){
    System.exit(0);

  }
  public void AddBooks(){
System.out.println("enter the no of book that you want to add");
int n=scan.nextInt();
for(i=0;i<n;i++)
  {
    System.out.println("enter the book name");
    scan.nextLine();
    bookname=scan.nextLine();
    System.out.println("enter the author name");
    author=scan.nextLine();
    bookarr.add(bookname+"\t"+author);
  }
  for(i=0;i<bookarr.size();i++)
   System.out.println(bookarr.get(i));
  }
  public void viewOrder(){
    if(studentrecords.size()==0)
    {
     System.out.println("this field is empty");
    }
    else
    {
    i=0;
    while(i<studentrecords.size())
    {
        System.out.println(studentrecords.get(i));
    }
  }
  }
 void booksearch()
 {
   System.out.println("enter the book name");
   String bookname=scan.nextLine();
   System.out.println("enter the author name");
   String authorname=scan.nextLine();
   if(bookarr.contains(bookname+"\t"+authorname)){
     System.out.println("this book is available");

   }
   else{
     System.out.println("this book is not available");
   }
  
 }


}
class javaproject
{

  
    public static void main(String args[])
    {
             for(int i=0;i<3;i++){ 
     System.out.println("\n press 1 for admin\n press 2 for student\n press any key for exit");
    int n=Admin.scan.nextInt();
switch(n)
{
case 1:
    
System.out.println("welcome to the adminpanel");
Admin ad =new Admin();
ad.Admin();

    break;
case 2:
    System.out.println("welcome to the user");
     
    Student st=new Student();
 

    break;
default:
System.exit(0);
}
 }
}
}