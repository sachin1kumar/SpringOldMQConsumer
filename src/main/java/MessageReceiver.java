import java.util.concurrent.CountDownLatch;

public class MessageReceiver
{
    private CountDownLatch countDownLatch = new CountDownLatch(1);

    public void receiveMsg(Product product)
    {
        System.out.println("product object is Received: " + product);
        countDownLatch.countDown();
    }

    public CountDownLatch getCountDownLatch()
    {
        return countDownLatch;
    }
}