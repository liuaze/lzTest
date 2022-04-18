package com.example.demo.advanced;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 模拟内存溢出
 */
public class OOMDemo extends Demo{

    public static void test(){

    }

    //-Xss10m -Xsx10m 模拟栈溢出
    static void stackOverflowError() {
        stackOverflowError();
    }

    static class OOM {
    }

    ;

    public static void main(String[] args) {

        //栈溢出
        /*stackOverflowError();
        //-Xms10m  -Xmx10mm 模拟堆溢出
        byte[] bytes = new byte[11 * 1024 * 1024];*/
        //-Xms10m -Xmx10m -XX:MaxDirectMemorySize=5m  java.lang.OutOfMemoryError: GC overhead limit exceeded
        /*int i = 0;
        List<String> list = new ArrayList<>();
        try {
            while (true){
                list.add(String.valueOf(++i).intern());
            }
        } catch (Throwable e) {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+i);
            e.printStackTrace();
            throw e;
        }*/
        //java.lang.OutOfMemoryError: Direct buffer memory
        /*System.out.println("配置MaxDircetMemorySize,内存大小："+sun.misc.VM.maxDirectMemory()/(double)1024/1024);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(6 * 1024 * 1024);*/
        //-XX:MetaspaceSize=8m -XX:MaxMetaspaceSize=8m  java.lang.OutOfMemoryError-->Metaspace 元空间溢出
        int i = 0;
        try {
            while (true) {
                i++;
                Enhancer enhancer = new Enhancer();
                enhancer.setSuperclass(OOM.class);
                enhancer.setUseCache(false);
                enhancer.setCallback(new MethodInterceptor() {
                    @Override
                    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                        return methodProxy.invokeSuper(o, args);
                    }
                });
                enhancer.create();
            }
        } catch (Throwable e) {
            System.out.println("+++++++++:" + i);
            e.printStackTrace();
        }

    }

}
