public class Student {

    int roll;
    String student_name;
    Batch enrolled_batch;

    Student () {
        this.roll = 0;
        this.student_name = "unknown";
        this.enrolled_batch = new Batch();
    }

    Student (
            int roll,
            String student_name,
            String batch_name,
            int batch_cost,
            String batch_topic
    ) {
        this.roll = roll;
        this.student_name = student_name;
        this.enrolled_batch = new Batch(batch_name, batch_cost, batch_topic);
    }

    void isStudying () {
        System.out.print(this.student_name +" "+ "is studying");
    }

}
