public class Performance {
    public static void main(String[] args) {

        int[] scores = {80, 75, 85};

        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }

        double average = (double) sum / scores.length;

        System.out.println("Technical Skills : " + scores[0]);
        System.out.println("Communication Skills : " + scores[1]);
        System.out.println("Teamwork : " + scores[2]);
        System.out.println("Average Performance Score : " + average);

        if (average >= 90) {
            System.out.println("Rating : Excellent");
        } else if (average >= 75) {
            System.out.println("Rating : Good");
        } else if (average >= 60) {
            System.out.println("Rating : Average");
        } else {
            System.out.println("Rating : Needs Improvement");
        }
    }
}