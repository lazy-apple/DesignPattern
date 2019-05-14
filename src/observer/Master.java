package observer;

import java.util.LinkedList;
import java.util.List;

/**消息发布者
 * @author LaZY(李志一)
 * @create 2019-05-14 21:16
 */
public class Master {
    List<observer> list = new LinkedList<observer>();

    private int status;

    public void regest(observer o){
        list.add(o);
    }

    public void notifyAllObs(){
        for (observer observer : list) {
            observer.update(this);
        }
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
        notifyAllObs();
    }
}
