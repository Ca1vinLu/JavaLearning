package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {

    interface Paint {
        void paint();
    }

    static class RedPaint implements Paint {

        @Override
        public void paint() {
            System.out.println("Paint Red");
        }
    }

    static class ProxyBluePaint implements InvocationHandler {

        private Paint paint;

        public ProxyBluePaint(Paint paint) {
            this.paint = paint;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            Object result = null;
            System.out.println("call by proxy before");
            System.out.println("Paint Blue");
            result = method.invoke(paint, args);
            System.out.println("call by proxy after");

            return result;
        }
    }

    public static void main(String[] args) {
        Paint redPaint = new RedPaint();
        System.out.println(redPaint.getClass());
        Paint proxyPaint = (Paint) Proxy.newProxyInstance(Paint.class.getClassLoader(), new Class[]{Paint.class}, new ProxyBluePaint(redPaint));
        System.out.println(proxyPaint.getClass());
        proxyPaint = (Paint) Proxy.newProxyInstance(Paint.class.getClassLoader(), new Class[]{Paint.class}, new ProxyBluePaint(redPaint));
        System.out.println(proxyPaint.getClass());
        proxyPaint.paint();
    }
}
