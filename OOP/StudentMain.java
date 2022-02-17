class Student{
    private long rollNo;
    private String name;
    private String course;
    private double marks[];

    public void setRollNo (long rollNo){
        this.rollNo = rollNo;
    }

    public void setName (String name){
        this.name = name;
    }

    public void setCourse(String course){
        this.course = course;
    }

    public void setMarks (double marks[]){
        this.marks = marks;
    }

    public double total(){
        double totalMarks = 0;
        for (double m : marks){
            totalMarks += m;
        }
        return totalMarks;
    }

    public double average(){
        return total()/marks.length;
    }

    public void showDetails(){
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Course : " + course);
        System.out.println("Total Marks : " + total());
        System.out.println("Average Marks : " + average());
        System.out.println("");
    }

}


public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        
        student1.setName("Shankar");
        student1.setRollNo(24569823);
        student1.setCourse("BCom");
        student1.setMarks(new double [] {23.5,44,72,63.75});
        student1.showDetails();

        student2.setName("Vimal");
        student2.setRollNo(22269825);
        student2.setCourse("BTech");
        student2.setMarks(new double [] {28.5,44,22,64.75,30});
        student2.showDetails();

    }
}
