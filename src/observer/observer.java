package observer;

/**观察者
 * @author LaZY(李志一)
 * @create 2019-05-14 21:17
 */
public class observer {
    private int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void update(Master master) {
        this.status = master.getStatus();
    }
}
