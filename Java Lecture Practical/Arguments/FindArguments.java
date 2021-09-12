public class FindArguments {
    public static void main(String[] args) {
        
        int length = args.length;

        for(int index = 0; index < length; index++) {

            System.out.print(args[index] + " ");
        }
        System.out.print("\nlength of the args" + length);
    }
}
