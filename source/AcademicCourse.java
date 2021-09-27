
/**
 * Academic class
 * @author (Sumiran Dahal)
 * @version (0.0.1)
 */
public class AcademicCourse extends Course {
    private String lecturerName;
    private String level;
    private String credit;
    private String startingDate;
    private String completionDate;
    private int numberOfAssessments;
    private boolean isRegistered;


    /**
     * Constructor of an AcademicCourse
     * to create an instance of AcademicCourse class
     * @param courseId String
     * @param courseName String
     * @param duration int
     * @param level String
     * @param credit String
     * @param numberOfAssessments int
     */
    public AcademicCourse(String courseId, String courseName, int duration, String level, String credit, int numberOfAssessments)
    {
        super(courseId, courseName, duration);
        this.lecturerName = "";
        this.startingDate = "";
        this.completionDate = "";
        this.level = level;
        this.credit = credit;
        this.numberOfAssessments = numberOfAssessments;
        this.isRegistered = false;
    }
    
    /**
     * this method returns the value of lecturerName
     */
    public String getLecturerName()
    {
        return this.lecturerName;
    }
    
    /**
     * this method returns the value of AcademicCourse  level
     */
    public String getLevel()
    {
        return this.level;

    }
    
    /**
     * this method returns the value of AcademicCourse credit
     */
    public String getCredit()
    {
        return this.credit;
    }
    
    /**
     * this method returns the value of startingDate
     */
    public String getStartingDate()
    {
        return this.startingDate;
    }
    
     /**
     * this method returns the value of completionDate
     */
    public String getCompletionDate()
    {
        return this.completionDate;
    }
    
     /**
     * this method returns the value of numberOfAssessments
     */
    public int getNumberOfAssessments()
    {
        return this.numberOfAssessments;
    }
    
     /**
     * this method returns the value of isRegistered
     */
    public boolean isRegistered()
    {
        return this.isRegistered;
    }
    
     /**
     * this method sets the value of lecturerName
     * 
     */
    public void setLecturerName(String lecturerName)
    {
        this.lecturerName = lecturerName;
    }
    
     /**
     * this method sets the value of startingDate
     */
    public void setNumberOfAssessments(int numberOfAssessments)
    {
        this.numberOfAssessments = numberOfAssessments;
    }
    
     /**
     * this method registers the course if not already registered.
     * If the course is already registered then it prints the course content
     */
    public void register(String courseLeaderName, String lecturerName, String startingDate, String completionDate)
    {
        if (this.isRegistered) {
            System.out.println("Lecturer's Name is : " + this.lecturerName);
            System.out.println("Starting Date is : " + this.startingDate);
            System.out.println("Completion Date is : " + this.completionDate);
            return;
        }
        super.setCourseLeader(courseLeaderName);
        this.lecturerName = lecturerName;
        this.startingDate = startingDate;
        this.completionDate = completionDate;
        this.isRegistered = true;
    }
    /**
     * This method displays the content of the calling instance if it is registered
     */

    @Override
    public void display()
    {
        super.display();
        if (this.isRegistered) {
            System.out.println("Lecturer's Name is : " + this.lecturerName);
            System.out.println("Level is : " + this.level);
            System.out.println("Credit is : " + this.credit);
            System.out.println("Starting Date is : " + this.startingDate);
            System.out.println("Completion Date is : " + this.completionDate);
            System.out.println("Number of assessments are : " + this.numberOfAssessments);
        }
    }
}