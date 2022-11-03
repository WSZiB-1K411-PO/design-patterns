package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /*SimpleSingleton.get().sayText();
        SimpleSingleton.get().setText("!!!!!!!");
        SimpleSingleton.get().sayText();

        Constructor<SimpleSingleton> constructor = SimpleSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        constructor.newInstance().sayText();*/

        Singleton.INSTANCE.sayText();
        Singleton.INSTANCE.setText("!!!!!!!");
        Singleton.INSTANCE.sayText();

        /*Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        constructor.newInstance().sayText();*/
    }
}
