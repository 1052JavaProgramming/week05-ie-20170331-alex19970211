package hw;
import java.util.*;
public class hw01_105021022 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		ArrayList<Student> nameList=new ArrayList<Student>();
		Student stu=new Student("Jack","1111",95);
		Student stu2=new Student("Tom","2222",92);
		Student stu3=new Student("Alice","3333",98);
		nameList.add(stu);
		nameList.add(stu2);
		nameList.add(stu3);
	while(true){
		System.out.println("請輸入名字:1繼續,2停止");
		int a=scn.nextInt();
	if(a==1){
		String b=scn.next();
		System.out.println();
	}
	if(a==2){
			for(int i=0;i<nameList.size();i++){	
		     System.out.print(nameList.get(i).getInfo()+"\t");
			}
			System.out.println();
			break;
	}
  }
}
}
	
	
	