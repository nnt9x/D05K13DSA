package adt;

import java.util.Random;

public class FakeMessage implements Runnable {

    private QueueADT<Message> queueADT;

    public FakeMessage(QueueADT queueADT) {
        this.queueADT = queueADT;
    }

    public String randomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 30;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
                Message msg = new Message();
                msg.setId(i);
                msg.setContent(randomString());
                queueADT.enqueue(msg);
                // Tao ra message
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Ket thuc tao fake message");
    }
}
