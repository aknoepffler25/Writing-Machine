package alex;

import java.util.concurrent.TimeUnit;

public class WritingMachine {

    static String broker = "ws://mqtt.hextronics.cloud:8083/mqtt";
    static String topic = "hextech/hextech-alex/commands";

    // Credentials
    static String username = "hextech-alex";
    static String password = "alex";

    public static void main( String[] args)
    {
    initializeCurrent();
    constant();










    }

    public static void initializeCurrent() {
        App.sendMqttCommand(broker, topic, username, password, "stepper.00_rms_600;stepper.01_rms_600;stepper.02_rms_600;stepper.03_rms_650;mos.01_duty_250");
    }
    
    public static void pushBack() {
        String part1 = "stepper.00_move_-1000; stepper.03_move_-1000|stepper.00_move_-1000; stepper.03_move_-1000|stepper.00_move_-1000; stepper.03_move_-1000";
        App.sendMqttCommand(broker, topic, username, password, part1);

    }
    public static void constant() {
        String part1 = "stepper.00_move_-10000000; stepper.03_move_-10000000";
        App.sendMqttCommand(broker, topic, username, password, part1);

    }


    public static void letters(String letter) {
        if (letter.equals("H")) {
            String part1 = "stepper.00_move_-1000; stepper.03_move_-1000|mos.01_on|stepper.01_move_-1000; stepper.02_move_-1000|stepper.01_move_1000; stepper.02_move_1000|stepper.01_move_1000; stepper.02_move_1000|mos.01_off|";
            String part2 = "stepper.01_move_-1000; stepper.02_move_-1000|mos.01_on|stepper.00_move_750; stepper.03_move_750|";
            String part3 = "stepper.01_move_-1000; stepper.02_move_-1000|stepper.01_move_1000; stepper.02_move_1000|stepper.01_move_1000; stepper.02_move_1000|mos.01_off|stepper.01_move_-1000; stepper.02_move_-1000";
            String part4 = "stepper.00_move_1000; stepper.03_move_1000|";
    
            try {
                App.sendMqttCommand(broker, topic, username, password, part1);
                TimeUnit.SECONDS.sleep(2);
                App.sendMqttCommand(broker, topic, username, password, part2);
                TimeUnit.SECONDS.sleep(2);
                App.sendMqttCommand(broker, topic, username, password, part3);
                TimeUnit.SECONDS.sleep(2);
                App.sendMqttCommand(broker, topic, username, password, part4);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        if (letter.equals("E")) {
            String part1 = "mos.01_on|\r\n" + //
                                "stepper.01_move_-1000; stepper.02_move_-1000|\r\n" + //
                                "stepper.01_move_1000; stepper.02_move_1000|";
            String part2 = "stepper.01_move_1000; stepper.02_move_1000|\r\n" + //
                                "stepper.01_move_-1000; stepper.02_move_-1000| mos.01_off|\r\n" + //
                                "stepper.01_move_-1000; stepper.02_move_-1000|";
            String part3 = "mos.01_on|stepper.00_move_1000; stepper.03_move_1000|stepper.00_move_-1000; stepper.03_move_-1000|mos.01_off|stepper.01_move_1000; stepper.02_move_1000|";
            String part4 = "mos.01_on|stepper.00_move_500; stepper.03_move_500|stepper.00_move_-500; stepper.03_move_-500|mos.01_off|";
            String part5 = "stepper.01_move_1000; stepper.02_move_1000|mos.01_on|stepper.00_move_1000; stepper.03_move_1000|stepper.00_move_-1000; stepper.03_move_-1000|mos.01_off|";
            String part6 ="stepper.01_move_-1000; stepper.02_move_-1000|stepper.00_move_1000; stepper.03_move_1000|stepper.00_move_1000; stepper.03_move_1000|";                  
    
            try {
                App.sendMqttCommand(broker, topic, username, password, part1);
                TimeUnit.SECONDS.sleep(2);
                App.sendMqttCommand(broker, topic, username, password, part2);
                TimeUnit.SECONDS.sleep(2);
                App.sendMqttCommand(broker, topic, username, password, part3);
                TimeUnit.SECONDS.sleep(2);
                App.sendMqttCommand(broker, topic, username, password, part4);
                TimeUnit.SECONDS.sleep(2);
                App.sendMqttCommand(broker, topic, username, password, part5);
                TimeUnit.SECONDS.sleep(2);
                App.sendMqttCommand(broker, topic, username, password, part6);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        if (letter.equals("L")) {
            String part1 = "mos.01_on|stepper.01_move_-1000; stepper.02_move_-1000|stepper.01_move_1000; stepper.02_move_1000|";
            String part2 = "stepper.01_move_1000; stepper.02_move_1000|stepper.01_move_-1000; stepper.02_move_-1000| mos.01_off|stepper.01_move_1000; stepper.02_move_1000|";
            String part3 = "mos.01_on|stepper.00_move_1000; stepper.03_move_1000|stepper.00_move_-1000; stepper.03_move_-1000| mos.01_off|";
            String part4 = "stepper.01_move_-1000; stepper.02_move_-1000|stepper.00_move_1000; stepper.03_move_1000|stepper.00_move_1000; stepper.03_move_1000|";
            
            try {
                App.sendMqttCommand(broker, topic, username, password, part1);
                TimeUnit.SECONDS.sleep(2);
                App.sendMqttCommand(broker, topic, username, password, part2);
                TimeUnit.SECONDS.sleep(2);
                App.sendMqttCommand(broker, topic, username, password, part3);
                TimeUnit.SECONDS.sleep(2);
                App.sendMqttCommand(broker, topic, username, password, part4);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        if (letter.equals("O")) {
            String part1 = "stepper.01_move_-1000; stepper.02_move_-1000|mos.01_on|stepper.00_move_1000; stepper.03_move_1000; stepper.01_move_1000; stepper.02_move_1000|";
            String part2 = "stepper.00_move_-1000; stepper.03_move_-1000; stepper.01_move_1000; stepper.02_move_1000|stepper.00_move_-1000; stepper.03_move_-1000; stepper.01_move_-1000; stepper.02_move_-1000|";
            String part3 = "stepper.00_move_1000; stepper.03_move_1000; stepper.01_move_-1000; stepper.02_move_-1000|mos.01_off|";
            String part4 = "stepper.00_move_1000; stepper.03_move_1000|stepper.01_move_1000; stepper.02_move_1000|stepper.00_move_1000; stepper.03_move_1000";
            
    
            try {
                App.sendMqttCommand(broker, topic, username, password, part1);
                TimeUnit.SECONDS.sleep(2);
                App.sendMqttCommand(broker, topic, username, password, part2);
                TimeUnit.SECONDS.sleep(2);
                App.sendMqttCommand(broker, topic, username, password, part3);
                TimeUnit.SECONDS.sleep(2);
                App.sendMqttCommand(broker, topic, username, password, part4);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
         if (letter.equals("W")) {
            String part1 = "mos.01_on|stepper.00_move_500; stepper.03_move_500; stepper.01_move_1000; stepper.02_move_1000|stepper.00_move_500; stepper.03_move_500; stepper.01_move_-1000; stepper.02_move_-1000|";
            String part2 = "stepper.00_move_500; stepper.03_move_500; stepper.01_move_1000; stepper.02_move_1000|stepper.00_move_500; stepper.03_move_500; stepper.01_move_-1000; stepper.02_move_-1000|";
            String part3 = "mos.01_off|stepper.01_move_1000; stepper.02_move_1000|stepper.00_move_1000; stepper.03_move_1000|";
            
            try {
                App.sendMqttCommand(broker, topic, username, password, part1);
                TimeUnit.SECONDS.sleep(2);
                App.sendMqttCommand(broker, topic, username, password, part2);
                TimeUnit.SECONDS.sleep(2);
                App.sendMqttCommand(broker, topic, username, password, part3);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        if (letter.equals("R")) {
            String part1 = "mos.01_on|stepper.01_move_-1000; stepper.02_move_-1000|stepper.01_move_-1000; stepper.02_move_-1000|mos.01_off|";
            String part2 = "mos.01_on|stepper.00_move_500; stepper.03_move_500; stepper.01_move_500; stepper.02_move_500|mos.01_off|stepper.00_move_-500; stepper.03_move_-500; stepper.01_move_-500; stepper.02_move_-500|";
            String part3 = "stepper.01_move_1000; stepper.02_move_1000|mos.01_on|stepper.00_move_500; stepper.03_move_500; stepper.01_move_-500; stepper.02_move_-500|mos.01_off|";
            String part4 = "stepper.00_move_-500; stepper.03_move_-500; stepper.01_move_500; stepper.02_move_500|mos.01_on|stepper.00_move_500; stepper.03_move_500; stepper.01_move_500; stepper.02_move_500|";
            String part5 = "stepper.00_move_500; stepper.03_move_500; stepper.01_move_500; stepper.02_move_500|mos.01_off|stepper.01_move_-1000; stepper.02_move_-1000|stepper.00_move_1000; stepper.03_move_1000|";
            
            try {
                App.sendMqttCommand(broker, topic, username, password, part1);
                TimeUnit.SECONDS.sleep(2);
                App.sendMqttCommand(broker, topic, username, password, part2);
                TimeUnit.SECONDS.sleep(2);
                App.sendMqttCommand(broker, topic, username, password, part3);
                TimeUnit.SECONDS.sleep(2);
                App.sendMqttCommand(broker, topic, username, password, part4);
                TimeUnit.SECONDS.sleep(2);
                App.sendMqttCommand(broker, topic, username, password, part5);
           
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        if (letter.equals("D")) {
            String part1 = "stepper.01_move_1000; stepper.02_move_1000|mos.01_on|stepper.01_move_-1000; stepper.02_move_-1000|";
            String part2 = "stepper.01_move_-1000; stepper.02_move_-1000|mos.01_off|mos.01_on|";
            String part3 = "stepper.00_move_500; stepper.03_move_500; stepper.01_move_500; stepper.02_move_500|stepper.00_move_500; stepper.03_move_500; stepper.01_move_500; stepper.02_move_500|";
            String part4 = "stepper.00_move_-500; stepper.03_move_-500; stepper.01_move_500; stepper.02_move_500|stepper.00_move_-500; stepper.03_move_-500; stepper.01_move_500; stepper.02_move_500|mos.01_off|";
            String part5 = "stepper.01_move_-1000; stepper.02_move_-1000|stepper.00_move_1000; stepper.03_move_1000|stepper.00_move_1000; stepper.03_move_1000|";
            
            try {
                App.sendMqttCommand(broker, topic, username, password, part1);
                TimeUnit.SECONDS.sleep(2);
                App.sendMqttCommand(broker, topic, username, password, part2);
                TimeUnit.SECONDS.sleep(2);
                App.sendMqttCommand(broker, topic, username, password, part3);
                TimeUnit.SECONDS.sleep(2);
                App.sendMqttCommand(broker, topic, username, password, part4);
                TimeUnit.SECONDS.sleep(2);
                App.sendMqttCommand(broker, topic, username, password, part5);
           
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }
}
