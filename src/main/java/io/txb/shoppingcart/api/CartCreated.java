package io.txb.shoppingcart.api;

import java.nio.ByteBuffer;

public class CartCreated {
  private ByteBuffer byteBuffer;
  private String id;
  private long time;

  public CartCreated(ByteBuffer byteBuffer) {
    this.byteBuffer = byteBuffer;
  }

}
