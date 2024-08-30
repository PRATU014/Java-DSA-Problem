public class C_print_half_pyraid {
    public static void main(String[] args) {
        int num=1;
        for(int line=1;line<=5;line++){
            for(int number=1;number<=line;number++){

                System.out.print(num+ " ");
                num++;
            }
            System.out.println();
        }
    }
}
