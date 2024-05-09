public class PriorityQueue {
    // arranging in less length string to high length string
    PriorityQueue<String>minHeap = new PriorityQueue<>((o1,o2) -> { 
        if(o1.length()==o2.length()){
         return o1.compareTo(o2);
        }
        return Integer.compare(o1.length(),o2.length());
    });
}
