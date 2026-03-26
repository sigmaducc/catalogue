package ds.queue;

import com.adnan.ds.queue.Queue;

public interface QueueFactory {

    <T> Queue<T> create();

}