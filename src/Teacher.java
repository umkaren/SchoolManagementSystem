/**
 * This class is responsible for keeping track
 * of teacher's name, id, and salary
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Creates new teacher object.
     * @param id id for the teacher
     * @param name name of the teacher
     * @param salary teacher salary
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the teacher
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return teacher salary
     */
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * adds to salaryEarned
     * removes from total money by the schooll
     * @param salary
     */
    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);

    }

    @Override
    public String toString() {
        return "Name of the Teacher: " + name +
                " Total salary earned so far $" +
                salaryEarned;
    }
}
