public class quiz2 {

    public static void main(String[] args) {
//       앞에 ++붙는경우 1추가하면서 집어넣는다 뒤에 --붙는경우 값을 집어넣고나서 -1한다
        int x = 10; //x = 10
        int y = 20; //y = 20-1
        int z = (++x) + (y--); //(++x)=11 (y--)= 20
//        이식일때 x = 11;
//               y = 20-1
//                z = 11 + 20 이 되어 31이나오게된다
        System.out.println(z);
    }
}


