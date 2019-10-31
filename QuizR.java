//Quiz  Applicaltion 
MOHD NASAR AZAZ
import java.util.Scanner;
class QuizR
{	static int qcount;
	static int scount;
	public static void main (String []args)
	{
		Question ques[]=new Question[100];
		Student stu[]=new Student[100];
		String c,cc="null",user="admin",pass="admin",st_name,st_pswd;
		int i,st_size=0,q_size=0,result,ans=0;
		qcount=0;
		scount=0;
		do
		{
			System.out.println("Enter User Type");
			System.out.println("1.Admin");
			System.out.println("2.Student");
		
			System.out.println("Enter your choise");
			Scanner sc= new Scanner(System.in);
			int x=sc.nextInt();
           
		   
 		    switch(x)
			{
		 
				case 1:
				{	 
					System.out.println("Enter username ");
					String user1=sc.next();
				
					System.out.println(" Password");
					String pass1 =sc.next();
				
					if(user1.equals(user)&& pass1.equals(pass))
					{
						do
						{
							System.out.println(" 1.Add Question");
							System.out.println(" 2.Add Student");
							System.out.println(" 3.Result ");
							System.out.println(" Enter your choise");
			    
							int t =sc.nextInt();
				
							switch(t)
							{
								case 1:
								{   //for QUESTIONS
						 
									System.out.println(" Enter no. of Questions");
									q_size = sc.nextInt();
									for(i=0;i<q_size;i++)
									{
										System.out.println(" Enter Questions"+(i+1));
										ques[qcount] = new Question();
										qcount++;
									}//for end
									break;
								}//case1 end	
					
								case 2:	
								{    //FOR STUDENTS
						
									System.out.println(" Enter no. of Student to be added");
									st_size=sc.nextInt();
									for(i=0;i<st_size;i++)
									{
										System.out.println(" Enter Student"+(i+1));
										stu[scount]  = new Student();
										scount++;
									}//for end
									break;
								}//case2-end
			
									//Admin Results

			
								case 3:
								{
									for(i=0;i<scount;i++)
									{
										System.out.println(stu[i].name+"   Result : "+stu[i].result);	
									}
									break;
								}
								default : 
									System.out.println("wrong choise");						
							} //switch end (inner)
					
							System.out.println("Admin Logout(Y/N)");
			   
							c =sc.next();
						}//(inner) do end 
						while(c.equalsIgnoreCase("N"));
					}
					else
					{
						System.out.println("Wrong Usernmae orn Password");
					}
				 
					break;
				}//case1 (outer) end  
		    //Student Case Start
			
				case 2:
				{
					do
					{
					System.out.print("Enter student name :");
					st_name = sc.next();
					System.out.print("Enter PASSWORD :");
					st_pswd = sc.next();
					for(i=0;i<scount;i++)
					{ 
						if ((stu[i].user.equals(st_name ))&&(stu[i].pswd.equals(st_pswd)))
						{
							do
							{
								System.out.println("1.Start exam");
								System.out.println("2.View result");
						
								x=sc.nextInt();
						
								switch(x)
								{
									case 1:
									{
										for(int j=0;j<qcount;j++)
										{
											System.out.println("Q"+(j+1)+":"+ques[j].question);
								
								
											System.out.println("1 :"+ques[j].option1);
											System.out.println("2 :"+ques[j].option2);
											System.out.println("3 :"+ques[j].option3);
											System.out.println("4 :"+ques[j].option4);
											System.out.println("Select Answer :");
											ans= sc.nextInt();
											if(ans==ques[j].answer)
											stu[i].result++;
										}
										break;
									}
							
									case 2:
									{
											System.out.println("Your Result is :"+stu[i].result);
											break;
									}
									default: 
											System.out.println("wrong choise");	
		
			
								} 
								System.out.println("do you wanna cont. press :)(y)");	
								cc =sc.next(); 
							}
							while(cc.equalsIgnoreCase("y"));
							
						}
						if(!cc.equals("null"))
								break;
					}
					if(i==scount)
						{
							System.out.println("wrong user or pass");
						}
					System.out.println("Student Login(Y/N)");
					c=sc.next();
					}while(c.equalsIgnoreCase("Y"));
					break;
				}// case 2 end (Student Case)
				default :
					System.out.println("Wrong Choice .");
			}// switch end
		    
			System.out.println("Continue with Main Program (Y/N)");
					
			 c =sc.next();
		
		} // outer do close	
		while(c.equalsIgnoreCase("y"));
    }//main close
	
	
}//QuizR end 


class Question
{
		Scanner sc=new Scanner(System.in);
		String question;
	    String option1;
		String option2;
        String option3;
        String option4;
		int answer;
		public Question()
		{
			System.out.print("Enter question :");
			question=sc.nextLine();
			System.out.print("Enter Option 1:");
			option1=sc.nextLine();
			System.out.print("Enter Option 2:");
			option2=sc.nextLine();
			System.out.print("Enter Option 3:");
			option3=sc.nextLine();
			System.out.print("Enter Option 4:");
			option4=sc.nextLine();
			System.out.print("Enter Answer:");
			answer=sc.nextInt();
		}
		
}


class Student
{
	Scanner sc=new Scanner(System.in);
	String name,user,pswd;
	int result=0;
	Student()
	{
		System.out.print("Enter Name:");
		name=sc.next();
		System.out.print("Enter User Name :");
		user=sc.next();
		System.out.print("Enter PASSWORD:");
		pswd= sc.next();
		    
			/*for (i=0;i<st_size;i++)
			{
		
			if((s[i].user.equals(user1))&&(s[i].pswd.equals(pass1)))
			{
				do{
					system.out.println("*******************MENU****************");
					system.out.println("___________________1.START QUIZ_________________");
					system.out.println("___________________2.QUIZ RESULT_________________");
					
					c=sc.nextInt();
					switch(c)
					{
					case 1: 
					        for(int j=0;j<q_size;j++)
							{
								System.out.print("Q"+(j+1)+":"+ques[j].question);
								
								
								System.out.print("A"+ques[j].question);
								System.out.print("B"+ques[j].question);
								System.out.print("C"+ques[j].question);
								System.out.print("D"+ques[j].question);
								System.out.print("Select Answer");
								ans= sc.nextInt();
								if(ans==ques[j].answer)
									ques[i].result++;
							}
					case 2: 
					        {
							 System.out.print("Your Result's"+s[i].result);
					        }
					
			}}}}*/
	}
}