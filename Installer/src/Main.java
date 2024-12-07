import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StringBuilder message = new StringBuilder();
        File dir1 = new File("C://Games");
        File dir2 = new File(dir1, "src");
        File dir3 = new File(dir1, "res");
        File dir4 = new File(dir1, "savegames");
        File dir5 = new File(dir1, "temp");
        File dir6 = new File(dir2, "main");
        File dir7 = new File(dir2, "test");
        File dir8 = new File(dir3, "drawables");
        File dir9 = new File(dir3, "vectors");
        File dir10 = new File(dir3, "icons");
        if (dir1.mkdir() == dir2.mkdir()
                == dir3.mkdir() == dir4.mkdir()
                == dir5.mkdir() == dir6.mkdir()
                == dir7.mkdir() == dir8.mkdir()
                == dir9.mkdir() == dir10.mkdir()) {
            message.append("Каталоги созданны \n");
        }
        File main = new File(dir6, "Main.java");
        try {
            if (main.createNewFile()) {
                message.append("Файл 'Main.java' установлен \n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        File utils = new File(dir6, "Utils.java");
        try {
            if (utils.createNewFile()) {
                message.append("Файл 'Utils.java' установлен \n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        File temp = new File(dir5, "temp.txt");
        try {
            if (temp.createNewFile()) {
                message.append("Файл 'temp.txt' создан \n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (FileWriter writer = new FileWriter(temp)) {
            String text = message.toString();
            writer.write(text);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Установка завершена");
    }
}