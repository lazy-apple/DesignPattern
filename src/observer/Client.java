package observer;

/**观察者模式：消息发布
 * 目标对象的状态改变后，所有观察者的状态随之改变
 *
 * @author LaZY(李志一)
 * @create 2019-05-14 21:14
 */
public class Client {
    public static void main(String[] args) {
        Master master = new Master();

        observer o1 = new observer();
        observer o2 = new observer();
        observer o3 = new observer();
        observer o4 = new observer();

        master.regest(o1);
        master.regest(o2);
        master.regest(o3);
        master.regest(o4);

        o1.setStatus(3);
        System.out.println("o1:status:"+o1.getStatus());

        master.setStatus(5);
        System.out.println("o1:status:"+o1.getStatus());
    }
}
