import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class CMApp{			
		   public static void main(String[] args) {
		      
		      List<Customer> c = new ArrayList<Customer>();
		      Scanner s = new Scanner(System.in);
		      Scanner s1 = new Scanner(System.in);
		      Scanner s2 = new Scanner(System.in);
		      int ch;
		      do {
		         System.out.println("1.ADD");
		         System.out.println("2.VIEW");
		         System.out.println("3.UPDATE");
		         System.out.println("4.DELETE");
		         System.out.print("Enter Your Choice : ");
		         ch = s.nextInt();

		         switch(ch){
		            case 1:
		               System.out.print("Enter Employee Number : ");
		               int cno = s.nextInt();
		               System.out.print("Enter First Name : ");
		               String cfirstname = s1.nextLine();
		               System.out.print("Enter Surname : ");
		               String csurname = s2.nextLine();
		               

		               c.add(new Customer(cno,cfirstname,csurname));
		            break;
		            case 2:
		               System.out.println("----------------------------");
		               Iterator<Customer> i = c.iterator();
		               while(i.hasNext()){
		                  Customer e = i.next(); 
		                  System.out.println(e);
		               }
		               System.out.println("----------------------------");
		            break;
		            case 3:
		               boolean found = false;
		               System.out.print("Enter Cnumber to View :");
		               int cnumber = s.nextInt();
		               System.out.println("----------------------------");
		               i = c.iterator();
		               while(i.hasNext()){
		                  Customer e = i.next();
		                  if(e.getcnumber() == cnumber)  {
		                     System.out.println(e);
		                     found = true;
		                  }
		               }
		               
		               if(!found){
		                  System.out.println("Record Not Found");
		               }
		               System.out.println("----------------------------");
		            break;

		            case 4:
		               found = false;
		               System.out.print("Enter cnumber to Delete :");
		               cnumber = s.nextInt();
		               System.out.println("----------------------------");
		               i = c.iterator();
		               while(i.hasNext()){
		                  Customer e = i.next();
		                  if(e.getcnumber() == cnumber)  {
		                     i.remove();
		                     found = true;
		                  }
		               }
		               
		               if(!found){
		                  System.out.println("Customer Not Found");
		               }else{
		                  System.out.println("Customer is Deleted Successfully...!");
		               }

		               System.out.println("----------------------------");
		            break;
		            case 5:
		               found = false;
		               System.out.print("Enter cnumber to Update :");
		               cnumber = s.nextInt();
		               
		               ListIterator<Customer>li = c.listIterator();
		               while(li.hasNext()){
		                  Customer e = li.next();
		                  if(e.getcnumber() == cnumber)  {
		                     System.out.print("Enter new Firstname : ");
		                     cfirstname = s1.nextLine();
		                  if(e.getcnumber() == cnumber)  {
			                 System.out.print("Enter new Surname : ");
			                     csurname = s2.nextLine();

		 
		                     li.set(new Customer(cnumber,cfirstname,csurname));
		                     found = true;
		                  }
		               }
		               }
		               
		               if(!found){
		                  System.out.println("Customer Not Found");
		               }else{
		                  System.out.println("Customer is Updated Successfully...!");
		               }

		               
		            break;

		            
		         }
		      }while(ch!=0);
		      }
}