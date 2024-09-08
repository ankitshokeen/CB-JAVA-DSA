public class Batch {
    String batch_name;
    int cost;
    String topic;

    Batch () {
        this.batch_name = "default_branch";
        this.cost = 80000;
        String topic = "java";
    }

    Batch (
            String batch_name,
            int cost,
            String topic
    ) {
        this.batch_name = batch_name;
        this.cost = cost;
        this.topic = topic;
    }
}
