public class PrinterExtend <T extends Animal>{
    T toPrint;
    public PrinterExtend (T toPrint){
        this.toPrint = toPrint;
    }
    public void print(){
        toPrint.eat();
        //System.out.println(toPrint);
    }

}
