package com;

import com.cglib.Producer;
import org.springframework.cglib.proxy.*;

import java.lang.reflect.Method;

public class Client {
    public static void main(String[] args) {
        final Producer producer=new Producer();



//       IProducer proxyProducer= (IProducer) Proxy.newProxyInstance(producer.getClass().getClassLoader(), producer.getClass().getInterfaces(), new InvocationHandler() {
//            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
//                Object returnValue=null;
//                Float money = (Float) objects[0];
//                if("saleProducer".equals(method.getName()))
//                {
//                   returnValue= method.invoke(producer,money*0.8);
//                }
//               return returnValue;
//            }
//        });

        Enhancer.create(producer.getClass(), new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                Object returnValue=null;
                Float money = (Float) objects[0];
                if("saleProducer".equals(method.getName()))
                {
                   returnValue= method.invoke(producer,money*0.8);
                }
               return returnValue;
            }
        });
        producer.saleProducer(10000f);
    }
}
