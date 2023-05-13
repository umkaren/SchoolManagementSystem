//package school.management.system;

import java.util.List;
/**
 * Many teachers, many students
 * Implement teachers and students using an ArrayList
 */
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     * @return list of teachers in the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Adds a teacher to the school
     * @param teacher added
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudent() {
        return students;
    }

    /**
     * add a student to the schoo
     * @param student added
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     *
     * @return total money earned by the student
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the school.
     * @param MoneyEarned
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return total money spent by the school.
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}
