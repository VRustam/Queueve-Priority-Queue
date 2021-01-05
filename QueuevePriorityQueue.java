package tapsiriq_ve_calismalar;

import java.util.Comparator;
import java.util.PriorityQueue;

public class QueuevePriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Student> student = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.id < o2.id){
                    return -1;
                }else return 1;
            }
        });
        student.offer(new Student(2,18));
        student.offer(new Student(8,142));
        student.offer(new Student(5,1242));
        student.offer(new Student(22,24));
        student.offer(new Student(42,154));



        while (!student.isEmpty()){
            System.out.println(student.poll());
        }

    }
}
class Student implements Comparable<Student>{

    int id;
    int testnots;

    public Student(int id, int testnots) {
        this.id = id;
        this.testnots = testnots;
    }

    @Override
    public int compareTo(Student o) {
        if (this.testnots > o.testnots){
            return 1;
        }else if(this.testnots < o.testnots){
            return -1;
        }else {

            return 0;
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", testnots=" + testnots +
                '}';
    }
}
