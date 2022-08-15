
public class StudentMarks {
  int English;
  int Maths;
  int Social;
  int Science;
public int sumMarks() {
int sumMarks = English + Maths + Social + Science;
return sumMarks;
}
public float avgMarks() {
	float avgMarks = (sumMarks())/4f;
	return avgMarks;
}
public static void main(String[] args) {
StudentMarks student1 = new StudentMarks();
student1.English = 80;
student1.Maths = 70;
student1.Social = 74;
student1.Science = 65;
System.out.println("Total marks of student1 :"  );
System.out.println("Sum: " + student1.sumMarks());
System.out.println("Average marks of student1 :");
System.out.println("Average: " + student1.avgMarks());

StudentMarks student2 = new StudentMarks();
student2.English = 90;
student2.Maths = 85;
student2.Social = 65;
student2.Science = 60;
System.out.println("Total marks of student2 :"  );
System.out.println("Sum: " + student2.sumMarks());
System.out.println("Average marks of student2 :");
System.out.println("Average: " + student2.avgMarks());
}

}
