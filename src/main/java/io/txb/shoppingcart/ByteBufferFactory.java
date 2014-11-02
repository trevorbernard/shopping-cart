package io.txb.shoppingcart;

import java.nio.ByteBuffer;

import com.lmax.disruptor.EventFactory;

public class ByteBufferFactory implements EventFactory<ByteBuffer> {
  private final int eventSize;
  private final boolean isDirect;

  public ByteBufferFactory(int eventSize, boolean isDirect) {
    this.eventSize = eventSize;
    this.isDirect = isDirect;
  }

  @Override
  public ByteBuffer newInstance() {
    if (isDirect) {
      return ByteBuffer.allocateDirect(eventSize);
    }
    return ByteBuffer.allocate(eventSize);
  }
}
