public class GenericsExample {

    private static <T> void shout(T toShout){
        System.out.println(toShout + "!!!!");
    }

    private static <T,V> void twoShout(T oneShout, V twoShout){
        System.out.println(oneShout + "1st shout" + "..." + twoShout + "2nd shout");
    }

    private static <T,V> T returnShout(T oneShout, V twoShout){
        System.out.println(oneShout + "!!!!");
        System.out.println(twoShout + "!!!!");
        return oneShout;
    }

    public static void main(String[] args) {
//        IntegerPrinter integerPrinter = new IntegerPrinter(23);
//        integerPrinter.print();
//        Printer<Integer> printer = new Printer<>(23);
//        printer.print();
//        Printer<Double> doublePrinter = new Printer<>(33.5);
//        doublePrinter.print();
        PrinterExtend<Animal> printerExtend = new PrinterExtend<>(new Animal());
        printerExtend.print();
        shout("Phuc");
        shout(123);
        shout(44.55);
        twoShout("Phuc", 123);

    }
}
