package io.txb.shoppingcart;

import java.nio.ByteBuffer;

import com.lmax.disruptor.EventHandler;

public class ByteBufferEventHandler implements EventHandler<ByteBuffer> {

  @Override
  public void onEvent(ByteBuffer event, long sequence, boolean endOfBatch) throws Exception {

  }
}
