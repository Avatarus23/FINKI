package aud2;

public class CombinationLock {
    private int combination;
    private boolean isOpen;
    private static int DEFAULT_COMBINATION = 100;

    public CombinationLock(int combination) {
        if (isCombinationValid(combination)) {
            this.combination = combination;
        } else {
            this.combination = DEFAULT_COMBINATION;
        }

        this.isOpen = false;
    }

    private boolean isCombinationValid(int combination) {
        return combination >= 100 && combination <= 999;
    }

    public boolean open(int combination) {
        this.isOpen = (this.combination == combination);
        return this.isOpen;
    }

    public boolean changeCombination(int oldCombination, int newCombination) {
        if (open(oldCombination) && isCombinationValid(newCombination)) {
            this.combination = newCombination;
            return true;
        } else {
            return false;
        }
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void lock() {
        this.isOpen = false;
    }

    public static void main(String[] args) {
        CombinationLock validLock = new CombinationLock(123);

        System.out.println("TEST IS OPEN");
        System.out.println(validLock.isOpen());

        System.out.println("TEST OPEN");
        System.out.println(validLock.open(234));
        System.out.println(validLock.open(345));
        System.out.println(validLock.open(567));
        System.out.println(validLock.open(123));

        validLock.lock();

        System.out.println("TEST CHANGE COMBINATION");
        System.out.println(validLock.changeCombination(123, 999));
        System.out.println(validLock.open(999));

        CombinationLock invalidLock = new CombinationLock(123456);

        System.out.println("TEST IS OPEN");
        System.out.println(invalidLock.isOpen());

        System.out.println("TEST OPEN");
        System.out.println(invalidLock.open(400));
        System.out.println(invalidLock.open(200));
        System.out.println(invalidLock.open(300));
        System.out.println(invalidLock.open(100));

        invalidLock.lock();

        System.out.println("TEST CHANGE COMBINATION");
        System.out.println(invalidLock.changeCombination(100, 900));
        System.out.println(invalidLock.open(900));
    }
}
