import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.TimeUnit;

public class MessageConsumerApp
{
    final static String queueName = "message_queue";

    public static void main(String[] args) throws InterruptedException
    {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(RabbitMQConfig.class);
        MessageReceiver receiver = (MessageReceiver) ctx.getBean("receiver");
        receiver.getCountDownLatch().await(200000, TimeUnit.SECONDS);
    }
}