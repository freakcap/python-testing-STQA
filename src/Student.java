public class Student {
    private String name;
    private int rollNo;
    private int regId;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", regId=" + regId +
                ", year=" + year +
                ", branch='" + branch + '\'' +
                ", div=" + div +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRegId() {
        return regId;
    }

    public void setRegId(int regId) {
        this.regId = regId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public char getDiv() {
        return div;
    }

    public void setDiv(char div) {
        this.div = div;
    }

    public Student(String name, int rollNo, int regId, int year, String branch, char div) {
        this.name = name;
        this.rollNo = rollNo;
        this.regId = regId;
        this.year = year;
        this.branch = branch;
        this.div = div;
    }

    private int year;
    private String branch;
    private char div;
}
