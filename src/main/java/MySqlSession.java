import java.lang.reflect.Proxy;

/**
 * 模拟 sqlSession
 */
public class MySqlSession {
    public static Object getMapper(Class clazz){
        Class[] classes = new Class[]{clazz};
        Object object = Proxy.newProxyInstance(MySqlSession.class.getClassLoader(), classes, new MyInvocationHandler());
        return object;
    }
}
