import java.io.FileOutputStream;
import java.io.IOException;

public class TempWriter {
    public static void writeTemp(StringBuilder message) {
        try (FileOutputStream fou = new FileOutputStream("C://dzz/temp/temp.txt")) {
            byte[] bytes = message.toString().getBytes();
            fou.write(bytes, 0, bytes.length);
        } catch (IOException io) {
            System.out.println("Ошибка в записи в 'temp.txt'");
        }
    }
}