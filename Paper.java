
public class Paper {
     private String  PapersTitle,CourseCode,CourseIncharge,Semester,PrgaramName,TypeOFExam,Location;
    private int PaperIDNumber,NumberOFStudentINExam,day, month, year,hour,min,sec;
    private boolean PaperCollected;

    public Paper(String PapersTitle, String CourseCode, String CourseIncharge, String Semester, String PrgaramName, String TypeOFExam, String Location, int PaperIDNumber, int NumberOFStudentInExam, int day, int month, int year,int hour,int min,int sec, boolean PaperCollected) {
        this.PapersTitle = PapersTitle;
        this.CourseCode = CourseCode;
        this.CourseIncharge = CourseIncharge;
        this.Semester = Semester;
        this.PrgaramName = PrgaramName;
        this.TypeOFExam = TypeOFExam;
        this.Location = Location;
        this.PaperIDNumber = PaperIDNumber;
        this.NumberOFStudentINExam = NumberOFStudentINExam;
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour=hour;
        this.min=min;
        this.sec=sec;
        this.PaperCollected = PaperCollected;
    }

    public String getPapersTitle() {
        return PapersTitle;
    }

    public void setPapersTitle(String PapersTitle) {
        this.PapersTitle = PapersTitle;
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String CourseCode) {
        this.CourseCode = CourseCode;
    }

    public String getCourseIncharge() {
        return CourseIncharge;
    }

    public void setCourseIncharge(String CourseIncharge) {
        this.CourseIncharge = CourseIncharge;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public String getPrgaramName() {
        return PrgaramName;
    }

    public void setPrgaramName(String PrgaramName) {
        this.PrgaramName = PrgaramName;
    }

    public String getTypeOFExam() {
        return TypeOFExam;
    }

    public void setTypeOFExam(String TypeOFExam) {
        this.TypeOFExam = TypeOFExam;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public int getPaperIDNumber() {
        return PaperIDNumber;
    }

    public void setPaperIDNumber(int PaperIDNumber) {
        this.PaperIDNumber = PaperIDNumber;
    }

    public int getNumberOFStudentINExam() {
        return NumberOFStudentINExam;
    }

    public void setNumberOFStudentInExam(int NumberOFStudentINExam) {
        this.NumberOFStudentINExam = NumberOFStudentINExam;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int day,int month,int year) {
        this.day=day;
        this.month=month;
        this.year = year;
    }   
    public void setTime(int hour,int min,int sec) {
        this.hour=hour;
        this.min=min;
        this.sec = sec;
    }
    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }
    public boolean isPaperCollected() {
        return PaperCollected;
    }

    public void setPaperCollected(boolean PaperCollected) {
        this.PaperCollected = PaperCollected;
    }

    @Override
    public String toString() {
        return "Paper{" + "Paper's Title is =" + PapersTitle + ", Course Code is=" + CourseCode + ",Incharge of Course is =" + CourseIncharge + ", Semester NO is=" + Semester + ", Name of Prgaram is =" + PrgaramName + ", Type OF Examination is=" + TypeOFExam + ", Location where paper is=" + Location + ", Paper IDNumber is=" + PaperIDNumber + ", Number Of Student In Exam are=" + NumberOFStudentINExam + ", date is =" + day + "/" + month + "/" + year + ",time=" + hour + ":" + min + ":" + sec+", PaperCollected or Not=" + PaperCollected + '}';
    }
    
    
}
