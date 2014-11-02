package io.txb.shoppingcart;

import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.lmax.disruptor.dsl.Disruptor;

public class Application {
  public static void main(String[] args) {
    ExecutorService executor = Executors.newCachedThreadPool();
    Disruptor<ByteBuffer> disruptor =
        new Disruptor<ByteBuffer>(new ByteBufferFactory(4 * 1024, true), 1024 * 1024, executor);
  }
}
