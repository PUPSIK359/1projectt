package block2.LAB10.t1;

public class Student implements Comparable<Student> {
    private int idNumber;
    private String firstName;
    private String lastName;
    private String specialty;
    private int course;
    private String group;
    private double gpa;

    public Student(int idNumber, String firstName, String lastName,
                   String specialty, int course, String group, double gpa) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.idNumber, other.idNumber);
    }

    @Override
    public String toString() {
        return String.format("№%d | %s %s | %s | курс %d | %s | балл %.2f",
                idNumber, lastName, firstName, specialty, course, group, gpa);
    }
}
