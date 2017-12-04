package org.model.Util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.model.college.collegeInfo;
import org.model.college.degree;


public class Solution {
		public static void main(String[] args) throws IOException {  
			int ch;
			Session session=null;
			Transaction t=null;
		    System.out.println("1.TEACHER \n 2.STUDENT\n");
			System.out.println("Enter your choice:");
			BufferedReader brc = new BufferedReader(new InputStreamReader(System.in));
			ch=Integer.parseInt(brc.readLine());
			
			switch(ch)
			{
			case 1:
				System.out.println("1.collegeinfo\t2.degree\t3.department\4.texam\t5.section\t6.teacher\t7.tlogin\t\n");
				int choice;
				choice=Integer.parseInt(brc.readLine());
				switch(choice){
				case 1:
					try{
					SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
					session=sf.openSession();
					int cSno,courseId;
					String collegeName,startYear,endYear,studNumber,degreeId;
					System.out.println("Enter collegeinfo:");
					cSno=Integer.parseInt(brc.readLine());
					System.out.println("Enter CourseId:");
					courseId=Integer.parseInt(brc.readLine());
					System.out.println("Enter collegename:");
					collegeName=brc.readLine();
					System.out.println("Enter Startyear:");
					startYear=brc.readLine();
					System.out.println("Enter Endyear:");
					endYear=brc.readLine();
					System.out.println("Enter studnumber:");
					studNumber=brc.readLine();
					System.out.println("Enter degreeid:");
					degreeId=brc.readLine();
					collegeInfo ci= new collegeInfo();
					ci.setcSno(cSno);
					ci.setCourseId(courseId);
					ci.setCollegeName(collegeName);
					ci.setStartYear(startYear);
					ci.setEndYear(endYear);
					ci.setStudNumber(studNumber);
					ci.setDegreeId(degreeId);
					session.save(ci);
					t=session.beginTransaction();
					System.out.println("COLLEGE INFO INSERTED ");
					
					}
					catch(Exception e){
						e.printStackTrace();  
						t.rollback();
					}
					finally{
					session.close();
					}
				break;
				case 2:
					try{
					SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
					session=sf.openSession();
					String text;
					int duration,degreeId1;
					System.out.println("Enter Degree Duration:");
					duration=Integer.parseInt(brc.readLine());
					System.out.println("Enter DegreeId:");
					degreeId1=Integer.parseInt(brc.readLine());
					System.out.println("Enter DegreeDescription:");
					text=brc.readLine();
					degree deg=new degree();
					deg.setDegreeId(degreeId1);
					deg.setDuration(duration);
					deg.setText(text);
					session.save(deg);
					t=session.getTransaction();
					t.commit();
					System.out.println("COLLEGE DEGREE INSERTED ");
				}
					catch(Exception e){
						e.printStackTrace();  
						t.rollback();
					}
					finally{
					session.close();
					}
					break;
				default:
					System.out.println("saghjsjk");
					break;
				}
				
				break;
				}
				
			
			
			}
			  
		  
		}  


