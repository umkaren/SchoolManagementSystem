//This class is responsible for keeping track of students
//fees, name, grade, and fees paid

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * to create a new student by initializing
     * Fees for every student is $30,000.
     * Fees paid initially is 0.
     * @param id id for the student: unique.
     * @param name name of the student.
     * @param grade grade of the student.
     */
    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    //Not going to alter student's name, student's id.

    /**
     * Used to update the student's grade.
     */
    public void setGrade() {
        this.grade = grade;
    }

    /**
     * Keep adding the fees to feesPaid Field.
     * Add the fees to the fees paid.
     * The school receives the funds.
     * @param fees the fees students pay
     */
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return id of the student
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return student name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return student grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * fees paid by student
     * @return
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return total student fee
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees
     */
    public int getRemainingFees() {
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name: " + name +
                " Total fees paid so far $" + feesPaid;
    }
}
