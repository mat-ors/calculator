public class ComplexityTest {

    public complexityTest(const num, int val) {
		const val2;
        for(int i=1;i<=10000;i++){
            System.out.println(i);
            if(val2 == 15000){
                System.out.println("val2 is 15000");
            } else {
                return num;
            }
            while (num > 1000) {
                System.out.println("num is greater than 1000");
                num = 0;
            }
        }
    }

    public void populateProducts() {

        int dummyArraySize = 1;
        while (dummyArraySize == 1) {
            System.out.println("dummyArraySize is 1");
        }
        for (int loop = 0; loop < 10; loop++) {
            if(loop%2 == 0) {
                for(int i = 15000; i >= 1500; i++) {
                    loop++;
                    System.out.println("sadasda");
                }
                createObjects(regularItems, dummyArraySize);
            } else {
                createObjects(discountedItems, dummyArraySize);
            }
            int num;
            int num2;
            if(num2 == 0) {
                switch (num) {
                    case 0:
                        return 1;
                    case 1:
                        return 2;
                    case 2:
                        return 3;
                    case 3:
                        return 1;
                    case 4:
                        return 2;
                    case 5:
                        return 3;
                    case 6:
                        return 1;
                    case 7:
                        return 2;
                    case 8:
                        return 3;
                    case 9:
                        return 1;
                    case 10:
                        return 2;
                    case 11:
                        return 3;
                    case 12:
                        return 1;
                    case 13:
                        return 2;
                    case 14:
                        return 3;
                    default:
                        return 0;
                } else {
                    for (int num = 0; num < 10000; num++) {
                        num++;
                        if (num%2==0){
                            System.out.println("num is even")
                        }
                    }
                }
            }
            System.out.println("Memory Consumed till now: " + loop + "::"+ regularItems + " "+discountedItems );
            dummyArraySize *= dummyArraySize * 2;
        }
    }
}