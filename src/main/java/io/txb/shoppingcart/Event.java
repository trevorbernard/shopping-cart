package io.txb.shoppingcart;

import com.lmax.disruptor.EventHandler;

public class Event {

  public static EventHandler<Event> HANDLER = new EventHandler<Event>() {
    @Override
    public void onEvent(final Event event, final long sequence, final boolean endOfBatch)
        throws Exception {
      System.out.println("Sequence: " + sequence);
    }
  };
}
