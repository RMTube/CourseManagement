/**
 * Created by ntuladhar on 1/15/18.
 */
public class Course {
    private String name;
    private String instructorName;
    private String studentName;
    private int totalHours;

    //Constructor
    public Course(String courseName,String instructorName, int totalHours)
    {
        this.name = name;
        this.instructorName = instructorName;
        this.totalHours = totalHours;
        this.studentName=""
    }

    //Accessors
    public String getName() {
        return name;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    //Displays all the variables
    public void Display() {
        System.out.println(String.format("Course Name is %s ", this.name));
        System.out.println(String.format("Instructor Name is %s ",this.name));
        System.out.println(String.format("Total Hours requires to Complete the Course is %s ",this.totalHours);
        if (!this.studentName.isEmpty()) {
            System.out.println(String.format("Student Name is %s " ,this.name));
        }
    }
}
