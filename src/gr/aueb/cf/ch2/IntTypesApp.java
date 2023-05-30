package gr.aueb.cf.ch2;

public class IntTypesApp {
    /**
     * Εμφανίζει τους τύπους δεδομένων
     * ακεραίων, το μέγεθος και τα ΜΙΝ MAX values
     */
    public static void main(String[] args) {
        System.out.printf("Type: %s,Size: %d bits, Min: %,d,Max: %,d\n",
                Integer.TYPE,Integer.BYTES *8, Integer.MIN_VALUE,Integer.MAX_VALUE);
        System.out.printf("Type: %s,Size: %d bits, Min: %d,Max: %d\n",
                Byte.TYPE,Byte.BYTES *8, Byte.MIN_VALUE,Byte.MAX_VALUE);
        System.out.printf("Type: %s,Size bits: %d, Min: %d,Max: %d\n",
                Short.TYPE,Byte.BYTES *8, Short.MIN_VALUE,Short.MAX_VALUE);
        System.out.printf("Type: %s,Size: %d bits, Min: %,d,Max: %,d\n",
                Long.TYPE,Byte.BYTES *8, Long.MIN_VALUE,Long.MAX_VALUE);

    }
}
