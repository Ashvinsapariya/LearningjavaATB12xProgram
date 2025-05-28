package ex_09_Switch;

public class Lan091_interview {

    public static void main(String[] args) {
//        long a11 = 30l;
//
//        switch ((int) a11)
//        {
//            case 1: {
//                System.out.println(" a1");
//                break;
//            }
//                case 11:
//                {
//                    System.out.println("a11");
//                    break;
//                }
//            default: {
//               System.out.println("No matching case");
//            }
//            }
//
//        }
        long a11 = 30L;

        switch ((int) a11) {
            case 1: {
                System.out.println("a1");
                break;
            }
            case 30: {
                System.out.println("a30");
                break;
            }
            default: {
                System.out.println("No matching case");
            }
        }
    }
}
