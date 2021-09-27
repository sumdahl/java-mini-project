
/**
 * Course class
 * @author (Sumiran Dahal)
 * @version (0.0.1)
 */
public class Course {
    private String courseId;
    private String courseName;
    private String courseLeader;
    private int duration;

    /**
     * Constructor that takes courseID, courseName and duration as parameter
     * to create an instance of the Course class
     * @param courseId   String
     * @param courseName String
     * @param duration   int
     */
    public Course(String courseId, String courseName, int duration)
    {
        this.courseId = courseId;
        this.courseName = courseName;
        this.duration = duration;
        this.courseLeader = "";
    }
    
    /**
     * this method returns the value of course duration
     */
    public int getDuration() 
    {
        return this.duration;
    }
    
    /**
     * this method returns the value of courseId
     */
    public String getCourseId() 
    {
        return this.courseId;
    }
    
    /**
     * this method returns the value of courseLeader
     */
    public String getCourseLeader() 
    {
        return this.courseLeader;
    }
    
    /**
     * this method returns the value of courseName
     */
    public String getCourseName() 
    {
        return this.courseName;
    }
    
    /**
     * this method sets the value of courseLeader
     */
    public void setCourseLeader(String courseLeader) 
    {
        this.courseLeader = courseLeader;
    }
  
    /**
     * this method displays the content of the calling instance.
     * It also displays the course leader value if the course leader value is set
     */
    public void display()
    {
        System.out.println("CourseID:" + courseId);
        System.out.println("Course Name:" + courseName);
        System.out.println("Duration in minute:" + duration);
        if (courseLeader != "") {
            System.out.println("Course Leader's Name:" + courseLeader);
        }
    }
}
