import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    /*
    1. Прочитайте про виды бинов.
    2. Создайте POJO-класс Cat.
    3. В классе AppConfig, по аналогии, создайте бин с именем “cat”.
    4. Настройте этот бин так, чтобы он создавался новым при каждом запросе.
    5. В классе App, по аналогии, вызовите еще раз бин HelloWorld, затем 2 раза вызовите бин cat. Сравните 2 пары бинов по ссылке и выведите результат в консоль. Для пары HelloWorld должно вернуться true, для cat - false. Так вы можете увидеть результат того, как работает наш контейнер.
    6. Раскомментируйте тестовый класс и проверьте своё решение.
     */
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat one = applicationContext.getBean(Cat.class);
        Cat two = applicationContext.getBean(Cat.class);

        System.out.println(one.equals(two));


    }
}