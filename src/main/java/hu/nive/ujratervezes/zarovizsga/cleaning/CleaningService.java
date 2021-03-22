package hu.nive.ujratervezes.zarovizsga.cleaning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CleaningService {

    private List<Cleanable> items = new ArrayList<>();
    private Cleanable cleanable;

    public int cleanAll() {
        int costs = 0;
        List<Cleanable> forRemove = new ArrayList<>();
        for (Cleanable item : items){
            costs = costs + item.clean();
            forRemove.add(item);
        }
        items.removeAll(forRemove);
        return costs;
    }

    public int cleanOnlyOffices() {
        int costs = 0;
        List<Cleanable> forRemove = new ArrayList<>();
        for (Cleanable item : items) {
            if (item instanceof Office) {
                costs = costs + item.clean();
                forRemove.add(item);
            }
        }
            items.removeAll(forRemove);
            return costs;
    }

        public List<Cleanable> findByAddressPart (String s){
            List<Cleanable> sortedItems = new ArrayList<>();
            for (Cleanable item : items){
                if (item.getAddress().contains(s)){
                    sortedItems.add(item);
                }
            }
            return sortedItems;
        }

        public String getAddresses () {
            String totalAdr = "";
            StringBuilder sb = new StringBuilder();
            for (Cleanable item : items){
                sb.append(item.getAddress() + ", ");
            }
            totalAdr = sb.toString().trim();
            totalAdr = totalAdr.substring(0,totalAdr.length()-1);
            return totalAdr;
        }

        public void add(Cleanable cleanable){
            items.add(cleanable);
        }

        public List<Cleanable> getCleanables() {
        return items;
    }
}


