public class quiz3 {

    public static void main(String[] args) {

        System.out.println("시작!");
        while (true) {
            int a = (int) (Math.random() * 6) + 1; //소수를 정수를 바꾸기위해 int사용 0~5를 1~6을 만들기위해 1을 더한다.
            int b = (int) (Math.random() * 6) + 1;
            if (a + b !=5) {   //a+b가 5가아니라면
                System.out.printf("(%d, %d)\n", a, b); //(a,b)의 랜덤한값을 받아오는걸 지정하기위해 printf를 사용해서 불러온다.
            }
            if (a + b == 5) {  //a+b가 5라면
                System.out.printf("(%d, %d)\n", a, b);
                break;   //멈춤
            }
        }

        System.out.println("끝!");
    }
}
