import java.util.ArrayList;
import java.util.List;
 
public class Newspaper implements Subject {
     
    private List<Observer> observers = new ArrayList<>();
 
    @Override
    public void attach(Observer o) {
        observers.add(o);
    }
 
    @Override
    public void notifyUpdate(Message m) {
        for(Observer o: observers) {
            o.update(m);

            Schedule schedule = new ScheduleReleaseDecorator(new NoSchedule());
            schedule.addSchedule();
        }
    }
}