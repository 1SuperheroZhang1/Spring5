package com.atguigu.dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author superherozhang
 * @create 2022-10-01 17:44
 */
public class JDKProxy {
    public static void main(String[] args) {
        //创建接口代理类对象
        Class<?>[] interfaces={UserDao.class};
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new MyInvocationHandler(new UserDaoImpl()));
        int sum = dao.add(2, 3);
        System.out.println("result:"+sum);
        String value = dao.update("3");
        System.out.println(value);

    }
}

//创建代理对象代码
class MyInvocationHandler implements InvocationHandler{

    //1.把创建的是谁的代理对象，把谁传递过来 - 有参数构造传递
    private Object obj;
    public MyInvocationHandler(Object obj){
        this.obj=obj;
    }

    //2.增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法之前
        System.out.println("方法之前执行..."+method.getName()+":传递的参数..."+ Arrays.toString(args));

        //被增强的方法执行
        Object result = method.invoke(obj, args);

        //方法之后
        System.out.println("方法之后执行..."+obj);

        return result;
    }
}
