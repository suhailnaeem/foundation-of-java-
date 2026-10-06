public class else_if_ladder {
    public static void main(String[] args) {
        int marks = 85;
        if (marks>=90){
            System.out.println("A++");
        }else if (marks>=80){
            System.out.println("A");
        }
        else if (marks>=70){
            System.out.println("b");
        }else if (marks>=40){

            System.out.println("c");
        }else {

            System.out.println("fail");
        }
    }
}
