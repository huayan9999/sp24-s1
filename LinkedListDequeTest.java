
public class LinkedListDequeTest {


    public static boolean checkEmpty(boolean expected, boolean actual) {
        if (expected != actual) {
            System.out.println("isEmpty() returned " + actual + ", but expected: " + expected);
            return false;
        }
        return true;
    }

    public static boolean checkSize(int expected, int actual) {
        if (expected != actual) {
            System.out.println("size() returned " + actual + ", but expected: " + expected);
            return false;
        }
        return true;
    }

    public static void printTestStatus(boolean passed) {
        if (passed) {
            System.out.println("Test passed!\n");
        } else {
            System.out.println("Test failed!\n");
        }
    }


    public static void addIsEmptySizeGetTest() {
        System.out.println("Running add/isEmpty/Size test.");
        ArrayDeque<String> lld1 = new ArrayDeque<String>();


        boolean passed = checkEmpty(true, lld1.isEmpty());

        lld1.addFirst("front");
        String first = lld1.get(0);
        System.out.println("Get 0th: " + first);

        passed = checkSize(1, lld1.size()) && passed;
        passed = checkEmpty(false, lld1.isEmpty()) && passed;

        lld1.addLast("middle");
        passed = checkSize(2, lld1.size()) && passed;

        lld1.addLast("back");
        passed = checkSize(3, lld1.size()) && passed;
        String last = lld1.get(2);
        System.out.println("Get 2nd: " + last);
        System.out.println("Printing out deque: ");
        lld1.printDeque();

        lld1.addLast("1");
        lld1.addLast("2");
        lld1.addLast("3");
        lld1.addLast("1");
        lld1.addLast("2");
        lld1.addLast("3");
        printTestStatus(passed);

    }

    /** Adds an item, then removes an item, and ensures that dll is empty afterwards. */
    public static void addRemoveTest() {

        System.out.println("Running add/remove test.");
        ArrayDeque<Integer> lld1 = new ArrayDeque<Integer>();

        boolean passed = checkEmpty(true, lld1.isEmpty());

        lld1.addFirst(10);

        passed = checkEmpty(false, lld1.isEmpty()) && passed;

        lld1.removeFirst();

        passed = checkEmpty(true, lld1.isEmpty()) && passed;

        printTestStatus(passed);

    }

    public static void main(String[] args) {
        System.out.println("Running tests.\n");
        addIsEmptySizeGetTest();
        addRemoveTest();
    }
}
