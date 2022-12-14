import java.util.Scanner;

public class inter_p10 {
    static void MarksCalc(){
        Scanner sc = new Scanner(System.in);
        double  eng, math, science, sst, hindi, pt, t_marks, percentage;

        System.out.print("Enter marks for Total Marks for Exam: ");
        t_marks = sc.nextDouble();

        System.out.print("Enter marks for English: ");
        eng = sc.nextDouble();

        System.out.print("Enter marks for Hindi: ");
        hindi = sc.nextDouble();

        System.out.print("Enter marks for Maths: ");
        math = sc.nextDouble();

        System.out.print("Enter marks for Science: ");
        science = sc.nextDouble();

        System.out.print("Enter marks for SST: ");
        sst = sc.nextDouble();

        System.out.print("Enter marks for pt: ");
        pt = sc.nextDouble();

        percentage = (eng+hindi+math+science+sst+pt)/t_marks*100;
        System.out.println("CGPA is: "+percentage/9.5);
    }
    public static void main(String[] args) {
        MarksCalc();
    }
}
