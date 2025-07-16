package map.ordenacaoMap;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EventsCalendar {
    Map<LocalDate, Event> eventMap;

    public EventsCalendar() {
        this.eventMap = new HashMap<>();
    }

    public void addEvent(LocalDate date,String name,String attraction){
        eventMap.put(date,new Event(name, attraction));
    }

    public void displayAgenda(){
        Map<LocalDate , Event> eventTreeMap = new TreeMap<>(eventMap);
        System.out.println(eventTreeMap);
    }

    public void getNextEvent(){
        Map<LocalDate , Event> eventTreeMap = new TreeMap<>(eventMap);
        LocalDate dateNow = LocalDate.now();
        LocalDate date;
        Event event;
        for (Map.Entry<LocalDate,Event> entry: eventTreeMap.entrySet()){
            if (entry.getKey().isEqual(dateNow) || entry.getKey().isAfter(dateNow)){
                date = entry.getKey();
                event = entry.getValue();
                System.out.println("Proximo evento e " + event + " no dia " + date);
            }
        }
    }
}
