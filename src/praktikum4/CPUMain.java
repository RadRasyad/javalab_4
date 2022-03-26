package praktikum4;

public class CPUMain {

    public static void main(String[] args) {

        CPU cpu = new CPU();

        CPU.Processor processor = cpu.new Processor();
        CPU.RAM ram = cpu.new RAM();

        System.out.println("Processor Cache = "+processor.getCache());
        System.out.println("Ram Clock Speed = "+ram.getClockSpeed());
    }
}
