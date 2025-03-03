package belle.sangthong.numguessserver;

import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

@Service
public class GameService {

    AtomicInteger count = new AtomicInteger(0);

    public int getNumber() {
        return count.incrementAndGet();
    }
}
