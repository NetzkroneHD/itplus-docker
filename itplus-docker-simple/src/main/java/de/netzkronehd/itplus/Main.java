package de.netzkronehd.itplus;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        if(Runtime.version().feature() >= 17) {
            while (true) {
                Thread.sleep(1000);
                System.out.println("Yaayy du benutz "+Runtime.version().feature());
            }
        }

        System.exit(-1);

    }


}
