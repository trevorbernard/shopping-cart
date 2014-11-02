package io.txb.shoppingcart.persistence;

import java.io.IOException;
import java.nio.ByteBuffer;

public interface Journaler {
  void persist(ByteBuffer buf) throws IOException;
}
