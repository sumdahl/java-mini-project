/**
 * Academic class
 * @author (Sumiran Dahal)
 * @version (0.0.1)
 */
public class NonAcademicCourse extends Course {
    private String instructorName;
    private String startingDate;
    private String completionDate;
    private String examDate;
    private String prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;
    
    /**
     * Constructor of a NonAcademicCourse class
     * to create an instance of NonAcademicCourse class
     * @param courseId String
     * @param courseName String
     * @param duration int
     * @param prerequisite String
     */
    public NonAcademicCourse(String courseId, String courseName, int duration, String prerequisite)
    {
        super(courseId, courseName, duration);
        this.prerequisite = prerequisite;
        this.startingDate = "";
        this.completionDate = "";
        this.examDate = "";
        this.isRegistered = false;
        this.isRemoved = false;
    } 
    
    /**
     * this method returns the value of instructorName
     */
    public String getInstructorName()
    {
        return this.instructorName;
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
     * this method returns the value of examDate
     */
    public String getExamDate()
    {
        return this.examDate;
    } 
    
    /**
     * this method returns the value of prerequisite
     */
    public String getPrerequisite()
    {
        return this.prerequisite;
    }
    
    /**
     * this method returns the value of isRegistered
     */
    public boolean isRegistered()
    {
        return this.isRegistered;
    }
    
    /**
     * this method returns the value of isRemoved
     */
    public boolean isRemoved()
    {
        return this.isRemoved;
    }
    
    /**
     * This method sets the instructor name if the course is already not registered
     * If the course is registered then it displays the message saying the same
     */
    public void setInstructorName(String instructorName)
    {
        if (!this.isRegistered) {
            this.instructorName = instructorName; 
        } else {
            System.out.println("The Non academic course is already registered. Unable to set instructor's name");
        }
    }
    
    /**
     * This method registers the course if not already registered
     * If the course is already registered then it displays the message saying same
     */

    public void register(String courseLeaderName, String instructorName, String startingDate, String completionDate, String examDate)
    {
        if (!this.isRegistered) {
            setInstructorName(instructorName);
            super.setCourseLeader(courseLeaderName);
            this.startingDate = startingDate;
            this.completionDate = completionDate;
            this.examDate = examDate;
            this.isRegistered = true;
        } else {
            System.out.println("The Non academic course is already registered. Unable to register again.");
        }
    }
    
    /**
     * This resets the fields of the calling instance by checking if its removed or not
     * If its already removed then it displays the message saying same
     */
    public void remove()
    {
        if (!this.isRemoved) {
            super.setCourseLeader("");
            this.instructorName = "";
            this.startingDate = "";
            this.completionDate = "";
            this.examDate = "";
            this.isRegistered = false;
            this.isRemoved = true;
        } else {
            System.out.println("This Non academic course has been already removed.");
        }
    }
    
    /**
     * This method invokes the display method of its super class
     * and displays the content if it is registered
     */

    @Override
    public void display()
    {
        super.display();
        if (this.isRegistered) { 
            System.out.println("Instructor's Name is : " + this.instructorName);
            System.out.println("Starting Date is : " + this.startingDate);
            System.out.println("Completion Date is : " + this.completionDate);
            System.out.println("Exam Date is : " + this.examDate);
        }
    }
}