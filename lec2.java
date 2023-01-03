import java.io.File;

import java.io.IOException;

import java.util.logging.*;

public class lec2 {
    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        //String str = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            //str += "+";
            sb.append("+");
        }
        System.out.println(System.currentTimeMillis() - s);
        //System.out.println(str);
        //System.out.println(sb);

        long ss = System.currentTimeMillis();
        //String str = "";
        StringBuilder sbs = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            //str += "+";
            sbs.append("+");
        }
        System.out.println(System.currentTimeMillis() - ss);
        //System.out.println(str);
        //System.out.println(sb);
        

        // Работа с файлами
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File f3 = new File(pathFile);
            System.out.println(f3.getAbsolutePath());
            // /Users/sk/vscode/java_projects/file.txt
            // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
       
        // Логирование

        // Использование
        // Logger logger = Logger.getLogger();

        // Уровни важности
        // INFO, DEBUG, ERROR, WARNING и др.

        //Вывод
        // ConsoleHandler info = new ConsoleHandler();
        // log.addHandler(info);

        // Формат вывода: структурированный, абы как*
        //XMLFormatter, SimpleFormatter
        Logger logger = Logger.getLogger(lec2.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
       //SimpleFormatter sFormat = new SimpleFormatter();
        XMLFormatter xml = new XMLFormatter();
        //ch.setFormatter(sFormat);
        ch.setFormatter(xml);
        logger.log(Level.WARNING, "Тестовое логирование");
        logger.info("Тестовое логирование");




    }
 
}
