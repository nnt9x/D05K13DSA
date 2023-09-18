package adt;

public class HandleMessage implements Runnable {

    private QueueADT<Message> queueADT;

    public HandleMessage(QueueADT queueADT) {
        this.queueADT = queueADT;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(2000);
                // Lay tung msg -> xu ly
                if (!queueADT.isEmpty()) {
                    Message msg = queueADT.dequeue();
                    // Xu ly
                    System.out.println("Tin nhan:" + msg);
                    System.out.println(msg.getContent().toUpperCase());
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
