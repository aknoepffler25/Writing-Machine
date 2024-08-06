package alex;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class App 
{
    public static void main( String[] args )
    {
        String broker = "ws://mqtt.hextronics.cloud:8083/mqtt";
        String topic = "hextech/hextech-alex/commands";
        String msg = "led.bl_off";

        // Credentials
        String username = "hextech-alex";
        String password = "alex";

        sendMqttCommand(broker, topic, username, password, msg);
        
    }

    public static void sendMqttCommand(String broker, String topic, String username, String password, String msg) {
        try {
            // Creates Connection
            MqttClient client = new MqttClient(broker, "demo_client");

            MqttConnectOptions options = new MqttConnectOptions();
            options.setUserName(username);
            options.setPassword(password.toCharArray());

            client.connect(options);

            if (client.isConnected()) {
                // Defines Functions Run At Specific States
                client.setCallback(new MqttCallback() {
                    public void messageArrived(String topic, MqttMessage message) throws Exception {
                        System.out.println("Topic: " + topic);
                        System.out.println("Command: " + new String(message.getPayload()));
                    }
                    
                    public void connectionLost(Throwable cause) {
                        System.out.println("connectionLost: " + cause.getMessage());
                    }
                    
                    public void deliveryComplete(IMqttDeliveryToken token) {
                        System.out.println("deliveryComplete: " + token.isComplete());
                    }
                });

                // Publishes Message
                MqttMessage message = new MqttMessage(msg.getBytes());
                message.setQos(1);
                client.publish(topic, message);
            }

            // Close Connection
            client.disconnect();
            client.close();
        }

        catch (MqttException e) {
            System.out.println(e);
        }
    }
}