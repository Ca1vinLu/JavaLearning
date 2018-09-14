package other;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class ReferenceTest {

    public static void main(String[] args) {
        SoftReference<Object> softReference = new SoftReference<>(new Object());
        WeakReference<Object> weakReference = new WeakReference<>(new Object());
        weakReference.get();
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        PhantomReference<Object> phantomReference = new PhantomReference<>(new Object(), referenceQueue);
        phantomReference.get();
    }
}
